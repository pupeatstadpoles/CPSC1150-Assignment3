
/**
 * Program Name: InputSquares
 * Author: Pup Abdulgapul
 * Student ID: 100362791
 * Date: Oct 1, 2022
 * Course: CPSC1150-03
 * Professor: Hengameh Hamavand
 */

import java.util.Scanner;

public class InputSquares {
    //Program to print out all the perfect squares in a series of integers given a user input.
    public static void main(String[] args) {
        int num, i, square;
        boolean invalid;

        Scanner input = new Scanner(System.in);

        System.out.println(
                "This program will print out all the squares for the first n numbers.\n Please enter a postive integer from 1-200.");
        num = input.nextInt();
        invalid = true;

        while (invalid) {
            while (num < 1 || num > 200) { // check for valid input
                System.out.println("Error: Invalid number. Number entered must be from 1-200!\n Please enter a positive integer from 1-200");
                num = input.nextInt(); // should keep prompting user until 1<=num<=200
            }
            invalid = false; // false to get out of the loop
        }

        { // run if input is valid (invalid = false)
            System.out.println("These are all the squares for the first " + num + "numbers:\n");
            for (i = 1; i <= num; i++) { //starts at 1 because 1 is the first perfect square
                square = i * i;
                if (square <= num) { // prints the perfect squares
                    System.out.print(square + "\t");
                }
            }
        }
    }

}
