package Day_21;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class layoutExample {
    public static void main(String[] args) {
        JFrame jf = new JFrame("JLayout");

        // JButton jbB1 = new JButton("Button 1");
        // jf.add(jbB1);

        // JButton jbB2 = new JButton("Button 2");
        // jf.add(jbB2);

        // JButton jbB3 = new JButton("Button 3");
        // jf.add(jbB3);

        // JButton jbB4 = new JButton("Button 4");
        // jf.add(jbB4);

        // JButton jbB5 = new JButton("Button 5");
        // jf.add(jbB5);

        // jf.setSize(500,500);
        // jf.setLayout(new FlowLayout());
        // jf.setVisible(true);

        // JButton jbB1 = new JButton("Button 1");
        // jf.add(jbB1,BorderLayout.CENTER);

        // JButton jbB2 = new JButton("Button 2");
        // jf.add(jbB2,BorderLayout.NORTH);

        // JButton jbB3 = new JButton("Button 3");
        // jf.add(jbB3,BorderLayout.SOUTH);

        // JButton jbB4 = new JButton("Button 4");
        // jf.add(jbB4,BorderLayout.EAST);

        // JButton jbB5 = new JButton("Button 5");
        // jf.add(jbB5,BorderLayout.WEST);

        // jf.setSize(400,300);
        // jf.setLayout(new BorderLayout());
        // jf.setVisible(true);


        JButton jbB1 = new JButton("Button 1");
        jf.add(jbB1);

        JButton jbB2 = new JButton("Button 2");
        jf.add(jbB2);

        JButton jbB3 = new JButton("Button 3");
        jf.add(jbB3);

        JButton jbB4 = new JButton("Button 4");
        jf.add(jbB4);

        JButton jbB5 = new JButton("Button 5");
        jf.add(jbB5);

        JButton jbB6 = new JButton("Button 6");
        jf.add(jbB6);

        JButton jbB7 = new JButton("Button 7");
        jf.add(jbB7);

        JButton jbB8 = new JButton("Button 8");
        jf.add(jbB8);
        
        jf.setSize(400,300);
        jf.setLayout(new GridLayout(4,4));
        jf.setVisible(true);
    }
}
