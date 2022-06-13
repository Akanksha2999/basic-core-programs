package com.bridgelabz;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        System.out.println("Enter number:");
        number = in.nextInt();
        if (number % 2 == 0) {
            System.out.println("Entered number is even");
        } else {
            System.out.println("Entered  number is odd");
        }
    }
}
