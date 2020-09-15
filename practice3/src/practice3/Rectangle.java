package practice3;

public class Rectangle extends Shape{
    private double width, length;

    Rectangle(){}

    Rectangle(double width, double length){
        this.length = length;
        this.width = width;
    }

    Rectangle(double width, double length, String collor, boolean filled){
        super(collor, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimetr() {
        return 2*(length+width);
    }

    @Override
    public String toString() {
        if (getCollor() != null) {
            return "Rectange\nwidth = " + width + "\nlength = " + length +
                    "\ncollor is " + getCollor() + "\nfilled is" + isFilled();
        }
        else
            return "width = " + width + "\nlength = " + length;
    }
}
