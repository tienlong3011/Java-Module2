package Java_B3;

import java.util.Scanner;

public class SumColumn_bt6 {
    public static void main(String[] args) {
        System.out.println("Nhập số dòng: ");
        int row = checkInt(0,Integer.MAX_VALUE);

        System.out.println("Nhập số cột: ");
        int column = checkInt(0,Integer.MAX_VALUE);

        int [][] arr = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Nhập phần tử tại " + "array[" + i + "]["+ j + "] = ");
                arr[i][j] = checkInt(Integer.MIN_VALUE,Integer.MAX_VALUE);
            }
        }
        System.out.println("Nhập cột cần tính: ");
        int num = checkInt(0,column);
        int sum = 0;
        for (int i = 0; i < row; i++) {
             sum += arr[i][num];
        }
        System.out.println("Tống các giá trị ở cột " + num + " là: " + sum);
    }
    // check chỉ cho điền số nguyên từ min đến max
    public static int checkInt(int min, int max) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int n = Integer.parseInt(sc.nextLine().trim());
                if (n < min || n > max) {
                    throw new NumberFormatException();
                }
                return n;
            } catch (NumberFormatException e) {
                System.err.println("Please input a integer in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }
}
