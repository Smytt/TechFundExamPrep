package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class prblm12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] bombArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        List<Integer> numbers = new ArrayList<>();
        List<Integer> bomb = new ArrayList<>();

        for(int n : numbersArr) {
            numbers.add(n);
        }
        for(int n : bombArr) {
            bomb.add(n);
        }

        while (numbers.indexOf(bomb.get(0)) >= 0)
        {
            int min = Math.max(0, numbers.indexOf(bomb.get(0)) - bomb.get(1));
            int max = Math.min(numbers.size() - 1, numbers.indexOf(bomb.get(0)) + bomb.get(1));

            for (int i = min; i <= max; i++)
            {
                numbers.remove(min);
            }
        }

        int sum = 0;

        for (int num : numbers)
        {
            sum += num;
        }

        System.out.println(sum);
    }
}
