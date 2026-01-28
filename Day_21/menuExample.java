package Day_21;

import javax.swing.*;

public class menuExample {
    public static void main(String[] args) {
        JFrame jf = new JFrame("JMenuBar");

        JMenuBar jmbMenu = new JMenuBar();

        JMenu jmFile = new JMenu("File");
        jmbMenu.add(jmFile);

        JMenu jmEdit = new JMenu("Edit");
        jmbMenu.add(jmEdit);

        JMenuItem jmiNew = new JMenuItem("New");
        jmFile.add(jmiNew);

        JMenuItem jmiOpen = new JMenuItem("Open");
        jmFile.add(jmiOpen);

        JMenuItem jmiOpenProject = new JMenuItem("Open Project from file");
        jmFile.add(jmiOpenProject);
    
        JMenuItem jmiUndo = new JMenuItem("Undo");
        jmEdit.add(jmiUndo);

        JMenuItem jmiRedo = new JMenuItem("Redo");
        jmEdit.add(jmiRedo);

        jf.setJMenuBar(jmbMenu);
        jf.setSize(500,500);
        jf.setLayout(null);
        jf.setVisible(true);
    }    
}
