package com.company.Test4;

import java.util.Random;

public class Maintest {
    public static Random random = new Random();
    public static void main(String[] args) {
        int max = 2019, min = 100;
        int[]books = new int[100];
        for(int i = 0;i<books.length;i++){
             books[i] = random.nextInt((max-min)+max);
            if(books[i]<min){
                min = books[i];
            }
            System.out.println("БИ" + i + " = " + books[i]);

        }
        System.out.println(min);


    }
}