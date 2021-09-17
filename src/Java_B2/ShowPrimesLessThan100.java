package Java_B2;

public class ShowPrimesLessThan100 {
    public static void main(String[] args) {
        int number = 100;
        for (int i = 0; i < number; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }


    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        } else {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    check = false;
                }
            }
            return check;
        }
    }
}
