package com.fizzbuzz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting Fizz Buzz Program...");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        String message = "";
        if(number % 5 == 0) {
            message += "Fizz";
        }

        if(number % 3 == 0) {
            message += "Buzz";
        }
        String finalMessage = message.length() > 0 ? message : Integer.toString(number);
        System.out.println(finalMessage);
    }
}
