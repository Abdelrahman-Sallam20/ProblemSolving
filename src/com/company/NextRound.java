package com.company;

import java.util.Scanner;

public class NextRound {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int con = arr[k - 1];

        int counter = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= con && arr[i] > 0) {
                counter++;
            }
        }
        System.out.println(counter);


    }
}
