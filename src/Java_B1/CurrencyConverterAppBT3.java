package Java_B1;

import java.util.Scanner;

public class CurrencyConverterAppBT3 {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền USD");
        usd = scanner.nextDouble();
        double rate = usd*vnd;
        System.out.println("Giá trị quy đổi là: " + rate + " VNĐ");
    }
}
