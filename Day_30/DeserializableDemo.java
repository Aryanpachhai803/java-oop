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

public class DeserializableDemo{
    public static void main(String[] args) {
        Employee e = null;
        try{
            FileInputStream fis = new FileInputStream("aryanotherdata.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            e = (Employee) ois.readObject();
        }
        catch(IOException ie){
            System.out.println(ie);
        }
        System.out.println("Deserialization.....");
        System.out.println("Name: " + e.name);
        System.out.println("Address: " + e.address);
        System.out.println("SSN: " + e.SSN);
        System.out.println("Number: " + e.number);
    }
}
 