package colors.core;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Michael extends Applet{

	public void paint(Graphics g){
		
		int R = (int)(Math.random()*255);
		int G = (int)(Math.random()*255);
		int B = (int)(Math.random()*255);
		
		Color test = new Color(R, G, B);
		
		setBackground(test);
		
	}
	
}
