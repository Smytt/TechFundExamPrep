package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class prblm26 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        String date = scanner.nextLine();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy");
        Date parsedDate = formatDate.parse(date);
        Calendar c = Calendar.getInstance();
        c.setTime(parsedDate);
        c.add(Calendar.DATE, 56);
        Date newDate = c.getTime();

        System.out.println(newDate.toString());
    }
}




