package Java_B4_OOB;

import java.util.Scanner;

public class lop_hinh_chu_nhat {
    double width;
    double height;

    //contructor không có tham số
    public lop_hinh_chu_nhat() {
    }

    //contructor có tham số
    public lop_hinh_chu_nhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return getWidth()*getHeight();
    }
    public double getPerimeter(){
        return  (getHeight() + getWidth()) * 2;
    }

    @Override
    public String toString() {
        return "lop_hinh_chu_nhat{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều rộng: ");
        double width = sc.nextDouble();

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double height = sc1.nextDouble();

        lop_hinh_chu_nhat rectangle = new lop_hinh_chu_nhat(width,height);
        System.out.println("Your Rectangle: " + rectangle.toString());
        System.out.println("Chu vi hình chữ nhật là: " + rectangle.getPerimeter());
        System.out.println("Diện tích hình chữ nhật là: " + rectangle.getArea());
    }
}

