package Day_19;

import javax.swing.*;

public class loginForm {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Login Form");
         
        JLabel jlUN = new JLabel("User Name:");
        jlUN.setBounds(100, 50, 80, 20);
        jf.add(jlUN);

        JTextField jtfUn = new JTextField();
        jtfUn.setBounds(180, 50, 145, 20);
        jf.add(jtfUn);

        JLabel jlP = new JLabel("Password:");
        jlP.setBounds(100, 70, 80, 20);
        jf.add(jlP);

        JPasswordField jpfP = new JPasswordField();
        jpfP.setBounds(180, 70, 145, 20);
        jf.add(jpfP);

        JButton jbL = new JButton("Login");
        jbL.setBounds(100, 100, 110, 20);
        jf.add(jbL);

        JButton jbC = new JButton("Cancel");
        jbC.setBounds(215, 100, 110, 20);
        jf.add(jbC);

        jf.setSize(500,200);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}
