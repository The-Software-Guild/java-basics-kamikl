package org.c130.javabasics;

public class SummativeSums {

    public static void main(String[] args) {
        //Print out sums for the 3 arrays given
        System.out.print("#1: ");
        arraySum(new int[]{1, 90, -33, -55, 67, -16, 28, -55, 15});
        System.out.print("#2: ");
        arraySum(new int[]{ 999, -60, -77, 14, 160, 301 });
        System.out.print("#3: ");
        arraySum(new int[]{ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                140, 150, 160, 170, 180, 190, 200, -99 } );
    }

    public static void arraySum(int[] intArray) {
        //Initialise sum variable
        int sum = 0;
        //For each integer in the array, add to sum variable
        for(int i: intArray) {
            sum+=i;
        }
        //Display total sum
        System.out.println("Array Sum: " +sum);
    }
}
