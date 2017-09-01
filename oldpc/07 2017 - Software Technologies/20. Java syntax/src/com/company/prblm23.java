package com.company;

import java.util.*;

public class prblm23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student[] students = ReadStudents(scanner);
        PrintStudentsWithBetterGrade(students);
    }

    private static void PrintStudentsWithBetterGrade(Student[] students) {
        Arrays.sort(students, (s1, s2) -> {

            String x1 = ((Student)s1).name;
            String x2 = ((Student)s2).name;
            int sComp = x1.compareTo(x2);

            if (sComp != 0) return sComp;
            else {
                Double y1 = ((Student)s1).average();
                Double y2 = ((Student)s2).average();
                return (y2.compareTo(y1));
            }
        });

        Student[] sorted = Arrays.stream(students).filter(x -> x.average() >= 5.00).toArray(Student[]::new);

        for (Student student : sorted) {
            System.out.printf("%s -> %.2f%n", student.name, student.average());
        }
    }

    private static Student[] ReadStudents(Scanner scanner) {
        int n = Integer.parseInt(scanner.nextLine());
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            Student student = new Student();
            String[] command = scanner.nextLine().split(" ");
            double[] allGrades = Arrays
                    .stream(Arrays.copyOfRange(command, 1, command.length))
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            student.name = command[0];
            student.allGrades = allGrades;
            students[i] = student;
        }
        return students;
    }

    static class Student {
        String name;
        double[] allGrades;

        double average() {
            double sum = 0;
            for (double grade : allGrades) {
                sum += grade;
            }
            return sum * 1.00 / allGrades.length;
        }
    }
}




