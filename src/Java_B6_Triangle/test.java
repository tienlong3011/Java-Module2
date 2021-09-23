package Java_B6_Triangle;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập màu sắc của tam giác: ");
        String color = scanner.nextLine();

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Nhập cạnh AB của tam giác: ");
        double side1 = scanner1.nextDouble();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Nhập cạnh AC của tam giác: ");
        double side2 = scanner2.nextDouble();

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Nhập cạnh BC của tam giác: ");
        double side3 = scanner3.nextDouble();

        Triangle triangle = new Triangle(color,side1,side2,side3);
        triangle.getArea();
        triangle.getPerimeter();
        System.out.println(triangle);
    }
}
