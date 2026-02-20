package Day_26;

public class TrafficLight implements Runnable {

    String currentColor;

    public TrafficLight() {
        currentColor = "RED";
    }

    @Override
    public void run() {
        while (true) {

            if (currentColor.equals("RED")) {
                System.out.println("🔴 RED - Stop");
                sleep(5000);
                currentColor = "GREEN";

            } else if (currentColor.equals("GREEN")) {
                System.out.println("🟢 GREEN - Go");
                sleep(4000);
                currentColor = "YELLOW";

            } else if (currentColor.equals("YELLOW")) {
                System.out.println("🟡 YELLOW - Slow down");
                sleep(2000);
                currentColor = "RED";
            }
        }
    }

    void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.out.println("Traffic Light interrupted.");
        }
    }

    public static void main(String[] args) {
    }
}