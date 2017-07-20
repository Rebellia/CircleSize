import javax.swing.*;
import java.awt.*; //For Graphics and Color classes
import java.awt.event.*; //For event listeners

public class CircleSizePanel extends JPanel
{
	//instance variables
	private int diameter, x_coordinate, y_coordinate, sizeStep, moveStep;
	
	//constructor
	public CircleSizePanel()
	{
		diameter = 200;
		x_coordinate = 100;
		y_coordinate = 100;
		sizeStep = 50;
		moveStep = 50;
		addKeyListener(new SizeListener());
		this.setFocusable(true); //Only focused compenents can use keyEvent
	}
	
	//paintComponent
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		setBackground(Color.black);
		page.setColor(Color.red);
		page.fillOval(x_coordinate, y_coordinate, diameter, diameter);
	}
	
	//KeyListener class
	private class SizeListener implements KeyListener
	{
		public void keyPressed (KeyEvent event)
		{
			switch (event.getKeyCode())
			{
				case KeyEvent.VK_UP:
					diameter += sizeStep; //moves the circle up
					break;
				case KeyEvent.VK_DOWN:
					diameter -= sizeStep; //moves the circle down
					break;
				case KeyEvent.VK_LEFT:
					x_coordinate -= moveStep;
					break;
				case KeyEvent.VK_RIGHT:
					x_coordinate += moveStep;
					break;
			}//end of switch
			
			
			repaint();
		}
		public void keyReleased(KeyEvent event){}
		public void keyTyped(KeyEvent event) {}
	}//end of KeyListener class
	
}//end of class