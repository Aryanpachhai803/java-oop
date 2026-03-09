package Day_30;
import java.io.*;

class Employee implements Serializable {
    String name,address;
    int SSN,number;
    Employee(String name,String address,int SSN, int number){
        this.name = name;
        this.address = address;
        this.SSN = SSN;
        this.number = number;
    }
}

public class SerializableDemo{
    public static void main(String[] args) {
        // Transient object => Persistent object
        Employee e = new Employee("Aryan", "Butwal", 67, 986723123);
        try{
            FileOutputStream fos = new FileOutputStream("aryandata.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(e);
            System.out.println("Written Successfully");
        }
        catch(IOException ie){
            System.out.println(ie);
        }
    }
}
