package Java_B6_Circle_Cylinder;

public class Cylinder extends Circle{

    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color,double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double cylinderVolume(){
        return Math.PI * super.getRadius() * super.getRadius() * getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder{" + super.toString() +
                "height=" + height +
                '}';
    }
}
