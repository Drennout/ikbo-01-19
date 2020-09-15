package practice3;

public class Circle extends Shape{

    private double radius;

    Circle(){}

    Circle(double radius){
        this.radius = radius;
    }

    Circle(double radius, String collor, boolean filled){
        super(collor, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimetr() {
        return 2*3.1415*radius;
    }

    @Override
    public double getArea() {
        return 3.1415*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle \n" +
                "radius = " + radius + "\nLine length = " + getPerimetr() + "\nArea = " + getArea();
    }
}
