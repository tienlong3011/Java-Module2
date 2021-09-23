package Java_B6_Point2D_Point3D;

public class test {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(1.2f,3.1f,3f);
        System.out.println(point3D);
        point3D.setXYZ(1,3.2f,5);
        System.out.println(point3D);
    }
}
