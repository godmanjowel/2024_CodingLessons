package main.java.hello;

import java.util.Scanner;

public class TestCircle {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What is the radius of the shape");
        double radius = scanner.nextDouble();
        System.out.println("the radius is " + radius);

        Circle dot = new Circle();
        dot.setRadius(radius);
        System.out.println("the area of the cricle is " + dot.area());
    }



}

