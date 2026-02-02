package Day_24;

import javax.swing.*;
import java.awt.event.*;

public class EventHandling extends JFrame implements KeyListener {
    JTextField jtfFirst;
    JTextField jtfSecond;
    JTextField jtfResult;
    EventHandling() {
        setTitle("Key Events");

        JLabel jbFirst = new JLabel("First Value :");
        jbFirst.setBounds(50, 50, 100, 20);
        add(jbFirst);
        jtfFirst = new JTextField();
        jtfFirst.setBounds(150, 50, 150, 20);
        add(jtfFirst);

        JLabel jbSecond = new JLabel("Second Value :");
        jbSecond.setBounds(50, 100, 100, 20);
        add(jbSecond);
        jtfSecond = new JTextField();
        jtfSecond.setBounds(150, 100, 150, 20);
        add(jtfSecond);

        JLabel jbResult = new JLabel("Result :");
        jbResult.setBounds(50, 150, 100, 20);
        add(jbResult);
        jtfResult = new JTextField("Press a or s to calculate");
        jtfResult.setBounds(150, 150, 150, 20);
        add(jtfResult);

        JButton jbCalculate = new JButton("Calculate");
        jbCalculate.setBounds(150, 200, 100, 20);
        add(jbCalculate);

        jtfResult.addKeyListener(this);

        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }

    public void keyPressed(KeyEvent ke) {
        int x,y,z=0;
        x = Integer.parseInt(jtfFirst.getText());
        y = Integer.parseInt(jtfSecond.getText());

        if(ke.getKeyChar() == 'a'){
            z = x + y;
        }

        if(ke.getKeyChar() == 's'){
            z = x - y;
        }
        jtfResult.setText(String.valueOf(z));
    }

    public void keyReleased(KeyEvent ke) {

    }

    public void keyTyped(KeyEvent ke) {

    }

    public static void main(String[] args) {
        EventHandling eh = new EventHandling();
    }
}
