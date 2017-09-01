package com.company;

import java.util.Scanner;

public class prblm04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        boolean isDigit = "0123456789".indexOf(a) >= 0;
        boolean isVowel = "aeoui".indexOf(a) >= 0;

        if(isDigit) System.out.println("digit");
        else if (isVowel) System.out.println("vowel");
        else System.out.println("other");
    }
}
