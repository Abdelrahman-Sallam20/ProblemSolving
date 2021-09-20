package com.company;

import java.util.Scanner;

public class Team {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int row = input.nextInt();

        int[][] nums = new int[row][3];

        int sure = 0;

        for (int i = 0; i < row; i++) {
           int count = 0;
            for (int j = 0; j < 3; j++) {
                nums[i][j] = input.nextInt();
                if (nums[i][j] == 1) {
                    count++;
                }
            }
            if (count > 1) {
                sure++;
            }

        }
        System.out.println(sure);
    }
}
