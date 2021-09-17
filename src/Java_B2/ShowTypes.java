package Java_B2;

import java.util.Scanner;

public class ShowTypes {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0){
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Print the rectangle");
                    rectangular();
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    squareTriangle();
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    isoscelesTriangle();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Please complete");
                    break;
            }
        }

    }

    public static void rectangular() {
        int height;
        int width;
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("height = ");
        height = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("width = ");
        width = scanner1.nextInt();

        for (i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }

    public static void squareTriangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("* ");
            System.out.println("");
        }
    }

    public static void isoscelesTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }


}
