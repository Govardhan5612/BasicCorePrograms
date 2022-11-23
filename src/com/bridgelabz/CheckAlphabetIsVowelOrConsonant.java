package com.bridgelabz;

import java.util.Scanner;

/**
 * @GovardhanReddy
 */

public class CheckAlphabetIsVowelOrConsonant {
    /**
     *
     * @param alphabet is vowel or consonant
     */
    public static void alphabetIsVowelOrConsonant(String alphabet){
        /**
         * check weather alphabet is vowel or consonant
         */

        String lowerCaseAlphabet = alphabet.toLowerCase();
        String [] stringArray = {"a","e","i","o","u"};

        if (lowerCaseAlphabet.equals(stringArray[0])|| lowerCaseAlphabet.equals(stringArray[1])|| lowerCaseAlphabet .equals(stringArray[2])|| lowerCaseAlphabet.equals(stringArray[3])|| lowerCaseAlphabet.equals(stringArray[4])){
            System.out.println(alphabet+ " is Vowel");
        }
        else {
            System.out.println(alphabet+" is Consonant");
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter single alphabet : ");
        String alphabet = input.next();
        alphabetIsVowelOrConsonant(alphabet);

    }
}
