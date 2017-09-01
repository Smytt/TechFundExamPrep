package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class prblm08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sequence = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int bestCount = 0;
        int startIndex = 0;

        for (int i = 0; i < sequence.length; i++) {
            int j = i;
            int currentCount = 1;

            while (j < sequence.length - 1 && sequence[j + 1] > sequence[j]) {
                j++;
                currentCount++;
            }

            if (currentCount > bestCount) {
                bestCount = currentCount;
                startIndex = i;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < bestCount; i++) {
            result.append(sequence[startIndex + i]);
            result.append(" ");
        }

        System.out.println(result);
    }
}
