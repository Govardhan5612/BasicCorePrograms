package com.bridgelabz;

import java.util.Scanner;

/**
 * @GovardhanReddy
 */

public class CheckNumberIsEvenOrOdd {
    /**
     * @param number is even or odd
     */
    public static void evenOrOdd(int number){
        /**
         * check weather number is even or odd
         */
        if (number%2==0){
            System.out.println(number+" is even number");
        }
        else {
            System.out.println(number+" is odd number");
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        evenOrOdd(number);
    }
}
