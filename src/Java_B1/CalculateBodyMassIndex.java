package Java_B1;

import java.util.Scanner;

public class CalculateBodyMassIndex {
    public static void main(String[] args) {
        double weight;
        double height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cân nặng: ");
        weight = scanner.nextDouble();

        System.out.println("Nhập chiều cao: ");
        height = scanner.nextDouble();

        double bmi = weight/(height*height);

        if(bmi < 18.5){
            System.out.println("Under Weight");
        } else {
            if (bmi < 25.0){
                System.out.println("Normal");
            } else {
                if(bmi < 30){
                    System.out.println("Over Weight");
                } else {
                    System.out.println("Obese");
                }
            }
        }

    }
}
