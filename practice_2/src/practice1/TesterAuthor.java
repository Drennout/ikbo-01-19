package practice1;

public class TesterAuthor {
    public static void main(String[] args) {
        Author author = new Author("name_author", "email@email.com", 'g');
        System.out.println(author.toString());
        author.setGender('f');
        System.out.println(author.toString());
    }

}

class Author {
    private char gender;
    private String name, email;

    Author(String name, String email, char gender){
        this.email = email;
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toString(){
        return "Name is " + getName() + "\nEmail is " + getEmail() + "\nGender is " + getGender();
    }
}