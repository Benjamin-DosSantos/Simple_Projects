package randnum.core;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class AppletColors extends Applet{

	int R = (int)(Math.random() * 255);
	int G = (int)(Math.random() * 255);
	int B = (int)(Math.random() * 255);
	
	Color colorBG = new Color(R, B, G);
	
	
	public static void main(String[] args){ }
	
	public void paint(Graphics g){ 
		
		 setBackground(colorBG);
		 setSize(600, 600);
		
	}
}