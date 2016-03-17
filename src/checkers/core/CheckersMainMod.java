package checkers.core;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

public class CheckersMainMod extends Applet{

	
	int width = 1000;
	int height = 1000;
	
	int loopstartx = 100;
	int loopstarty = 100;
	int offset = 100;
	
	int currentrow = 0;
	int currentcolumn = 0;
	
	int sizeofboard = 10; 	/** Needs To Be Even **/
	int numofrows = sizeofboard;
	
	int squarespace = (int)width / sizeofboard;
	
	Color boardbg = (Color.BLACK);
	Color subspace = (Color.RED);
	
	public static void main(String[] args){ }	// End of main method 
	
	public void paint(Graphics g){
		setSize(600,600);
		
	      int row;   // Row number, from 0 to 7
          int col;   // Column number, from 0 to 7
          int x,y;   // Top-left corner of square
       
          for ( row = 0;  row < sizeofboard;  row++ ) {
          
             for ( col = 0;  col < sizeofboard;  col++) {
            	 
                x = col * 20 + loopstartx;
                y = row * 20 + loopstarty;
                
                if ( (row % 2) == (col % 2) )
                	
                   g.setColor(Color.red);
                	
                else
                	
                   g.setColor(Color.black);
                   g.fillRect(x, y, 20, 20);
             
            }
        } 	
	}	// End of paint method 
}	// End of class 