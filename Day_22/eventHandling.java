package Day_22;

import javax.swing.*;
import java.awt.event.*;

public class eventHandling extends JFrame implements ActionListener{
    JTextField tf;
    eventHandling(){ 
        setTitle("Event Example");

        JButton btn = new JButton("Send");
        btn.setBounds(100,100,80,20);
       add(btn);

       tf = new JTextField();
       tf.setBounds(100,80,200,20);
       add(tf);

        setSize(500,500);
        setLayout(null);
        setVisible(true);  
}
    public void actionPerformed(ActionEvent ae){
        tf.setText("Hello There");
        add(tf);
    }
    public static void main(String[] args) {
        eventHandling eh = new eventHandling();
    }
}


