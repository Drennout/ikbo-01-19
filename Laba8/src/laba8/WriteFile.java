package laba8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("file.txt", true))
        {
            // запись всей строки
            String text = "Hello Gold!";

            while(!text.contains("exit")){
                text = in.next();
                writer.write(text);
                writer.append("\n");
            }
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
