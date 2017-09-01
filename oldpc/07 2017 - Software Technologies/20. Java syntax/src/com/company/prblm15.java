package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class prblm15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mail = scanner.nextLine();
        String[] splitMail = mail.split("@");
        String username = splitMail[0];
        char[] chars = new char[username.length()];
        Arrays.fill(chars, '*');
        String mask = new String(chars);
        String text = scanner.nextLine();

        String res = text.replace(mail, mask + "@" + splitMail[1]);
        System.out.println(res);

    }
}
