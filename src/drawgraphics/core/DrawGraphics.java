package drawgraphics.core;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

public class DrawGraphics extends Applet{

	
	
	int width,height; 
	
	

	
	public void paint(Graphics g){ 
		Color linecolor = Color.RED;
		int startx = 0;
		int starty = 0;
		int endx = 0;
		int endy = 0;
		int spacing = 0; 
		
		g.setColor(linecolor);
		
		endy = height;
		g.drawLine(startx + spacing, starty, endx + spacing, endy);
		endy = endy - 1;
		startx = startx + 1;
		endx = endx + 1;
		
		
	}
	
	public void init(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		width = (int)(screenSize.getWidth());
		height = (int)(screenSize.getHeight());
		 
		Color bgcolor = Color.black;
		
		this.setSize(width, height);
		this.setBackground(bgcolor);
		
	}
	
}
