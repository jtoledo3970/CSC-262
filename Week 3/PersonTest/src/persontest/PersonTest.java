package persontest;

import java.util.GregorianCalendar;

class Person {
    private String name, address, phoneNumber, emailAddress;
    public Person() {
        this.name = " ";
        this.address = " ";
        this.phoneNumber = " ";
        this.emailAddress = " ";
    }
    
    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phone;
        this.emailAddress = email;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getPhone() {
        return phoneNumber;
    }
    
    public String getEmail() {
        return emailAddress;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setPhone(String phone) {
        this.phoneNumber = phone;
    }
    
    public void setEmail(String email) {
        this.emailAddress = email;
    }
    
    @Override
    public String toString() {
        return "\nName: " + name + "\nAddress: " + address +  "\nPhone Number: " + phoneNumber + "\nEmail Address: " + emailAddress;
    }
}

class Student extends Person {
    private int status;
    private final static int FRESHMAN = 1;
    private final static int SOPHOMORE = 2;
    private final static int JUNIOR = 3;
    private final static int SENIOR = 4;
    
    public Student(String name, String address, String phone, String email, int status) {
        super(name, address, phone, email);
        this.status = status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }
    
    public String getStatus() {
        switch(status) {
            case 1:
                return "Freshman";
            case 2:
                return "Sophomore";
            case 3:
                return "Junior";
            case 4:
                return "Senior";
            default:
                return "Unk";
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nStatus: " + getStatus();
    }
}

class Employee extends Person {
    private int office;
    private double salary;
    private MyDate dateHired;
    
    public Employee(String name, String address, String phone, String email, int office, double salary) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = new MyDate();
    }
    
    public int getOffice() {
        return office;
    }
    
    public String getSalary() {
        return String.format("$%.2f", salary);
    }
    
    public String getDateHired() {
        return dateHired.getMonth() + "/" + dateHired.getDay() + "/" + dateHired.getYear();
    }
    
    public void setOffice(int office) {
        this.office = office;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void setDateHired() {
        dateHired = new MyDate();
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nOffice: " + office +"\nSalary: " + getSalary() + "\nDate Hired: " + getDateHired();
    }
}

class Faculty extends Employee {
    private String officeHours, rank;
    
    public Faculty(String name, String address, String phone, String email, int office, double salary, String officeHours, String rank) {
        super(name, address, phone, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    
    public String getOfficeHours() {
        return officeHours;
    }
    
    public String getRank() {
        return rank;
    }
    
    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }
    
    public void setRank(String rank) {
        this.rank = rank;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nOffice Hours: " + officeHours + "\nRank: " + rank;
    }
}

class Staff extends Employee {
    private String title;
    
    public Staff(String name, String address, String phone, String email, int office, double salary, String title) {
        super(name, address, phone, email, office, salary);
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nTitle: " + title;
    }
}

class MyDate {
    private int day, month, year;
    
    MyDate() {
        GregorianCalendar cal = new GregorianCalendar();
        day = cal.get(GregorianCalendar.DAY_OF_MONTH);
        month = cal.get(GregorianCalendar.MONTH);
        year = cal.get(GregorianCalendar.YEAR);
    }
    
    MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }
    
    MyDate(int day, int month, int year) {
        this.day = day; 
        this.month = month;
        this.year = year;
    }
    
    public String getDay() {
        String d = String.valueOf(day);
        return (day < 10 ? "0" + d : d);
    }
    
    public String getMonth() {
        String m = String.valueOf(month + 1);
        return (month < 10 ? "0" + m : m);
    }
    
    public int getYear() {
        return year;
    }
    
    public void setDate(long elapsedTime) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(elapsedTime);
	month = cal.get(GregorianCalendar.MONTH);
	day = cal.get(GregorianCalendar.DAY_OF_MONTH);
        year = cal.get(GregorianCalendar.YEAR);
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("John", "1234 A St", "5555555555", "test@person.com");
        Student student = new Student("Jacob", "5678 B St", "5555555555", "test@student.com", 2);
        Employee employee = new Employee("Jingle", "0910 C St", "5555555555", "test@employee.com", 421, 82000);
        Faculty faculty = new Faculty("Himmer", "1112 D St", "555555555", "test@faculty.com", 530, 62000, "1800 - 2200", "Mr. Doctor, Professor");
        Staff staff = new Staff("Schmidt", "1314 E St", "5555555555", "test@staff.com", 1215, 89000, "Sanitation Engineer");
        
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
