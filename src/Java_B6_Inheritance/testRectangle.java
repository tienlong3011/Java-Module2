package Java_B6_Inheritance;

public class testRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle("orange", true, 2.5, 3.8);
        System.out.println(rectangle);

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}
