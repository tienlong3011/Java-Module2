package Java_B3;

import java.util.Scanner;

public class FindTheSmallestValueInAnArray_bt5 {
    public static void main(String[] args) {
        int size;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập độ dài của mảng: ");
            size = scanner.nextInt();
        }while (size <= 0);
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = scanner1.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The smallest element in the array is: " + min);
    }
}
