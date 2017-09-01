package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class prblm10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        for (int i = 0; i < word.length(); i++)
        {
            System.out.println(word.charAt(i) + " -> " + ((int)word.charAt(i)  - (int)'a'));
        }
    }
}
