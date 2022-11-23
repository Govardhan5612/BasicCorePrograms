package com.bridgelabz;

import java.util.Scanner;

/**
 *
 * @ Govardhan Reddy
 */
public class QuotientAndRemainder {
    /**
     * @param dividend
     * @param divisor
     */
    public static void quotientRemainder(double dividend,double divisor){
        /**
         *
         * fins the Quotient and Remainder
         */
        double quotient = dividend/divisor;
        double remainder = dividend%divisor;
        System.out.println("Quotient is : "+quotient);
        System.out.println("Remainder is : "+remainder);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Dividend number : ");
        double dividend = input.nextInt();
        System.out.print("Enter the Dividend number : ");
        double divisor = input.nextInt();
        quotientRemainder(dividend,divisor);
    }
}
