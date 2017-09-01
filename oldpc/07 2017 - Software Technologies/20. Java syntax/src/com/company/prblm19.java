package com.company;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class prblm19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split(" ");
        TreeMap<String, String> phoneBook = new TreeMap<>();

        while (command[0].compareTo("END") != 0) {
            if (command[0].compareTo("S") == 0) {
                if (phoneBook.containsKey(command[1]))
                    System.out.printf("%s -> %s%n", command[1], phoneBook.get(command[1]));
                else System.out.printf("Contact %s does not exist.%n", command[1]);
            } else if (command[0].compareTo("A") == 0) {
                phoneBook.put(command[1], command[2]);
            } else if (command[0].compareTo("ListAll") == 0) {
                phoneBook.forEach( (x, y) -> {
                    System.out.printf("%s -> %s%n", x, y);}
                );
            }

            command = scanner.nextLine().split(" ");
        }
    }
}
