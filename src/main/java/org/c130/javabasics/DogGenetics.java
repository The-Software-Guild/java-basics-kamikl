package org.c130.javabasics;//Import necessary packages
import java.util.Scanner;
import java.util.Random;

public class DogGenetics {

    public static void main(String[] args) {
        //Initialise random and scanner objects
        Random random = new Random();
        Scanner readerInput = new Scanner(System.in);
        //Initialise breed % variables
        int breed1, breed2, breed3, breed4, breed5;

        //Prompt for dog name
        System.out.println("What's your dogs name?");
        String dogName = readerInput.nextLine();

        //Generate some random numbers for the different breeds
        breed1 = random.nextInt(96) + 1;
        breed2 = random.nextInt(97-breed1) + 1;
        breed3 = random.nextInt(98-breed1-breed2) + 1;
        breed4 = random.nextInt(99-breed1-breed2-breed3) + 1;
        breed5 = 100 - breed1 - breed2 - breed3 - breed4;

        //Display breed percentages to user
        System.out.println("Here's the report on your dog:");
        System.out.println(dogName + " is:");
        System.out.println();
        System.out.println(breed1+"% St. Bernard");
        System.out.println(breed2+"% Chihuahua");
        System.out.println(breed3+"% Dramatic RedNosed Asian Pug");
        System.out.println(breed4+"% Common Cur");
        System.out.println(breed5+"% King Doberman");
        System.out.println("Wow, that's QUITE the dog!");

    }

}
