package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class prblm11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sequence = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean isFound = false;

        for (int i = 0; i < sequence.length; i++)
        {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = i-1; j >= 0; j--)
            {
                leftSum += sequence[j];
            }

            for (int j = i + 1; j < sequence.length; j++)
            {
                rightSum += sequence[j];
            }

            if (leftSum == rightSum)
            {
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if (!isFound) System.out.println("no");
    }
}
