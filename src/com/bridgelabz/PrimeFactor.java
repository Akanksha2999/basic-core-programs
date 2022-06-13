package com.bridgelabz;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        int num;
        int primeFactor = 2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = sc.nextInt();

        System.out.println("Prime factor of number is:");
        while (num > 1) {
            if (num % primeFactor == 0) {
                System.out.println(primeFactor + " ");
                num = num / primeFactor;
            } else {
                primeFactor++;
            }
        }
    }
}
