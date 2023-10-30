
import java.util.Objects;

public class Abiturient {
    private int id;
    private String name;
    private String surname;
    private String midname;
    private String address;
    private int number;
    private double mark;

    public Abiturient(int id, String name, String surname, String midname, String address, int number, double mark) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.midname = midname;
        this.address = address;
        this.number = number;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMidname() {
        return midname;
    }

    public String getAddress() {
        return address;
    }

    public int getNumber() {
        return number;
    }

    public double getMark() {
        return mark;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMidname(String midname) {
        this.midname = midname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Abiturient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", midname='" + midname + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                ", mark=" + mark +
                '}';
    }

    public Integer compareTo(Abiturient otherStudent) {
        // Порівнюємо студентів за полем "age"
        return Double.compare(this.mark, otherStudent.getMark());
    }


    public void checkName(String othername) {
        if (Objects.equals(othername, this.name))
            System.out.println(this);
    }

    public void checkMark(double othermark){
        if(this.mark > othermark)
            System.out.println(this);
    }
}
