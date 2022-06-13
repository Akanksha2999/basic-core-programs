package com.bridgelabz;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a alphabet: ");
        char c = sc.next().charAt(0);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("Entered alphabet is vowel");
        } else {
            System.out.println("Entered alphabet is consonant");
        }
    }
}
