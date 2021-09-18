package Java_B3;

import java.util.Scanner;

public class ArrayMerge_bt3 {
    public static void main(String[] args) {
        int sizeArr1;
        int sizeArr2;
        // khởi tạo mảng 1
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập vào độ dài của mảng 1: ");
            sizeArr1 = scanner.nextInt();
        }while (sizeArr1 <= 0);
        int [] arr1 = new int[sizeArr1];
        for (int i = 0; i <sizeArr1 ; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Nhập phần tử thứ " + i + " của mảng 1: ");
            arr1[i] = scanner1.nextInt();
        }
        //khởi tạo mảng 2
        do{
            Scanner scanner3 = new Scanner(System.in);
            System.out.print("Nhập vào độ dài của mảng 2: ");
            sizeArr2 = scanner3.nextInt();
        }while (sizeArr2 <= 0);
        int [] arr2 = new int[sizeArr2];
        for (int i = 0; i <sizeArr2 ; i++) {
            Scanner scanner4 = new Scanner(System.in);
            System.out.print("Nhập phần tử thứ " + i + " của mảng 2: ");
            arr2[i] = scanner4.nextInt();
        }

        int [] arr3 = new int[sizeArr1 + sizeArr2];
        for (int i = 0; i < sizeArr1; i++) {
            arr3[i] = arr1[i];
        }
        for (int j = 0; j < sizeArr2; j++) {
            arr3[sizeArr1++] = arr2[j];
        }
        System.out.println("Phần tử trong mảng 3 là ");
        for (int z = 0; z < arr3.length; z++) {
            System.out.print(arr3[z] + " ");
        }
    }
}
