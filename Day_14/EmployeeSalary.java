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

    static class FullTimeEmployee extends Employee{
        double monthlySalary;
        double bonus;

        FullTimeEmployee(String name,int id,double monthlySalary,double bonus){
            super(name,id);

            if(monthlySalary <0 || bonus<0){
                System.out.println("Salary/Bonus can't be negative");
            }

            this.monthlySalary = monthlySalary;
            this.bonus = bonus;
        }

        @Override
        double calculateSalary(){
            return monthlySalary+bonus;
        }
    }

    static class PartTimeEmployee extends Employee{
        int hoursWorked;
        double hourlyRate;

        PartTimeEmployee(String name,int id,int hoursWorked,double hourlyRate){
            super(name,id);

            if(hoursWorked<0 || hourlyRate<0){
                System.out.println("Invalid hours or rate");
            }

            this.hoursWorked = hoursWorked;
            this.hourlyRate = hourlyRate;
        }

        @Override
        double calculateSalary(){
            if(hoursWorked>40){
                return(40*hourlyRate) +((hoursWorked-40) * hourlyRate *1.5);
            }
            return hoursWorked *hourlyRate;
        }
    }

    static class Intern extends Employee{
        double stipend;

        Intern(String name,int id,double stipend){
            super(name,id);
            
            if(stipend<0){
                System.out.println("Stipend can't be negative");
            }

            this.stipend = stipend;
        }

        @Override
        double calculateSalary(){
            return stipend;
        }
    }

    static double applyTax(double salary){
        return salary*0.9;
    }

    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Ram", 1, 30000, 10000);
        Employee e2 = new PartTimeEmployee("Hari", 2, 50, 100);
        Employee e3 = new Intern("Shyam", 3, 20000);

        Employee[] employees = {e1, e2, e3};

        for(Employee e : employees){
            e.displayInfo();

            double salary = e.calculateSalary();
            double finalSalary = applyTax(salary);
            
            System.out.println("Gross Salary: " + salary);
            System.out.println("After Tax: " + finalSalary);

            System.out.println("-----------------------------------");
        }
    }
}
