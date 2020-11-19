package Laba9;

public class Task1 {
    public static void main(String[] args) {
        Exception1 exception1 = new Exception1();
        exception1.exeptionDemo();
    }
}


class Exception1{
    public void exeptionDemo(){
        try{
            System.out.println(2/0);
        }catch (ArithmeticException e){
            System.out.println("Attempted division by zero");
        }
    }
}