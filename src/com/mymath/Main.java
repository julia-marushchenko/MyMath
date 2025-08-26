// Java program to count cos(), sin(), tg()

package com.mymath;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating values with 0°, 30°, 60°, 90°, 180°, 270° in radians
        double degree_0 = Math.toRadians(0);
        double degree_30 = Math.toRadians(30);
        double degree_60 = Math.toRadians(60);
        double degree_90 = Math.toRadians(90);
        double degree_180 = Math.toRadians(180);
        double degree_270 = Math.toRadians(270);

        // Printing sin(0°)
        System.out.println("sin(0°) = " + (int)Math.sin(degree_0));

        // Printing cos(0°)
        System.out.println("cos(0°) = " + (int)Math.cos(degree_0));

        // Printing tg(0°)
        System.out.println("tg(0°) = " + (int)Math.tan(degree_0));

        // Printing sin(30°)
        System.out.printf("sin(30°) = %.1f\n", Math.sin(degree_30));

        // Printing cos(30°)
        System.out.printf("cos(30°) = %.2f\n", Math.cos(degree_30));

        // Printing tg(30°)
        System.out.printf("tg(30°) = %.2f\n", Math.tan(degree_30));

        // Printing sin(60°)
        System.out.printf("sin(60°) = %.2f\n", Math.sin(degree_60));

        // Printing cos(60°)
        System.out.printf("cos(60°) = %.1f\n", Math.cos(degree_60));

        // Printing tg(60°)
        System.out.printf("tg(60°) = %.2f\n", Math.tan(degree_60));

        // Printing sin(90°)
        System.out.println("sin(90°) = " + (int)Math.sin(degree_90));

        // Printing cos(90°)
        System.out.println("cos(90°) = " + (int)Math.cos(degree_90));

        // Printing sin(180°)
        System.out.println("sin(180°) = " + (int)Math.sin(degree_180));

        // Printing cos(180°)
        System.out.println("cos(180°) = " + (int)Math.cos(degree_180));

        // Printing tg(180°)
        System.out.println("tg(180°) = " + (int)Math.tan(degree_180));

        // Printing sin(270°)
        System.out.println("sin(270°) = " + (int)Math.sin(degree_270));

        // Printing cos(270°)
        System.out.println("cos(270°) = " + (int)Math.cos(degree_270));

    }
}