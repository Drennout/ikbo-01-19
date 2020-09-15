package practice3;

class ShapeTester{
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle(7, 8, "blue", true);
        System.out.println(rectangle.toString() +
                "\nPerimetr = " + rectangle.getPerimetr() + "\nArea = " + rectangle.getArea());

        Square square = new Square();
        square.setLength(10);
        System.out.println(square.toString() +
                "\nPerimetr = " + square.getPerimetr() + "\nArea = " + square.getArea());

    }
}

public abstract class Shape{
    private String collor;
    private boolean filled;

    Shape(){}

    Shape(String collor, boolean filled){
        this.collor = collor;
        this.filled = filled;
    }

    public String getCollor() {
        return collor;
    }

    public void setCollor(String collor) {
        this.collor = collor;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimetr();
    public abstract String toString();
}


