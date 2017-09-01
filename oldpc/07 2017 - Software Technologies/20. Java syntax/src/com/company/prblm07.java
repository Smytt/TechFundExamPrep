package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class prblm07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] sequence = scanner.nextLine().split(" ");
        int bestLen = 1;
        int curLen = 1;
        int bestStart = 0;

        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i].equals(sequence[i - 1])) {
                curLen++;

                if (bestLen < curLen) {
                    bestLen = curLen;
                    bestStart = i - curLen + 1;
                }
            }
            else curLen = 1;
        }

        System.out.println(Arrays.toString(Arrays.copyOfRange(sequence, bestStart, bestStart+bestLen)).replaceAll("[\\]\\[\\,]+", ""));
    }
}
