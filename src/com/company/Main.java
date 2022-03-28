package com.company;
/*
Staments are terminated with ;
Packages have a bunch of classes grouped together

ReturnType FunctionName() {

}

Void Name() {
    ...
}

void main() { Should always have
    ...
}

functions can't reside on their own
they must reside under class

// should have access modifiers
// public, protected and private
// ClassesShouldHavePascalNamingConvention
public Class Main {
    // this would be called a method
    // methodsShouldHaveCamelNamingConvention
    void main() {
        ...
    }
}
*/

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Date;
import java.awt.*;
import java.util.Scanner;

public class Main {

    // This is public method and static
    public static void main(String[] args) {
        // write your code here
        int age = 30, temperature = 40; // not recommended
        int storage;
        System.out.println(age);

        age = 40;
        System.out.println(age);

        storage = temperature;
        System.out.println(storage);
        // System.out.println("Hello world");

        // types - Primitive and Reference
        // byte - 1 [-128, 127]
        // short -
        // int - 4 bytes
        // long
        // float, double for storing decimals
        // char - 2
        // boolean -

        byte age1 = 30; // since -127
        int viewsCount = 2_1_123_456_78;
        long viewsCount1 = 3_1_124_456_789L;
        float price = 10.99F; // to represent float
        double price1 = 10.99;
        char letter = 'A'; // single character with single quotes
        boolean isEligible = false; // reserved keywords can't be used as a variable names

        // Complex objects are used by reference (pointers)

        byte age2 = 30;
        Date now = new Date(); // reference type need to used with new, but deallocation can be done by JRE

        // now.getTime() // members

        System.out.println("printing now");
        System.out.println(now);

        byte x = 1;
        byte y = x;
        x = 2;

        System.out.println(y);
        System.out.println(x);

        Point point1 = new Point(1, 1);
        Point point2 = point1;

        point1.x = 4;

        System.out.println(point1);
        System.out.println(point2);

        // strings in java
        String message = "Hello World" + "bro";
        System.out.println(message);
        System.out.println(message.endsWith("1"));

        System.out.println(message.length());

        System.out.println(message.indexOf("H"));

        System.out.println(message.startsWith("1"));
        System.out.println(message.length());

        System.out.println(message.indexOf("sky")); // one or more characters
        System.out.println(message.replace("bro", "**")); // this will return a new character

        System.out.println(message); // java strings a immutable, any function that modifies strings will return a new string

        message = " Hello World" + "!! ";
        System.out.println(message.trim()); // this will also return a new string, similar to strip in python

        // special characters in a strings

        message = "Hello \"Kashif\""; // adding special character will lead to programatic error, adding trailing slash can be helpful here
        System.out.println(message);
        message = "c:\\Windows\\...";
        System.out.println(message);

        message = "c:\tWindows";
        System.out.println(message);

        // Arrays in Java
        int[] numbers = new int[5]; // arrays are static in Java
        numbers[0] = 1;
        numbers[1] = 2;
//        numbers[10] = 3;
        System.out.println(Arrays.toString(numbers)); // same methods will different signature is called method overloading, will populate default values of types
        System.out.println(numbers); // Java will return the address of the object

        int[] numbers1 = {5, 4, 3, 0, 97};
        System.out.println(numbers1.length);
        Arrays.sort(numbers1);
        System.out.println(Arrays.toString(numbers1));
        // dynamic arrays are know as collection

        int[][] numbers2 = new int[2][3];
        numbers2[0][1] = 1;
        System.out.println(Arrays.deepToString(numbers2));

        int[][] numbers3 = { {1,2,3}, {2}, {3,4,5}};
        System.out.println(Arrays.deepToString(numbers3));

        // static keyword
        final float pi = 3.14F; // to avaoid failures on variable change, this can't be changed later on
        // final is what you would call const in c++

        // Aritmetic operation

        int result = 10 + 3;
        result = 10 * 3;
        result = 10 - 3;
        double result2 = (double)10 / (double)3; // type casting can happen
        System.out.println(result2);

        // increment

        int x1 = 1;
        int y1 = x1++; // first assign then increment
        System.out.println(y1);
        System.out.println(x1);
        // x = x + 2 or x += 2

        int x2 = 10 + 3 * 2; // () has the higher precedence
        System.out.println(x2);

        // casting and type conversion
        System.out.println("type conversion");
        short x3 = 1;
        int y3 = x3 + 2; // implicit casting, done auto from higher value
        System.out.println(y3);

        // byte > short > int > long
        double x4 = 1.1;
        double y4 = x4 + 2;
        System.out.println(y4);

        int y5 = (int)x4 + 2; // explicit casting
        System.out.println(y5);

        String x6 = "1";
        System.out.println(Integer.parseInt(x6) + 4);

        String x7 = "1.1";
//        int y7 = Double.parseDouble(x7)

        // Math class
        int result1 = Math.round(1.1F); // ceil, floor need to be type casted manually to int
        System.out.println(result1);

        System.out.println(Math.max(1,2));

        double result3 = Math.round(Math.random() * 100); // random would generate floating point numbers which would need to be rounded
        System.out.println(result3);

        // format number in format
        NumberFormat currency = NumberFormat.getCurrencyInstance(); // factory pattern, there are builders for numbers as well

        String result4 = currency.format(12345678.891);
        System.out.println(result4);
        // shift + f6 can be used in intellij to rename an instance of an object

        System.out.println(NumberFormat.getPercentInstance().format(0.1));
//        Scanner scanner = new Scanner(System.in); // System.in and System.out
        System.out.println("Your Age: ");
        // byte age3 = scanner.nextByte(); // next and nextline is used to read a token or a complete line
        // System.out.println("You are " + age3);

//        String name = scanner.nextLine().trim();
//        System.out.println("Your name is: " + name);

        ControlFlow cf = new ControlFlow();
        cf.run();
        }



























    }

