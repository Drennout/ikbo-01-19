package practice9;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(String errMessege){
        super(errMessege);
    }
}
