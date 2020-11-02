package practice9;

public class Student implements Stundentable {
    private int mark;
    private String name;

    Student(int mark, String name){
        this.mark = mark;
        this.name = name;
    }

    @Override
    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getMatk() {
        return mark;
    }

    @Override
    public String getName() {
        return name;
    }
}
