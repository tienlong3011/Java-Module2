package Java_B1;

import java.util.Scanner;

public class UsingTheOperator {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);//Khai báo đối tượng Scanner

        System.out.println("Enter width: ");
        width =  scanner.nextFloat(); //Nhập chiều rộng

        System.out.println("Enter Height: ");
        height = scanner.nextFloat(); //Nhập chiều cao

        float area = width*height;
        System.out.println("Area is: " + area);
    }
}
