package com.company;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class prblm16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String url = scanner.nextLine();
        Pattern pattern = Pattern.compile("(?:(.+):\\/\\/)?([^\\/]+)(?:\\/(.*))?");
        Matcher match = pattern.matcher(url);
        if (match.find()) {
            if (match.group(1) == null) System.out.println("[protocol] = \"\" ");
            else System.out.println("[protocol] = \"" + match.group(1) + "\"");
            System.out.println("[server] = \"" + match.group(2) + "\"");
            if (match.group(3) == null) System.out.println("[resource] = \"\" ");
            else System.out.println("[resource] = \"" + match.group(3) + "\"");
        }


    }
}
