package com.bridgelabz;

import java.util.Scanner;

/**
 * @GovardhanReddy
 */
public class HarmonicNumber {
    /**
     * find the Nth term of harmonic number
     * @param args
     */
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the harmonic value ");
        float harmonicValue= input.nextFloat();
        float harmonicNumber=0.0f;
        System.out.print("Harmonic numbers : ");
        for(float i=1;i<=harmonicValue;i++){
            float temp=1/i;
            harmonicNumber=temp+harmonicNumber;
            System.out.print(harmonicNumber +" ,");
        }
        System.out.println();
        System.out.println("Nth Harmonic number is "+harmonicNumber);
    }
}
