package com.company;

import java.util.Scanner;

public class Loops {

    public static void run(){
        System.out.println("Running Loops");

        // for loops
        for (int i = 0; i < 5; i++) {
            System.out.println("hello world!!");
        }

        // while loops
        int i = 2;
        while(i > 0) {
            System.out.println("Hello World" + i);
            i--;
        }

        /*
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while(!input.equals("quit")) {
            System.out.println("Input");
            input = scanner.next().toLowerCase();
        }

        // do while loop will be executed at least once
        do {
            System.out.println("input for do while: ");
            input = scanner.next().toLowerCase();
        } while (!input.equals("hello"));
        */
        // break and continue statements are supported in java loops
        // while true is also supported for running a program continuosly

        String[] fruits = {"Apple", "Mango", "Orange"};

        for(i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        System.out.println("starting for each loop"); // for each loop is forward only
        for (String fruit:fruits) {
            System.out.println(fruit);
        }
    }
}
