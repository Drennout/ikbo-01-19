package laba4;

public class Tester implements Nameable {
    private String name;

    Tester(String name){
        this.name = name;
    }

    @Override
    public String getName(){return this.name;}

    public static void main(String[] args) {
        Tester tester = new Tester("Name object");
        System.out.println(tester.getName());
    }
}
