package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        double sum = 0.0;
        System.out.println("Enter n:");
        n = sc.nextInt();

        while (n > 0) {
            sum += (1.0) / n;
            n--;
        }
        System.out.println("The harmonic sum is:" + sum);
    }
}
