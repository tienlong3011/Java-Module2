package Java_B6_Point_MoveablePoint;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Point point = new Point(2,3.5f);
        MovablePoint movablePoint = new MovablePoint(3.5f,2,9,4);
        System.out.println(point);
        System.out.println(movablePoint);
        MovablePoint movablePoint1 = movablePoint.move();
        System.out.println(movablePoint1);
    }
}
