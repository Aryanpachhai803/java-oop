package Day_26;


class mythread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
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

class mythread1 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
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
        obj1.start();
        
        mythread1 obj2 = new mythread1();
        obj2.start();
    }
}
