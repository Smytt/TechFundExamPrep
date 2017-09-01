package com.company;

import java.util.Scanner;

public class prblm14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < 20; i++) {
            try {
                res.append(input.charAt(i));
            }
            catch (Exception ex) {
                res.append("*");
            }
        }

        System.out.println(res);
    }
}
