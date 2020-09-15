package practice3; // Ex4

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "Red", false);
        System.out.println(s1);
        System.out.println("Area = " + s1.getArea());
        System.out.println("Perimetr = " + s1.getPerimetr());
        System.out.println("Color is " + s1.getCollor());
        System.out.println("Filled is " + s1.isFilled());
        //System.out.println(s1.getRadius);

        Circle c1 = (Circle)s1;
        System.out.println(c1);
        c1.setRadius(6.0);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimetr());
        System.out.println(c1.getCollor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //Shape s2 = new Shape();

        Shape s3 = new Rectangle(1.0, 2.0, "Red", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimetr());
        System.out.println(s3.getCollor());
       // System.out.println(s3.getLength());

        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getCollor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        //System.out.println(s4.getColor());
        //System.out.println(s4.getSide());

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getCollor());
        //System.out.println(r2.getSide());
        System.out.println(r2.getLength());

        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getCollor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
  }
}