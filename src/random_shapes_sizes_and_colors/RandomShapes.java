package random_shapes_sizes_and_colors;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.Random;

/** 
 * 
 *	Name: Benjamin DosSantos 
 *	Assignment: Random Shape Sizes and colors
 *	Project Description: a.	This program is intended 
 *	to make a full size applet that will be filled with: 
 *	My Name, 6 lines, 12 Ovals, and 42 Rectangles. The 
 *	only thing that stays in the same place and is the same 
 *	color is my name. All other objects are randomly placed 
 *	and have a random color each loop for generation. 
 * 
 **/

public class RandomShapes extends Applet{

	public Random ran = new Random();
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int width = (int) screenSize.getWidth();
	int height = (int) screenSize.getHeight();
	
	int linestart_x = 0;
	int linestart_y = 0;
	int lineend_x;
	int lineend_y;
	
	public void init(){
		
		this.setSize(new Dimension(width, height));
		
		int red = ran.nextInt(255);
		int green = ran.nextInt(255);
		int blue = ran.nextInt(255);
		
		Color bgcolor = new Color(red, green, blue);
		
		this.setBackground(bgcolor);
		
	}
	
	public void paint(Graphics g){
		
		String name = "Benjamin";
		
		int rect_width = ran.nextInt(100) + 100;
		int rect_height = ran.nextInt(100) + 100;
		
		for(int i = 0; i <= 42; i++){
			
			int red = ran.nextInt(255);
			int green = ran.nextInt(255);
			int blue = ran.nextInt(255);
			
			Color rectcolor = new Color(red, green, blue);
		
			int rectstart_x = ran.nextInt(width);
			int rectstart_y = ran.nextInt(height);
			
			g.setColor(rectcolor);
			
			g.fillRect(rectstart_x, rectstart_y, rect_width, rect_height);
			
		}
		
		for(int i = 0; i <= 6; i++){
			
			int red = ran.nextInt(255);
			int green = ran.nextInt(255);
			int blue = ran.nextInt(255);
			
			Color linecolor = new Color(red, green, blue);
			
			int lineend_x = ran.nextInt(width / 2);
			int lineend_y = ran.nextInt(height / 2);
			
			g.setColor(linecolor);
			
			g.drawLine(linestart_x, linestart_y, lineend_x, lineend_y);
			
		}
		
		for(int i = 0; i <= 12; i++){
			
			int ovalstart_x = ran.nextInt(width);
			int ovalstart_y = ran.nextInt(height);
			int oval_width = ran.nextInt(width / 4);
			int oval_height = ran.nextInt(height / 4);
			
			int red = ran.nextInt(255);
			int green = ran.nextInt(255);
			int blue = ran.nextInt(255);
			
			Color ovalcolor = new Color(red, green, blue);
			
			g.setColor(ovalcolor);
			
			g.fillOval(ovalstart_x, ovalstart_y, oval_width, oval_height);
			
		}
		
		g.drawString(name, width / 2, height / 2);
	
	}
}
