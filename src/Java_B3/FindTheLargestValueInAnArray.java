package Java_B3;

import java.util.Scanner;

public class FindTheLargestValueInAnArray {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if(size > 20)
            System.out.println("Size should not exceed 20");
        } while (size>20);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner1.nextInt();
            i++;
        }
        //In ra danh sách tài sản đã nhập
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }
        // Duyệt các phần tử trong mảng để tìm GTLN và vị trí;
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if(array[j] > max){
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
