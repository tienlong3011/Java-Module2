package Java_B4_OOB;

import java.util.Scanner;

public class phuong_trinh_bac_2 {
    private double a;
    private double b;
    private double c;

    public phuong_trinh_bac_2() {
    }

    public phuong_trinh_bac_2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant (){
        return Math.pow(b,2) - 4 * a * getC();
    }

    public double getRoot1(){
        if(getDiscriminant()<0){
            return 0;
        } else {
            return (-getB() + Math.pow(getDiscriminant(), 0.5)) / (2 * getA());
        }
    }

    public double getRoot2(){
        if(getDiscriminant()<0){
            return 0;
        } else {
            return (-getB() - Math.pow(getDiscriminant(), 0.5)) / (2 * getA());
        }
    }

    @Override
    public String toString() {
        return "phuong_trinh_bac_2{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        double a = scanner.nextDouble();

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Nhập số b: ");
        double b = scanner1.nextDouble();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Nhập số c: ");
        double c = scanner2.nextDouble();

        phuong_trinh_bac_2 quadraticEquation = new phuong_trinh_bac_2(a,b,c);
        if(quadraticEquation.getRoot1() != 0 && quadraticEquation.getRoot2() !=0 ){
            if(quadraticEquation.getRoot1() == quadraticEquation.getRoot2()){
                System.out.println("Phương trình có 1 nghiệm là: " + quadraticEquation.getRoot1());
            } else {
                System.out.println("Phương trình có 2 nghiệm là: " + quadraticEquation.getRoot1() + " và " + quadraticEquation.getRoot2() );
            }
        } else {
            System.out.println("Phương trình vô nghiệm");
        }

    }
}
