package com.company;

import java.util.Scanner;

public class prblm05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());

        System.out.println(Integer.toHexString(a).toUpperCase());
        System.out.println(Integer.toBinaryString(a));
    }
}
