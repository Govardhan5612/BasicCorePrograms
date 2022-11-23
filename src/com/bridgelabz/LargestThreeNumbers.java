package com.bridgelabz;

import java.util.Scanner;

/**
 * @GovardhanReddy
 */

public class LargestThreeNumbers {
    /**
     *
     * @param firstNumber
     * @param secondNumber
     * @param thirdNumber
     * find the largest number
     */
    public static void largestNumber(int firstNumber, int secondNumber, int thirdNumber){
        /**
         * find largest number among three numbers
         */
        if (firstNumber>secondNumber && firstNumber>thirdNumber){
            System.out.println(firstNumber+" is greatest number");
        } else if (secondNumber>firstNumber && secondNumber>thirdNumber) {
            System.out.println(secondNumber+" is greatest number");
        } else if (thirdNumber>firstNumber && thirdNumber>secondNumber) {
            System.out.println(thirdNumber+" is greatest number");
        } else if (firstNumber==secondNumber && firstNumber==thirdNumber) {
            System.out.println("All the number are equal ");
        }else {
            System.out.println("Enter the different numbers");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second number : ");
        int secondNumber = input.nextInt();
        System.out.println("Enter the third number : ");
        int thirdNumber = input.nextInt();
        largestNumber(firstNumber,secondNumber,thirdNumber);
    }
}
