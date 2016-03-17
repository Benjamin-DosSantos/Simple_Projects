package breakout.core;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 
 * @author Benjamin DosSantos
 * Description: This program creates an applet that draws a playable Breakout game.
 * 
 **/

public class Breakout extends Applet{
	
	/** Randomize Int **/
	Random rand = new Random();
	int player_red = rand.nextInt(256);
	int player_green = rand.nextInt(256);
	int player_blue = rand.nextInt(256);
	
	/** Integers **/
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	static int width = (int)(screenSize.getWidth());
	static int height = (int)(screenSize.getHeight());
	
	int player_width = 200;
	int player_height = 50;
	int player_x_pos = (width / 2);
	int player_y_pos = (height - 300);
	
	int ball_x_pos = player_x_pos;
	int ball_y_pos = player_y_pos;
	int ball_width = 32;
	int ball_height = ball_width;
	
	int sizeofbrick = 64;
	int numberofblocks = (width / sizeofbrick);
	int numberofrows = 4;
	int brick_x = 0;
	int brick_y = 0;
	
	int b = 0;
	int c = 0;
	int r = 0;
	
	/** Strings **/
	static String frametitle = "Breakout";
	
	/** Doubles **/
	static double version = 0.05; 
	
	/** Colors **/
	Color backgroundcolor = Color.DARK_GRAY;
	Color player_rand = new Color(player_red, player_green, player_blue);
	Color brick_color = Color.MAGENTA;
	Color outline_color = Color.BLACK;
	Color player_color = Color.BLUE;
	Color player_outline = Color.BLACK;
	Color ball_color = Color.CYAN;
	Color ball_outline = Color.BLACK;
	
	/** Base Brick Call **/
	Brick basebrick = new Brick(brick_x, brick_y, sizeofbrick, sizeofbrick, brick_color, outline_color);
	
	/** Base Player Call **/
	Player player = new Player(player_x_pos, player_y_pos, player_width, player_height, player_color, player_outline);
	
	/** Base Ball Call **/
	Ball ball = new Ball(ball_x_pos, ball_y_pos, ball_width, ball_height, ball_color, ball_outline);
	
	List<Integer> BlockPos = new ArrayList<Integer>();

	
	
	public static void main(String[] args){ }	// End Of Main
	
	public void init(){ 

		this.setSize(width, height);
		this.setBackground(backgroundcolor);
		
	}	// End Of Init
	
	public void paint(Graphics g){
	
		player.drawPlayer(g);
		genBlocks(g);
		ball.drawBall(g);
		
  }	// End of Paint
	
	public void genBlocks(Graphics g){
		for (r = 0; r < numberofrows; r++){
			for ( c = 0;  c < numberofblocks;  c++ ) {
		  
		  		BlockPos.add(basebrick.getBrick_x());
		  		BlockPos.add(basebrick.getBrick_y());
		  
	            basebrick.drawBrick(g);
	            basebrick.setBrick_x(brick_x = brick_x + sizeofbrick);
	           
	          // System.out.println(BlockPos);
		    }   
			
			basebrick.setColor(Color.GREEN);
			basebrick.setBrick_y(brick_y + sizeofbrick);
			brick_x = -sizeofbrick;
			
		}	// End Of For Loop  	
	}	// End Of GenBlocks
}	// End of class