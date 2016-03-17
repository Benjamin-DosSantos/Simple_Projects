package checkers.core;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

public class CheckersMain extends Applet{

	
	int width = 1000;
	int height = 1000;
	
	int loopstartx = 100;
	int loopstarty = 100;
	int offset = 100;
	
	int currentrow = 0;
	int currentcolumn = 0;
	
	int sizeofboard = 20; 	/** Needs To Be Even **/
	int numofrows = sizeofboard;
	
	int squarespace = (int)width / sizeofboard;
	
	// Color boardbg = (Color.BLACK); For use at a later time
	// Color subspace = (Color.RED);  For use at a later time
	
	public static void main(String[] args){ }	// End of main method 
	
	public void paint(Graphics g){
		
		setSize((int)width, (int)height);
		
		g.setColor(Color.BLACK);
		g.fillRect(loopstartx, loopstarty, (int)width - loopstartx, (int)height - loopstarty);
		
	
		g.setColor(Color.RED);
		
		int c = 0; 
		int r = 0;
		int s = 0;
		int times = 1;
		int offset = 0;
		int count = 0;
		
		boolean placechecker = true;
		int timesfalse = 0;
		
		squarespace = 0;
		
		for(r = 0; r < sizeofboard; r++){		
			
			for(c = 0; c < sizeofboard; c++){
			
				if(times == 1){
					
					times++;
					
				}// End of if times
				
					g.setColor(Color.RED);
			
					g.fillRect(loopstartx + (offset / 2), (loopstarty * times) / 2, ((int)width / sizeofboard), ((int)height / sizeofboard));
					
					if(placechecker == true){
						
						g.setColor(Color.BLUE);
						
						g.fillOval(((loopstartx + (offset / 2)) + 5), (((loopstarty * times) / 2) + 5), (int)(((int)width / sizeofboard) * 0.75), (int)(((int)height / sizeofboard) * 0.75));
						
					} // End Of If placechecker

					squarespace = squarespace + (((int)width / sizeofboard) * 2);
					
					System.out.println(c);
					
			} // End of for c	
			
		 //times++; 	// Set Makes A FLat Line 
			
			c = 0;
			System.out.println("I AM " + c);
			
			
		}	// End of for r
	}	// End of paint method 
}	// End of class 