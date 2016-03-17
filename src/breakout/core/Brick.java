package breakout.core;

import java.awt.Color;
import java.awt.Graphics;

public class Brick {
	
	
	private static int brick_x;
	private static int brick_y;
	private static int brick_width;
	private static int brick_height;
	private static Color brickcolor;
	private static Color outlinecolor;
	
	public Brick(int brick_x, int brick_y, int brick_width, int brick_height, Color brickcolor, Color outlinecolor) {
		super();
		this.brick_x = brick_x;
		this.brick_y = brick_y;
		this.brick_width = brick_width;
		this.brick_height = brick_height;
		this.brickcolor = brickcolor;
		this.outlinecolor = outlinecolor;
	}

	public void drawBrick(Graphics g){
		
		g.setColor(brickcolor);
		g.fillRect(brick_x, brick_y, brick_width, brick_height);
		g.setColor(outlinecolor);
		g.drawRect(brick_x, brick_y, brick_width + 1, brick_height + 1);
		
	}
	
	public static void generateBrick(Graphics g, int amountofbricks){
		
		for(int b = 0; b < amountofbricks; b++){
		
			g.setColor(brickcolor);
			g.fillRect(brick_x, brick_y, brick_width, brick_height);
			g.setColor(outlinecolor);
			g.drawRect(brick_x, brick_y, brick_width, brick_height);
			
		}
	}

	public int getBrick_x() {
		return brick_x;
	}

	public void setBrick_x(int brick_x) {
		this.brick_x = brick_x;
	}

	public int getBrick_y() {
		return brick_y;
	}

	public void setBrick_y(int brick_y) {
		this.brick_y = brick_y;
	}
	
	public void setColor(Color brickcolor) {
		this.brickcolor = brickcolor;
	}
	
}
