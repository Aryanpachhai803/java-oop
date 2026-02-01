package Day_23;

import javax.swing.*;
import java.awt.event.*;

public class eventHandling extends JFrame implements ActionListener {
    JTextField jtfFvalue;
    JTextField jtfSvalue;
    JButton jbAdd;
    JButton jbSub;
    JTextField jtfRvalue;
    eventHandling(){
        setTitle("Handling Action Event");

        JLabel jlFvalue = new JLabel("First Value : ");
        jlFvalue.setBounds(50, 100, 100, 20);
        add(jlFvalue);

        jtfFvalue = new JTextField();
        jtfFvalue.setBounds(150,100,150,20);
        add(jtfFvalue);

        JLabel jlSvalue = new JLabel("Second Value : ");
        jlSvalue.setBounds(50, 150, 100, 20);
        add(jlSvalue);

        jtfSvalue = new JTextField();
        jtfSvalue.setBounds(150,150,150,20);
        add(jtfSvalue);

        JLabel jlRvalue = new JLabel("Result Value : ");
        jlRvalue.setBounds(50, 200, 100, 20);
        add(jlRvalue);

        jtfRvalue = new JTextField();
        jtfRvalue.setBounds(150,200,150,20);
        add(jtfRvalue);

        jbAdd = new JButton("Add");
        jbAdd.setBounds(80, 250, 100, 20);
        add(jbAdd);

        jbSub = new JButton("Subtract");
        jbSub.setBounds(200, 250, 100, 20);
        add(jbSub);

        jbAdd.addActionListener(this);
        jbSub.addActionListener(this);

        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        int x,y,z=0;

        x = Integer.parseInt(jtfFvalue.getText());
        y = Integer.parseInt(jtfSvalue.getText());

        if(jbAdd.getActionCommand() == "Add"){
            z = x+y;
        }
        if(jbSub.getActionCommand() == "Subtract"){
            z = x-y;
        }
        jtfRvalue.setText(String.valueOf(z));
    }
    public static void main(String[] args) {
        eventHandling eh = new eventHandling();
    }
}
