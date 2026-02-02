package Day_24;
import javax.swing.*;

import java.awt.Graphics;
import java.awt.event.*;
public class MouseListenerEvent extends JFrame implements MouseListener{
	int x, y, r1, r2;
	MouseListenerEvent(){
		super("Hello");
		addMouseListener(this);
		setLayout(null);
		setSize(400, 300);
		setVisible(true);
	}
	public void mousePressed(MouseEvent me) {
		
	}
	public void mouseClicked(MouseEvent me) {
		x = me.getX();
		y = me.getY();
		r1 = 100;
		r2 = 60;
		repaint();
	}
	
	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void paint(Graphics g) {
		g.drawOval(x, y, r1, r2);
	}
	public static void main(String[] args) {
		EventHandling ed = new EventHandling();
	}
}
