package Lab1;

public class DogTester {
    public static void main(String[] args) {
        Mops bulldog = new Mops(7, "DogMops", 999999);
        Pudel pudel = new Pudel(9, "DogPudel", true);

        bulldog.getInfo();
        pudel.getInfo();
    }
}

abstract class Dog{
    private String name, breed;
    private int month;

    Dog(int month, String name){
        this.month = month;
        this.name = name;
    }
    abstract void getInfo();

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public int getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }
}

class Pudel extends Dog{
    private boolean haircut;

    Pudel(int month, String name, boolean haircut){
        super(month, name);
        setBreed("Pudel");
        this.haircut = haircut;
    }

    public void getInfo(){
        System.out.println("Info about Pudel object\nBreed is " + getBreed() + "\nName is " + getName() +
                "\nMonth = " + getMonth() + "\nHaircute = " + haircut);
    }
}

class Mops extends Dog{
    private int quantityFolds;
    Mops(int month, String name, int quantityFolds){
        super(month, name);
        setBreed("Mops");
        this.quantityFolds = quantityFolds;
    }
    public void getInfo(){
        System.out.println("Info about Mops object\nBreed is " + getBreed() + "\nName is " + getName() +
                "\nMonth = " + getMonth() + "\nQuantity folds = " + quantityFolds);
    }
}