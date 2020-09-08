package Lab1;

public class TesterBook {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthor("Author_Name");
        book.setName("Name_Book");
        book.setPages(123);
        book.setYear(1234);
        book.showResults();
    }
}

class Book{
    private int year, pages;
    private String name, author;

    public void setYear(int year){
        this.year = year;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void showResults(){
        System.out.println("Year = " + this.year + "\nPages = " + this.pages +
                "\nName is " + this.author + "\nAuthor is" + this.author);
    }
}
