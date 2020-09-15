package practice3;

public class Square extends Rectangle{
    Square(){}

    Square(double side){
        setLength(side);
        setWidth(side);
    }

    Square(double side, String collor, boolean filled){
        setCollor(collor);
        setFilled(filled);
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setLength(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square\n" +
                "side = " + getLength();
    }

    public double getSide(){
        return getLength();
    }
}
