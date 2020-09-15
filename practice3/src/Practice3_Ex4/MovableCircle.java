package Practice3_Ex4;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    MovableCircle(int x, int y, int radius, int xSpeed, int ySpeed){
        this.radius = radius;
        center =new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUp(){
        center.y += radius*center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y -= radius*center.ySpeed;
    }

    @Override
    public void moveRight() {
        center.x += radius*center.xSpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= radius*center.xSpeed;
    }
}