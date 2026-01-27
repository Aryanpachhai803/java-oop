package Day_20;

import javax.swing.*;

public class guiExample {
    public static void main(String[] args) {
        JFrame jf = new JFrame("JFrame Example");

        JLabel jlC = new JLabel("Course :");
        jlC.setBounds(100, 100, 50, 20);
        jf.add(jlC);

        JCheckBox jcBCA = new JCheckBox("BCA");
        jcBCA.setBounds(150, 100, 50, 20);
        jf.add(jcBCA);

        JCheckBox jcBCSIT = new JCheckBox("BCSIT");
        jcBCSIT.setBounds(150, 120, 100, 20);
        jf.add(jcBCSIT);
        
        JCheckBox jcCA = new JCheckBox("CA");
        jcCA.setBounds(150, 140, 50, 20);
        jf.add(jcCA);
        
        JRadioButton jrBIT = new JRadioButton("BIT",true);
        jrBIT.setBounds(150, 160, 50, 20);
        jf.add(jrBIT);

        JRadioButton jrCA = new JRadioButton("CA");
        jrCA.setBounds(150, 180, 50, 20);
        jf.add(jrCA);

        

        jf.setSize(500,500);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}
