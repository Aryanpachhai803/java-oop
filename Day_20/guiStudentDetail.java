package Day_20;

import javax.swing.*;

public class guiStudentDetail {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Student Registration");

        JLabel jlS = new JLabel("Student Details");
        jlS.setBounds(150, 50, 100, 20);
        jf.add(jlS);

        JLabel jlN = new JLabel("Name : ");
        jlN.setBounds(50, 100, 50, 20);
        jf.add(jlN);

        JTextField jtfN = new JTextField();
        jtfN.setBounds(120, 100, 150, 20);
        jf.add(jtfN);

        JLabel jlA = new JLabel("Age :");
        jlA.setBounds(50, 120, 50, 20);
        jf.add(jlA);

        Integer[] ages = {18, 19, 20, 21, 22};
        JComboBox<Integer> ageBox = new JComboBox<>(ages);
        ageBox.setBounds(120, 120, 150, 20);
        jf.add(ageBox);

        JLabel jlG = new JLabel("Gender :");
        jlG.setBounds(50, 140, 50, 20);
        jf.add(jlG);

        JRadioButton jrbM = new JRadioButton("Male");
        jrbM.setBounds(120, 140, 60, 20);
        jf.add(jrbM);

        JRadioButton jrbF = new JRadioButton("Female");
        jrbF.setBounds(180, 140, 80, 20);
        jf.add(jrbF);

        JLabel jlH = new JLabel("Hobbies :");
        jlH.setBounds(50, 160, 80, 20);
        jf.add(jlH);

        JCheckBox jcP = new JCheckBox("Playing");
        jcP.setBounds(120, 160, 80, 20);
        jf.add(jcP);

        JCheckBox jcS = new JCheckBox("Singing");
        jcS.setBounds(200, 160, 80, 20);
        jf.add(jcS);

        JCheckBox jcSw = new JCheckBox("Swim");
        jcSw.setBounds(280, 160, 80, 20);
        jf.add(jcSw);

        JLabel jlC = new JLabel("Countries :");
        jlC.setBounds(50, 180, 80, 20);
        jf.add(jlC);

        String[] countries = {"Nepal", "Korea", "France", "Brazil"};
        JList<String> countryList = new JList<>(countries);
        countryList.setBounds(120, 180, 120, 70);
        jf.add(countryList);

        JLabel jlComment = new JLabel("Comments :");
        jlComment.setBounds(50, 270, 80, 20);
        jf.add(jlComment);

        JTextField jtfComment = new JTextField();
        jtfComment.setBounds(120, 270, 150, 80);
        jf.add(jtfComment);

        JButton jbS = new JButton("Submit");
        jbS.setBounds(100, 380, 80, 20);
        jf.add(jbS);

        JButton jbCancel = new JButton("Cancel");
        jbCancel.setBounds(200, 380, 80, 20);
        jf.add(jbCancel);

        jf.setSize(500,500);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}
