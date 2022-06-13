package com.bridgelabz;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1;
        System.out.println("Enter first number n1:");
        n1 = in.nextInt();
        int n2;
        System.out.println("Enter second number n2:");
        n2 = in.nextInt();
        int n3 = n1;
        n1 = n2;
        n2 = n3;
        System.out.println("n1 after swapping is:" + n1);
        System.out.println("n2 after swapping is:" + n2);
    }
}
