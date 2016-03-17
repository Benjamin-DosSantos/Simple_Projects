package checkers.core;


import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class CheckersMod_Santiago extends Applet{

	
	public void paint(Graphics g){
		int bufferx = 50;
		int buffery = bufferx;
		int sizeofboard = 10; 	
		int squaresize = 20;
		int playersize = 15;
		char letter = 'A';
        int xletterpoint = 0;
        int yletterpoint = 0;
        Font tr = new Font("TimesRoman", Font.PLAIN, 20);
		
		setSize(((sizeofboard * squaresize) + bufferx), ((sizeofboard * squaresize) + buffery));
		setBackground(Color.DARK_GRAY);
		
		g.setColor(Color.WHITE);
		g.setFont(tr);

          
          //draw board
			g.setColor(Color.BLACK);
			g.drawRect(bufferx, buffery, sizeofboard*squaresize, sizeofboard*squaresize);
          //draw player1
          //draw player2
          
          for (int row = 0;  row < sizeofboard;  row++ ) {
             int x,y;   // Top-left corner of square
            
             for (int col = 0;  col < sizeofboard;  col++) {
                x = col * 20 + bufferx;
                y = row * 20 + buffery;
                
                if ( (row % 2) == (col % 2) )
                	
                   g.setColor(Color.RED);
                	
                else
                	
                   g.setColor(Color.BLACK);
                   g.fillRect(x, y, squaresize, squaresize);	// Fills a 20x20 square(Because width and height are the same) at the x and y in the next space
                  
                   	if(g.getColor() == Color.RED && row < 3){
                   
                   		g.setColor(Color.GREEN);
                   		g.fillOval(x + 2, y + 2, playersize, playersize);
                   
                   		}		// End of if g.color
                   
                   if(g.getColor() == Color.RED && row > (sizeofboard - 4)){
                	   
                	   g.setColor(Color.WHITE);
                       g.fillOval(x + 2, y + 2, playersize, playersize);
                   
                   }	// End of get red set blue           
            }	// End of for col
       
             x = xletterpoint + bufferx + 5;
             y = yletterpoint + buffery;
             
             xletterpoint = xletterpoint + squaresize;
             
             g.setColor(Color.WHITE);
                      
             g.drawString(letter + "", x, y - 5);
             
             letter++;
       
        } 	// End of for row 
	}	// End of paint method 
}	// End of class 