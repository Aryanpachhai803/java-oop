package Day_25;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Adapter extends MouseAdapter {
    JLabel l;
    JFrame f;
    Adapter(){
        f = new JFrame("Mouse Adapter Example");
        
        l = new JLabel("Mouse Event Here");
        l.setBounds(20, 50, 200, 200);
        f.add(l);

        f.setSize(500,500);
        f.setLayout(null);
        f.addMouseListener(this);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Adapter();
    }
    public void mouseClicked(MouseEvent e){
        l.setText("Mouse Clicked");
    }
}