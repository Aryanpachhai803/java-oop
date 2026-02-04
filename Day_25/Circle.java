package Day_25;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Circle extends JFrame {
    int x = -1;
    int y = -1;
    public Circle() {
        setTitle("Click to Draw Circle");
        setSize(400, 300);
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });
        setVisible(true);
    }
    public void paint(Graphics g) {
        super.paint(g);
        if (x != -1 && y != -1) {
            g.setColor(Color.RED);
            g.fillOval(x - 20, y - 20, 40, 40);
        }
    }
    public static void main(String[] args) {
        Circle c = new Circle();
    }
}
