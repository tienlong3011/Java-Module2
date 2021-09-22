package Java_B5_Accessmodifier_Static;

public class AccessModifier {
    private double radius = 1.0;
    private String color = "red";

    public AccessModifier() {
    }

    public AccessModifier(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }


    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "AccessModifier{" + "radius=" + radius + ", color='" + color + '\'' + ", S= " + getArea() + '}';
    }

    public static void main(String[] args) {
        AccessModifier TestCircle = new AccessModifier();
        TestCircle.setRadius(2);
        TestCircle.setColor("blue");
        TestCircle.getArea();
        System.out.println(TestCircle.toString());

    }
}
