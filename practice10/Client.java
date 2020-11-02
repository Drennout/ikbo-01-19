package practice10;

import java.util.Scanner;

public class Client {
    public Chair chair;

    public void sit(){
        System.out.println("Sit..");
    }

    public void setChair(Chair chair){
        this.chair = chair;
    }
}

class Main {
    public static void main(String[] args) {
        ChairFactory factory = new ChairFactory();

        Chair chair = new FunctionalChair();

        Client client = new Client();
        System.out.println("Input name of chair which you want");
        String typeChair = new Scanner(System.in).next();

        switch (typeChair){
            case "victorian":
                System.out.println("Input age chair");
                client.setChair(factory.CreateVictorianChair(new Scanner(System.in).nextInt()));
                client.chair = (VictorianChair)client.chair;
                System.out.println("age of chair = "+((VictorianChair) client.chair).getAge());
                break;
            case "functional":
                client.setChair(factory.CreateFunctionalChair());
                client.chair = (FunctionalChair)client.chair;
                System.out.println("sum 1 + 2 by chair = " + ((FunctionalChair) client.chair).sum(1, 2));
                break;

            case "magic":
                client.setChair(factory.CreateMagicChair());
                client.chair = (MagicChair)client.chair;
                ((MagicChair) client.chair).doMagic();
                break;
            default:
                client.setChair(null);
                break;
        }
    }
}
