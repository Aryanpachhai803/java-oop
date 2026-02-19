package Day_26;

public class MultiThread {
    class Counter {
        public int count = 0;

        public void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }
    class MyThread extends Thread {
    public Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
    public static void main(String[] args) {

    }
}
