package Practice3_Ex4;

public class MovableTester {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 5, 10);
        point.moveDown();
        System.out.println(point.toString());

        MovableCircle circle = new MovableCircle(0,0, 3, 10, 5);
        circle.moveLeft();
        System.out.println(circle.toString());

        MovableRectangle rectangle = new MovableRectangle(0, 0, 5, 5, 2, 4);
        rectangle.moveRight();
        System.out.println(rectangle.toString());

    }
}

class MovablePoint implements Movable{
    int x, y, xSpeed, ySpeed;
    MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp() {
        y += ySpeed;
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }
}

