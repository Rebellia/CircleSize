//The goal of this project is to increase the size of a circle using arrowkeys

import java.awt.*; //To use Graphics and Colors
import java.awt.event.*; //To have event listeners
import javax.swing.*; //To use JComponents

public class CircleSize
{
	public static void main(String[] args)
	{
		JFrame csFrame = new JFrame("Circle Size");
		CircleSizePanel csPanel = new CircleSizePanel();
	
		csFrame.add(csPanel);
		csFrame.setSize(500, 500);
		csFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		csFrame.setVisible(true);
	}
	
}//end of class