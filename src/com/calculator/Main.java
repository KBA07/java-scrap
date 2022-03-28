package com.calculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mortgage Calculator");

        Scanner scanner = new Scanner(System.in);
        // Principal: 100000
        // Annual Interest Rate: 3.92
        // Period (Years): 30
        // Mortgage: $472.81
        System.out.print("Principal: ");
        long principal = scanner.nextLong();
        System.out.print("\nAnnual Interest Rate: ");
        double air = scanner.nextDouble();
        System.out.print("\nPeriod (Years): ");
        int periodYears = scanner.nextInt();

        double mir = air / (double) (12 * 100);
        int periodMonths = periodYears * 12;

        double mortgage = (double)principal * ((mir * Math.pow(1 + mir, periodMonths)) / (Math.pow(1 + mir, periodMonths) - 1));
        System.out.print("\nMortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));



    }
}
