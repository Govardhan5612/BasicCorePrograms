package com.bridgelabz;

import java.util.Scanner;

/**
 *
 * @Govardhan Reddy
 *
 */
public class LeapYear {
    /**
     *
     * Find the input year is leap year or not
     *
     */
    public static void leapYearOrNot(int year){
        /**
         * use leapYearOrNot method print year is leap year or not
         *
         */
        if (year%400==0){
            System.out.println(year+" is leap year");
        } else if (year%4==0 && year%100!=0) {
            System.out.println(year+" is leap year");
        }
        else {
            System.out.println(year+" is not leap year");
        }
    }

    public static void main(String[] args) {
        /**
         * leapYearOrNot method call in main method
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = input.nextInt();

        leapYearOrNot(year);
    }
}
