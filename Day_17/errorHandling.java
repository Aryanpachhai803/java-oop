package Day_17;

public class errorHandling {
    int division(int a,int b) throws
    ArithmeticException{
        int t= a/b;
        return t;
    }    
    public static void main(String[] args) {
        errorHandling obj = new errorHandling();
        try{
            obj.division(10, 0);
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero");
        }
    }
}
