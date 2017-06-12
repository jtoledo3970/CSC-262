import java.util.Scanner;


public class BMICalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int CONVERSION_FACTOR = 703;
        int weight_in_pounds, height_in_inches;
        double BMI;
        System.out.println("Enter your weight in pounds: ");
        weight_in_pounds = keyboard.nextInt();
        System.out.println("Enter your height in inches: ");
        height_in_inches = keyboard.nextInt();
        BMI = (double)(weight_in_pounds*CONVERSION_FACTOR)/(height_in_inches*height_in_inches);
        String indResult;
        if (BMI < 18.5) {
            indResult = "Underweight";
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            indResult = "Normal";
        } else if (BMI >= 25 && BMI <= 29.9) {
            indResult = "Overweight";
        } else {
            indResult = "Obese";
        }
        System.out.println("BMI Result: " +BMI);
        System.out.println("Department of Health and Human Services/National Institute of Health");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("| BMI Values                                                       |");
        System.out.println("| Underweight: less than 18.5                                      |");
        System.out.println("| Normal:      between 18.5 and 24.9                               |");
        System.out.println("| Overweight:  between 25 and 29.9                                 |");
        System.out.println("| Obese:       30 or greater                                       |");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Your individual result by this chart: " + indResult);
    }
}
