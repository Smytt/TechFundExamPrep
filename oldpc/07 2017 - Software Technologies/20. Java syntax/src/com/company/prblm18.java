package com.company;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class prblm18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split(" ");
        HashMap<String, String> phoneBook = new HashMap<>();

        while (command[0].compareTo("END") != 0) {
            if (command[0].compareTo("S") == 0) {
                if (phoneBook.containsKey(command[1]))
                    System.out.printf("%s -> %s%n", command[1], phoneBook.get(command[1]));
                else System.out.printf("Contact %s does not exist.%n", command[1]);
            } else if (command[0].compareTo("A") == 0) {
                phoneBook.put(command[1], command[2]);
            }

            command = scanner.nextLine().split(" ");
        }
    }
}
