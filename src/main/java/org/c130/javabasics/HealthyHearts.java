package org.c130.javabasics;
//Import necessary package
import java.util.Scanner;

public class HealthyHearts {

    public static void main(String[] args) {
        //Initialise Scanner object
        Scanner inputReader = new Scanner(System.in);
        //Prompt user for age
        System.out.println("What is your age?");
        int age = inputReader.nextInt();
        //Calculate maximum heart rate (220-age)
        int maxHr = 220-age;

        //Display maximum heart rate
        System.out.println("Your maximum heart rate should be "+ maxHr + " beats per minute");
        //Calculate and display target heart rate zone (50%-85% of max)
        System.out.println("Your target HR Zone is "+(maxHr/2)+" - "+(maxHr*0.85)+" beats per minute");

    }
}
