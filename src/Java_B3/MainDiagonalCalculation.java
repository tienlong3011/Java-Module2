package Java_B3;

import java.util.Scanner;

public class MainDiagonalCalculation {
    public static void main(String[] args) {
        System.out.println("Nhâp kích thước của ma trận vuông [i][i]");
        int index = checkInt(0,Integer.MAX_VALUE);

        int [][] matrix = new int[index][index];

        for (int i = 0; i < index; i++) {
            for (int j = 0; j < index; j++) {
                System.out.print("Nhập phần tử tại " + "array[" + i + "]["+ j + "] = ");
                matrix[i][j] = checkInt(Integer.MIN_VALUE,Integer.MAX_VALUE);
            }
        }
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += matrix[i][i];
        }
        System.out.println("Tổng các số ở đường tréo chính là: " + sum);
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
