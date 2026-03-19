package Day_33;
import java.awt.*;
import java.applet.*;

/*
     <applet code = "LifeCycle" width=500 height=400></applet>
*/

public class LifeCycle extends Applet {
    public void init(){
        System.out.println("Applet initalized");
    }
    public void start(){
        System.out.println("Applet is being executed");
    }
    public void stop(){
        System.out.println("Applet execution has stopped");
    }
    public void paint(Graphics g){
        System.out.println("Painting the applet");
    }
    public void destroy(){
        System.out.println("Applet has been destroyed");
    }
}
