package Day_14;

public class EmployeeSalary {
    static abstract class Employee{
        String name;
        int id;

        Employee(String name,int id){
            this.name = name;
            this.id = id;
        }

        abstract double calculateSalary();

        void displayInfo(){
            System.out.println("ID: " + id + ", Name: " + name);
        }
    }
    public static void main(String[] args) {
        
    }
}
