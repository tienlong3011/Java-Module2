package Java_B1;

import java.util.Scanner;

public class ShowGreetingsBT1 {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Hello: " + name);

    }
}
