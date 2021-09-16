package Java_B1;

import java.util.Scanner;

public class HelloWorld {
    public static void main (String[] args){
        //Nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số");

//        int a = scanner.nextInt(); //nhập vào 1 số
        String a = scanner.nextLine(); //nhập vào 1 ký tự
        System.out.println(a); //in ra màn hình
    }
}
