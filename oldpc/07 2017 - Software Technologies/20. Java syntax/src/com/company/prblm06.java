package com.company;

import java.util.Scanner;

public class prblm06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        int first = a.compareTo(b);

        if (first > 0) {
            System.out.println(b.replace(" ", ""));
            System.out.println(a.replace(" ", ""));
        } else {
            System.out.println(a.replace(" ", ""));
            System.out.println(b.replace(" ", ""));
        }
    }
}
