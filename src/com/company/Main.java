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

import java.util.Date;
import java.awt.*;

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


    }
}
