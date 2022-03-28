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

        long principal = 0;
        do {
            System.out.print("Principal (1K - 1M): ");
            principal = scanner.nextLong();
        } while (principal < 1000 || principal > 100000);

        double air = 0;
        while(true) {
            System.out.print("\nAnnual Interest Rate (0 - 30): ");
            air = scanner.nextDouble();
            if (air >= 1 && air <= 30) {
                break;
            }
            System.out.println("Annual interest rate should be between 1 - 30");
        }

        System.out.print("\nPeriod (Years) (1 - 30): ");
        int periodYears = scanner.nextInt();

        double mir = air / (double) (12 * 100);
        int periodMonths = periodYears * 12;

        double mortgage = (double)principal * ((mir * Math.pow(1 + mir, periodMonths)) / (Math.pow(1 + mir, periodMonths) - 1));
        System.out.print("\nMortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));



    }
}
