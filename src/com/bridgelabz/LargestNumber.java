package com.bridgelabz;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1;
        System.out.println("Enter first number:");
        num1 = in.nextInt();

        int num2;
        System.out.println("Enter second number:");
        num2 = in.nextInt();

        int num3;
        System.out.println("Enter third number:");
        num3 = in.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Largest number is:" + num1);
        } else if (num2 > num3) {
            System.out.println("Largest number is:" + num2);
        } else {
            System.out.println("Largest number is:" + num3);
        }
    }
}
