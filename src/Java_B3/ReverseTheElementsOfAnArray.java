package Java_B3;

import java.util.Scanner;

public class ReverseTheElementsOfAnArray {
    public static void main(String[] args) {
        //Khai báo các biến, nhập và kiểm tra kích thước mảng
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if(size>20){
                System.out.println("Size does not exceed 20");
            }
        } while (size>20);
        //Nhập giá trị cho các phần tử của mảng
        array = new int[size];
        int i = 0;
        while (i<array.length){
            System.out.println("Enter element " + (i+1) + ": ");
            Scanner scanner1 = new Scanner(System.in);
            array[i] = scanner1.nextInt();
            i++;
        }
        // In ra mảng đã nhập
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        //Đảo ngược thứ tự các phần tử trong mảng
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        //In ra mảng sau khi đã đảo ngược thứ tự các phần tử
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
