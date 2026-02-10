package Day_27;

class mythread implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hi");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class mythread1 implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        mythread obj1 = new mythread();
        Thread t = new Thread(obj1);

        mythread1 obj2 = new mythread1();
        Thread t1 = new Thread(obj2);
        
        t.start();
        t1.start();
    }
}
