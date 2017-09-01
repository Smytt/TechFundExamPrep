package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class prblm20 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Calendar c = Calendar.getInstance();

        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        Date startDate = formatDate.parse(input1);
        Date endDate = formatDate.parse(input2);
        c.setTime(endDate);
        c.add(Calendar.DATE, 1);
        endDate = c.getTime();

        Date[] holidays = {
                formatDate.parse("01-01-2000"),
                formatDate.parse("03-03-2000"),
                formatDate.parse("01-05-2000"),
                formatDate.parse("06-05-2000"),
                formatDate.parse("24-05-2000"),
                formatDate.parse("06-09-2000"),
                formatDate.parse("22-09-2000"),
                formatDate.parse("01-11-2000"),
                formatDate.parse("24-12-2000"),
                formatDate.parse("25-12-2000"),
                formatDate.parse("26-12-2000")
        };


        int workingDays = 0;

        for (Date i = startDate; i.before(endDate); i = c.getTime()) {
            c.setTime(i);
            if (isWorkingDay(i, holidays, c)) workingDays++;
            c.add(Calendar.DATE, 1);
        }

        System.out.println(workingDays);

    }

    private static boolean isWorkingDay(Date day, Date[] holidays, Calendar c) {

        if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
            return false;
        if (Arrays.stream(holidays).anyMatch(d -> AntMatch(d,c)))
            return false;
        return true;
    }

    private static boolean AntMatch(Date d, Calendar c) {
        Calendar e = Calendar.getInstance();
        e.setTime(d);
        if (e.get(Calendar.DATE) == c.get(Calendar.DATE) && e.get(Calendar.MONTH) == c.get(Calendar.MONTH))
            return true;
        return false;
    }

}
