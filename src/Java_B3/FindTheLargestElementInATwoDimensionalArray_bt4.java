package Java_B3;

import java.util.Scanner;

public class FindTheLargestElementInATwoDimensionalArray_bt4 {
    public static void main(String[] args) {
        System.out.print("Nhập số dòng: ");
        int row = checkInt(1, Integer.MAX_VALUE);

        System.out.print("Nhập số cột: ");
        int column = checkInt(1, Integer.MAX_VALUE);



        int [][] array = new int[row][column];

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("Nhập phần tử tại " + "array[" + i + "]["+ j + "] = ");
                array[i][j] = checkInt(Integer.MIN_VALUE,Integer.MAX_VALUE);
            }
        }
        int max = array[0][0];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                if(max < array[i][j]){
                    max = array[i][j];
                }
            }
        }
        System.out.print("Số lớn nhất là: " + max);
    }
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
