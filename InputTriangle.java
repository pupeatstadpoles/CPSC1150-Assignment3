
/**
 * Program Name: InputTriangle
 * Author: Pup Abdulgapul
 * Student ID: 100362791
 * Date: Oct 1, 2022
 * Course: CPSC1150-03
 * Professor: Hengameh Hamavand
 */

import java.util.Scanner;




// Program to print a triangle of digits based on the integer input by the user
public class InputTriangle {
    public static void main(String[] args) {
        int count, counter, i, num;
        boolean invalid;
        Scanner input = new Scanner(System.in);

        System.out.println("This program will print out a triangle based on your input.\nPlease enter a number between 1-9: ");
        num = input.nextInt();
        invalid = true;

        // validating input
        while (invalid) {
            while (num > 9 || num < 1) {
                System.out.println("Error: Invalid input. Integer cannot be less than 1 or greater than 9! \n Please enter a number between 1-9: ");
                num = input.nextInt(); // should keep prompting until 1<num<9
            }
            invalid = false;
        }

        {
            for (i = 1; i <= num; i++) { // while i<number, run this loop
                counter = 1;
                System.out.println(); // new line w/ every iteration
                for (count = num; count > i; count--) { // print spaces equivalent to num-1 in order to align numbers
                    System.out.print(" ");
                }
                while (counter <= i) { // prints numbers from 1 - i
                    System.out.print(counter);
                    counter++;
                }
            }

        }

    }

}
