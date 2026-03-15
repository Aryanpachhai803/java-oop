package Day_30;
import java.io.*;

class Student implements Serializable {
    String name, address;
    int id, marks;

    Student(String name, String address, int id, int marks){
        this.name = name;
        this.address = address;
        this.id = id;
        this.marks = marks;
    }
}

public class StudentSerializableDemo {
    public static void main(String[] args) {

    }
}