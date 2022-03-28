package com.company;

public class ControlFlow {

    public static void run() {
        System.out.println("Starting Control Flow");

        // comparison operator to compare primitive value
        int x = 1;
        int y = 1;

        System.out.println(x == y); // this is boolean expression, != inequality operatior
        // > < >= <=, boolean expression returns

        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30; // if one is false and is && java will not evaluation the rest
        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = hasHighIncome || hasGoodCredit && !hasCriminalRecord; // if one is true, java will return true

        // if statements
        temperature = 32;
        if(temperature > 30)
            System.out.println("it is a hot day"); // example of a single line if statement

        // example of a multiline if statement
        if(temperature > 30) {
            System.out.println("it is a hot day");
            System.out.println("drink plenty of water");
        } else if (temperature > 20 && temperature <= 30) {
            System.out.println("Beautiful day");
        } else {
            System.out.println("cold day");
        }

        // simplifying if statements
        int income = 120_000;
        boolean hasHighIncome1 = false;
        if (income > 100_000) {
            hasHighIncome1 = true;
        }
        System.out.println(hasHighIncome1);

        boolean hasHighIncome2 = income > 100_000;
        System.out.println(hasHighIncome2);

        // terery operator in java
        String className;
        // condition ? True Return : False Return
        className = income > 100_000 ? "First" : "Economy";
        System.out.println(className);

        // switch statements
        String role = "admin";
        switch (role) { // besides long you can you any variables
            case "admin":
                System.out.println("you are an admin");
                break;
            case "moderator":
                System.out.println("you are a moderator");
                break;
            default:
                System.out.println("you are a guest");
        }





    }
}
