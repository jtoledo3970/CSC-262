package vehicle;

class Vehicle {
    private String name;
    private double maxSpeed;
    
    public Vehicle() {
        name = "";
        maxSpeed = 0;
    }
    
    public Vehicle(String name, double maxSpeed) {
        setName(name);
        setMaxSpeed(maxSpeed);
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    public String getName() {
        return name;
    }
    
    public double getMaxSpeed() {
        return maxSpeed;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + "\nMax Speed: " + maxSpeed + " MPH";
    }
}

class Car extends Vehicle {
    private int number_of_cylinders;
    
    public Car() {
        super("",0);
        setCylinders(0);
    }
    
    public Car(String name, double maxSpeed, int number_of_cylinders) {
        super(name, maxSpeed);
        setCylinders(number_of_cylinders);
    }
    
    public void setCylinders(int number_of_cylinders) {
        this.number_of_cylinders = number_of_cylinders;
    }
    
    public int getCylinders() {
        return number_of_cylinders;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nNumber of Cylinders: " + number_of_cylinders;
    }
}

class Airplane extends Vehicle {
    private int number_of_engines;
    
    public Airplane() {
        super("", 0);
        setEngines(0);
    }
    
    public Airplane(String name, double maxSpeed, int number_of_engines) {
        super(name, maxSpeed);
        setEngines(number_of_engines);
    }
    
    public void setEngines(int number_of_engines) {
        this.number_of_engines = number_of_engines;
    }
    
    public int getEngines() {
        return number_of_engines;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nNumber of Engines: " + number_of_engines;
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
       Car car=new Car();
       car.setName("Tesla Model S");
       car.setMaxSpeed(155);
       car.setCylinders(0);
      
       //Create an instance of Airplane
       Airplane airplane=new Airplane();
       airplane.setName("McDonnell Douglas F-15 Eagle");
       airplane.setMaxSpeed(1875);
       airplane.setEngines(2);
      
      
       if(car.getMaxSpeed()>airplane.getMaxSpeed()) {
           System.out.printf("%10s's top speed is greater than the %10s's speed\n", car.getName(), airplane.getName());
       } else {
           System.out.printf("%10s's top speed is greater than the %10s's speed\n", airplane.getName(), car.getName()); 
       }
      
       System.out.println("\nCar details");
       System.out.println(car.toString());
      
       System.out.println("\nAirplane details");
       System.out.println(airplane.toString());
    }
}
