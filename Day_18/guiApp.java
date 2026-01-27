package Day_18;

import javax.swing.JButton;
import javax.swing.JFrame;
// import java.awt.*; //Old version
import javax.swing.JLabel;
import javax.swing.JTextField;

public class guiApp {
    public static void main(String[] args) {
        JFrame jf = new JFrame("JFrame Example");
         
        JLabel jlN = new JLabel("Name:");
        jlN.setBounds(100, 100, 50, 20);
        jf.add(jlN);

        JTextField jtfN = new JTextField();
        jtfN.setBounds(160, 100, 100, 20);
        jf.add(jtfN);

        JLabel jlA = new JLabel("Address:");
        jlA.setBounds(100, 150, 50, 20);
        jf.add(jlA);

        JTextField jtfA = new JTextField();
        jtfA.setBounds(160, 150, 100, 20);
        jf.add(jtfA);

        JButton jb = new JButton("Tichik");
        jb.setBounds(180, 200, 100, 20);
        jf.add(jb);

        jf.setSize(500,500);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}
