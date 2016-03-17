package checkers.core;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class CheckersModRandom extends Applet{

	Random rand = new Random();
	
		/** Random Generation Of Color **/
	
	int framebackground_r = rand.nextInt(255);
	int framebackground_g = rand.nextInt(255);
	int framebackground_b = rand.nextInt(255);
	
	int checkerforground_r = rand.nextInt(255);
	int checkerforground_g = rand.nextInt(255);
	int checkerforground_b = rand.nextInt(255);
	
	int checkerbackground_r = rand.nextInt(255);
	int checkerbackground_g = rand.nextInt(255);
	int checkerbackground_b = rand.nextInt(255);
	
	int player1_color_r = rand.nextInt(255);
	int player1_color_g = rand.nextInt(255);
	int player1_color_b = rand.nextInt(255);
	
	int player2_color_r = rand.nextInt(255);
	int player2_color_g = rand.nextInt(255);
	int player2_color_b = rand.nextInt(255);
	
	int textcolor_r = rand.nextInt(255);
	int textcolor_g = rand.nextInt(255);
	int textcolor_b = rand.nextInt(255);
	
	
	Color framebackground = new Color(framebackground_r, framebackground_g, framebackground_b);
	Color checkerforground = new Color(checkerforground_r, checkerforground_g, checkerforground_b);
	Color checkerbackground = new Color(checkerbackground_r, checkerbackground_g, checkerbackground_b);
	Color player1_color = new Color(player1_color_r, player1_color_g, player1_color_b);
	Color player2_color = new Color(player2_color_r, player2_color_g, player2_color_b);
	Color textcolor = new Color(textcolor_r, textcolor_g, textcolor_b);
	
	public static void main(String[] args){
		
	}	// End of main method 
	
	public void paint(Graphics g){
	

		int bufferx = 50;	/** Sets buffer of space between the top lefthand corner of the screen and where the board is generated **/
		int buffery = bufferx;	/** The Y buffer of the loop **/
		int sizeofboard = 80; 	/** The size of the board to be generated in an NxN square **/
		int squaresize = 20;	/** Sets the size of the squares in the board to be generated **/
		int playersize = 15;	/** Sets the size of the players in the board to be generated **/
		char letter = 'A';	/** The start letter for the string of letters down the left hand side of the checker board **/
		int xletterpoint = 0;	/** The x position of the letters to be drawn, Is changed **/
	    int yletterpoint = 0;	/** The y position of the letters to be drawn, Is changed **/
		int cx = xletterpoint + bufferx - 10;	/** The x position of the numbers that are generated on the top of the checker board **/
     	int cy = yletterpoint + buffery - 5;	/** The x position of the numbers that are generated on the top of the checker board **/
		int num = 1;
		
		setSize(((sizeofboard * squaresize) + bufferx), ((sizeofboard * squaresize) + buffery));	/** Sets the size of the applet **/
		setBackground(framebackground);		/** Sets the background color of the applet **/
			
			Font tr = new Font("TimesRoman", Font.PLAIN, 12);	/** Sets the font to be used to drawn the letters in the applet **/

	          for (int row = 0;  row < sizeofboard;  row++ ) {		/** The first loop that does the nested loop for the size of the board **/
	             int x,y;   // Top-left corner of square
	         	
	    		
	             for (int col = 0;  col < sizeofboard;  col++) {	/** Does the inner Code for the size of the board, adds one to the row and resets the col **/
	            	 
	                x = col * 20 + bufferx;		/** Sets the start point of the loop **/
	                y = row * 20 + buffery;
	                
	                if ( (row % 2) == (col % 2) )	/** Checks the value of the row and col and if they are the same they draw red if not then drae black **/
	                	
	                   g.setColor(checkerforground);
	                	
	                else
	                	
	                   g.setColor(checkerbackground);
	                   g.fillRect(x, y, squaresize, squaresize);	// Fills a 20x20 square(Because width and height are the same) at the x and y in the next space
	                  
	                   	if(g.getColor() == checkerforground && row < 3){ 	/** Checks the color of the square if it is red and it is rows 1-3 it places a player_1 **/
	                   
	                   		g.setColor(player1_color);	/** Sets the player 1 color **/
	                   		g.fillOval(x + 2, y + 2, playersize, playersize); 	/** Sets the player position **/
	                   
	                   		}		// End of if g.color
	                   
	                   if(g.getColor() == checkerforground && row > (sizeofboard - 4)){	/** Checks the color of the square if it is red and it is rows (sizeofboard - 4) - sizeofboard it places a player_1 **/
	                	   
	                	   g.setColor(player2_color); 	/** Sets the Player_2 Color **/
	                       g.fillOval(x + 2, y + 2, playersize, playersize);	/** Sets the player position **/
	                   
	                   }	// End of get red set blue  
	            }	// End of for col
	         
	             g.setColor(textcolor);	/** Sets the text Color **/
	             
	             	g.drawString(letter + "  ", cx, cy + squaresize);	/** Draws the letter at the next x,y point **/
	          
	            	cy = cy + squaresize;	/** Increments the y point **/
	             	letter++;
	             
	             x = xletterpoint + bufferx + 5; 	/** Sets the x,y point **/
	             y = yletterpoint + buffery;
	             
	             xletterpoint = xletterpoint + squaresize;		/** Increments the x pos **/
	             
	               
	             g.drawString(num + "  ", x, y - 5);	/** Draws the numbers on the top of the board**/
	             
	             num++;		/** Increments Num **/ 
	             
	        } 	// End of for row 
		}	// End of paint method 
	}	// End of class 