package applet_shapes.core;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.Random;

public class AppletShapes_Main extends Applet{

	/** Base Random System Call **/
	Random baserand = new Random();
	
	/** Integers **/
	
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	static int width = (int)(screenSize.getWidth());
	static int height = (int)(screenSize.getHeight());
	
	int bg_red = baserand.nextInt(256);
	int bg_green = baserand.nextInt(256);
	int bg_blue = baserand.nextInt(256);
	
	int randshift = 100;
	
	int rect_width = baserand.nextInt(100) + randshift;
	int rect_height = baserand.nextInt(100) + randshift;
	
	int name_x = (width / 2);
	int name_y = (height / 2);
	
	/** Colors **/
	Color backgroundcolor = new Color(bg_red, bg_green, bg_blue);
	
	public static void main(String[] args){ } 
	
	public void init(){ 
		
		this.setBackground(backgroundcolor);
		this.setSize(width, height);
		
	}
	
	public void paint(Graphics g){ 
		
		for(int s = 0; s <= 42; s++){
			
			int rect_x = baserand.nextInt(width);
			int rect_y = baserand.nextInt(height);
			
			int shape_red = baserand.nextInt(256);
			int shape_green = baserand.nextInt(256);
			int shape_blue = baserand.nextInt(256);
			
			Color shapecolor = new Color(shape_red, shape_green, shape_blue);
			
			g.setColor(shapecolor);
			
			g.fillRect(rect_x, rect_y, rect_width, rect_height);
			
		}	// End Of For Rectangles
		
		for(int l = 0; l < 6; l++){
			
			int line_start_x = baserand.nextInt(width / 2);
			int line_start_y = baserand.nextInt(height / 2);
			int line_end_x = baserand.nextInt(width / 2);
			int line_end_y = baserand.nextInt(width / 2);
			
			int shape_red = baserand.nextInt(256);
			int shape_green = baserand.nextInt(256);
			int shape_blue = baserand.nextInt(256);
			
			Color shapecolor = new Color(shape_red, shape_green, shape_blue);
			
			g.setColor(shapecolor);
			
			g.drawLine(line_start_x, line_start_y, line_end_x, line_end_y);
			
		}	// End Of For Lines
		
		for(int o = 0; o <= 12; o++){
			
			int oval_x = baserand.nextInt(width);
			int oval_y = baserand.nextInt(height);
			int oval_width = baserand.nextInt((width / 4));
			int oval_height = baserand.nextInt((height / 4));
			
			int shape_red = baserand.nextInt(256);
			int shape_green = baserand.nextInt(256);
			int shape_blue = baserand.nextInt(256);
			
			Color shapecolor = new Color(shape_red, shape_green, shape_blue);
			
			g.setColor(shapecolor);
			
			g.drawOval(oval_x, oval_y, oval_width, oval_height);
			
		}	// End Of For Ovals
		
		g.drawString("Benjamin", name_x, name_y);
		
	}	// End Of Paint
}	// End Of Class