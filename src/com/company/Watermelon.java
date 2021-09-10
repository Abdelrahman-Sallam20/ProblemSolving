package com.company;

import java.util.Scanner;

public class Watermelon {

    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);

        int input = s.nextInt();

        if (input <= 2) {
            System.out.println("NO");
            return;

        }

        if (input % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}
