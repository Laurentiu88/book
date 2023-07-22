import java.util.Scanner;

public class BodyMassindex {
    public static void main(String[] args) {
        int height = 170; // in cm
        float weight = 71; // in kg
        // Math.pow
        float bmi = weight / (height * height) * 10000;
        System.out.println("Your BMI is " + bmi);
        BodyMassindex.interpretBMI(bmi);
        // get value from keyboard
        Scanner Scanner = new Scanner(System.in);
        int heightScan = Scanner.nextInt();
        float weightScan = Scanner.nextFloat();
        int heightSquared = (int) Math.pow(heightScan, 2);
        System.out.println("heightSquared is " + heightSquared);
        float calculateBmi = weightScan / heightSquared  * 10000;
        System.out.println("Your BMI is " + calculateBmi);
        interpretBMI(calculateBmi);
    }
    public static void interpretBMI(float bmi) {
        if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Bmi is good");
        } else {
            System.out.println("bmi is not good");
        }
    }
}