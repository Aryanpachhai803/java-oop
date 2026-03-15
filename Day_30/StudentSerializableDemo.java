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
        Student s = new Student("Aryan", "Butwal", 101, 85);

        try{
            FileOutputStream fos = new FileOutputStream("studentdata.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s);
            System.out.println("Student record saved successfully");

            oos.close();
            fos.close();
        }
        catch(IOException ie){
            System.out.println(ie);
        }
    }
}