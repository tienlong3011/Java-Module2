package Java_B2;

import java.util.Scanner;

public class ApplicationToCalculateLoanInterest {
    public static void main(String[] args) {
        double money;
        int month;
        double interestRate;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter number of months: ");
        month = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = scanner2.nextDouble();

        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate/100) * 12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
