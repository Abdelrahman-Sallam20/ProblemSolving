package com.company;

import java.util.Scanner;


public class LongWords {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        char[] word;
        for (int i = 0; i < size; i++) {
            word = s.next().toCharArray();
            if (word.length > 10) {
                System.out.println(word[0] + "" + (word.length - 2) + word[word.length - 1]);
                continue;
            }
            System.out.println(word);
        }
    }

}





