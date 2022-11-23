package com.bridgelabz;

import java.util.Scanner;

/**
 * @GovardhanReddy
 */
public class PowerOfTwo {
    /**
     * find the power of two values
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the limit of power value : ");
        double power = input.nextInt();
        double number = 2;
        double table=0;
        for (int i =0;i<=power;i++){
             table =Math.pow(number,i);

        }
        System.out.println("Year : "+table);
        LeapYear.leapYearOrNot((int) table);

    }
}
