package Java_B6_Point_MoveablePoint;

public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed , float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        return new float[] {getxSpeed(),getySpeed()};
    }

    @Override
    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + "), Speed = (" + getxSpeed() + ", " + getySpeed() + ")";
    }

    public MovablePoint move (){
        float X = super.getX();
        float Y = super.getY();
        X += getxSpeed();
        Y += getySpeed();
        super.setX(X);
        super.setY(Y);
        return this;
    }
}
