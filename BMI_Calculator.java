package dsjavatraining;

import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scn.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scn.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi + "kg/m2");

    }
}
