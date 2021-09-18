package Java_B3;

import java.util.Scanner;

public class CountStringCharacters_bt9 {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một chuỗi ký tự từ bàn phím: ");
        str = scanner.nextLine();

        int length = str.length();
        System.out.println("Chuỗi " + str + " có độ dài = " + length);

        char character;
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Nhập vào ký tự cần đếm số lần xuất hiện: ");
        character = scanner2.next().charAt(0);

        int count = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + character + " trong chuỗi " + str + " = " + count);
    }
}
