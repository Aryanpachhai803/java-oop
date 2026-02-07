package Day_25;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// public class Shape extends JFrame {
//     int x = -1;
//     int y = -1;
//     public Shape() {
//         setTitle("Click to Draw Circle");
//         setSize(400, 300);
//         addMouseListener(new MouseAdapter() {
//             public void mouseClicked(MouseEvent e) {
//                 x = e.getX();
//                 y = e.getY();
//                 repaint();
//             }
//         });
//         setVisible(true);
//     }
//     public void paint(Graphics g) {
//         super.paint(g);
//         if (x != -1 && y != -1) {
//             g.setColor(Color.RED);
//             g.fillOval(x - 20, y - 20, 40, 40);
//         }
//     }
//     public static void main(String[] args) {
//         Shape c = new Shape();
//     }
// }

public class Shape extends JFrame {
    int x = -1;
    int y = -1;
    public Shape() {
        setTitle("Click to Draw Square");
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
            g.fillRect(x - 20, y - 20, 40, 40);
        }
    }
    public static void main(String[] args) {
        Shape s = new Shape();
    }
}