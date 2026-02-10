package Day_27;

class mythreadEven implements Runnable{
    public void run(){
        for(int i=50;i<=100;i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
}

class mythreadOdd implements Runnable{
    public void run(){
        for(int i=100;i<200;i++){
            if(i%2 == 1){
                System.out.println(i);
            }
        }
    }
}
public class OddEvenThread {
    public static void main(String[] args) {
        mythreadEven obj1 = new mythreadEven();
        Thread tEven = new Thread(obj1);
        tEven.start();

        mythreadOdd obj2 = new mythreadOdd();
        Thread tOdd = new Thread(obj2);
        tOdd.start();
    }
}
