package Day_16;

public class exceptionCondition {
    public static void main(String[] args) {
        int d,a;
        try{
            d=0;
            a=34/d;
            System.out.println("This won't be printed");
        }
        catch(ArithmeticException ae){
            System.out.println("Divide by zero");
        }
        System.out.println("After catch statement programs flows");
    }

    // public static void main(String[] args) {
    //     int d =0,a;
    //     a = 10/d;
    //     System.out.println("Program here!");
    // }

    
}
