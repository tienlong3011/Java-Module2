package Java_B4_OOB;

public class Fan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

//    public Fan(int speed, boolean on, double radius, String color) {
//        this.speed = speed;
//        this.on = on;
//        this.radius = radius;
//        this.color = color;
//    }

    public int getSpeed() {
        return speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public String getColor() {
        return color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (isOn() == true) {
            return "Fan is On{" + "speed=" + speed + ", on=" + on + ", radius=" + radius + ", color='" + color + '\'' + '}';
        } else {
            return "Fan is Off{" + "radius=" + radius + ", color='" + color + '\'' + '}';
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.fast);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(fan1.medium);
        System.out.println(fan2.toString());


    }

}



