package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class prblm17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Matcher m = Pattern.compile("<upcase>(.+?)<\\/upcase>").matcher(text);

        StringBuilder res = new StringBuilder();

        int last = 0;
        while (m.find()) {
            res.append(text.substring(last, m.start()));
            res.append(m.group(1).toUpperCase());
            last = m.end();
        }
        res.append(text.substring(last));

        System.out.println(res);


    }
}
