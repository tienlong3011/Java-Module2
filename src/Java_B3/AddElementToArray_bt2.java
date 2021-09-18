package Java_B3;

import java.util.Scanner;

public class AddElementToArray_bt2 {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số lượng phần tử: ");
            size = scanner.nextInt();
        } while (size <= 0);
        int [] array = new int[size];
        System.out.println("Nhập các phần tử trong mảng");
        for (int j = 0; j < size; j++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Phần tử thứ " + j + " là:");
            array[j] = scanner1.nextInt();
        }
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Nhập số cần thêm vào mảng");
        int X = scanner2.nextInt();

        System.out.println("Nhập vị trí cần thêm vào mảng");
        int index = checkInt(0,size);
            //x = 6
            //index = 1
            //1 2 3 4 5
            //0 1 2 3 4
            int arrIndex = 0;
            int [] arr = new int [size + 1];
            for (int i = 0; i <= size; i++) {
                if (i==index) {
                    arr[i] = X;
                } else {
                    arr[i] = array[arrIndex++];
                }
            }

        System.out.println("Mảng sau khi được thêm là ");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j] + " ");
        }
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
