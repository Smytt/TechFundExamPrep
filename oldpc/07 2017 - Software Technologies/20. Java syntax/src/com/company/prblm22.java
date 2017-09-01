package com.company;

import java.io.Console;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class prblm22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Circle circle = new Circle();
        Point center = new Point();
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        center.x = input[0];
        center.y = input[1];
        circle.center = center;
        circle.radius = input[2];
        Circle circle1 = circle;

        circle = new Circle();
        center = new Point();
        input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        center.x = input[0];
        center.y = input[1];
        circle.center = center;
        circle.radius = input[2];
        Circle circle2 = circle;

        if (DoesIntersect(circle1, circle2)) System.out.println("Yes");
        else System.out.println("No");
    }

    private static boolean DoesIntersect(Circle circle1, Circle circle2)
    {
        double distance = DistanceBetweenPoints(circle1.center, circle2.center);

        if (distance <= circle1.radius + circle2.radius) return true;
        return false;
    }

    private static double DistanceBetweenPoints(Point center1, Point center2)
    {
        double line1 = Math.abs(center1.x - center2.x);
        double line2 = Math.abs(center1.y - center2.y);

        return Math.sqrt(line1 * line1 + line2 * line2);
    }

    private static class Circle
    {
        public Point center;
        public double radius;
    }

    private static class Point
    {
        public double x;
        public double y;
    }
}




