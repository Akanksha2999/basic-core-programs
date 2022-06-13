package com.bridgelabz;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        int count = 1;
        double randomNumber = 0.0;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter how many times coin to flip: ");
        int flips = in.nextInt();

        while (count <= flips) {
            randomNumber = Math.random();
            System.out.print(count + " " + randomNumber);

            if (randomNumber < 0.5) {
                heads++;
                System.out.println("heads");
            } else {
                tails++;
                System.out.println("tails");
            }
            count++;
        }
        System.out.println();
        System.out.println("Number of Heads = " + heads);
        System.out.println("Number of Tails = " + tails);

        double headspercent = (double) heads / flips * 100;
        double tailspercent = (double) tails / flips * 100;

        System.out.println("Percentage of heads is:" + headspercent);
        System.out.println("Percentage of tails is:" + tailspercent);

    }
}
