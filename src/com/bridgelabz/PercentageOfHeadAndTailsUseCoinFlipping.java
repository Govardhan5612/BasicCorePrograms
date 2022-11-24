package com.bridgelabz;

import java.util.Scanner;

/**
 *
 * @Govardhan Reddy
 *
 */

public class PercentageOfHeadAndTailsUseCoinFlipping {
    /**
     *
     * FlipCoinPrintPercentageOfHeadAndTails class
     *
     */
    public static void percentageOfHeadAndTail(){
        /**
         *
         * percentageOfHeadAndTail method used to find head and tail percentage
         *
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of times coin flip : ");
        int numberOfTimesCoinFlip = input.nextInt();
        int heads = 0;
        int tails = 0;
        for (int i =1;i<=numberOfTimesCoinFlip;i++){
            double randomNumber = Math.random();

            if (randomNumber<=0.5){
                heads++;

            }
            else {
                tails++;
            }

        }
        System.out.println("Percentage of heads : "+(heads*100/numberOfTimesCoinFlip)+"%");
        System.out.println("Percentage of tails : "+(tails*100/numberOfTimesCoinFlip)+"%");
    }

    public static void main(String[] args) {
        /**
         * call the percentageOfHeadAndTail static method call in main method
         */
        percentageOfHeadAndTail();
    }
}
