package com.bridgelabz;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dividend;
        System.out.println("Enter dividend:");
        dividend = in.nextInt();

        int divisor;
        System.out.println("Enter divisor:");
        divisor = in.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient is:" + quotient);
        System.out.println("Remainder is:" + remainder);

    }
}
