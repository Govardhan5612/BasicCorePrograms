package com.bridgelabz;

import java.util.Scanner;

/**
 * @GovardhanReddy
 */

public class SwapTwoNumbers {
    /**
     * @param firstNumber
     * @param secondNumber
     */
    public static void swapTwoNumbers(int firstNumber, int secondNumber){
        /**
         * use swapTwoNumbers method swap twp numbers
         */
        System.out.println("Before swapping : ");
        System.out.println("First Number : "+firstNumber);
        System.out.println("Second Number : "+secondNumber);
        int duplicateNumber = firstNumber;
        firstNumber = secondNumber;
        secondNumber=duplicateNumber;

        System.out.println("After swapping : ");
        System.out.println("First Number : "+firstNumber);
        System.out.println("Second Number : "+secondNumber);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number : ");
        int secondNumber = input.nextInt();
        swapTwoNumbers(firstNumber,secondNumber);
    }
}
