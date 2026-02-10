package Day_27;

class mythread implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hi");
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        mythread obj1 = new mythread();
        Thread t = new Thread(obj1);

        t.start();
    }
}
