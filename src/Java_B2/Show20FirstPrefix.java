package Java_B2;

import java.util.Scanner;

public class Show20FirstPrefix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập snt cần in ra");
        int number = scanner.nextInt();
        int count = 0;
        int N = 2;
        while (count < number) {
            if (isPrime(N)) {
                count++;
                System.out.print(N + ",");
            }
            N++;
        }
    }

    public static boolean isPrime(int num) {
        boolean check = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }
}


