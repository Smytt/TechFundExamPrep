package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class prblm09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sequence = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxCount = 0;
        int repeatingNumber = 0;

        for (int i = 0; i < sequence.length; i++)
        {
            int currentCount = 0;

            for (int j = i; j < sequence.length; j++)
            {
                if (sequence[i] == sequence[j])
                {
                    currentCount++;
                }
            }

            if (currentCount > maxCount)
            {
                repeatingNumber = sequence[i];
                maxCount = currentCount;
            }
        }

        System.out.println(repeatingNumber);
    }
}
