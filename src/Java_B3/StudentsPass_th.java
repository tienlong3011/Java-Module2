package Java_B3;

import java.util.Scanner;

public class StudentsPass_th {
    public static void main(String[] args) {
        int size;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập số lượng học sinh: ");
            size = scanner.nextInt();
            if(size > 30){
                System.out.print("Size should not exceed 30");
            }
        }while (size > 30);
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Điểm của học sinh thứ " + (i+1) + " là: ");
            arr[i] = scanner1.nextInt();
        }
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
            if(arr[j] >= 5 && arr[j] <= 10){
                count++;
            }
        }
        System.out.println("Số học sinh thi đỗ là: " + count);
    }
}
