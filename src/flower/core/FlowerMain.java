package flower.core;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/** 
 * 
 *	Name: Benjamin DosSantos 
 *	Assignment: Arcs - Flower Applet
 *	Project Description: Creates a applet 
 *	that draws a flower using the java graphics
 *	system and arcs. 
 * 
 **/

public class FlowerMain extends Applet{

	public void init(){ }
	
	public static void main(String[] args){ }
	
	public void paint(Graphics g){
		
		setSize(1000, 1000);
		setBackground(Color.BLACK);

		
/*		g.setColor(Color.YELLOW);
		g.fillArc(400, 100, 100, 100, 45, 225);
		g.fillArc(400, 150, 100, 100, 45, 270);
		g.fillArc(600, 100, 100, 100, 225, 270);
		g.fillArc(600, 150, 100, 100, 180, 315);
		g.fillArc(450, 500, 100, 200, 45, 270);
		g.fillArc(650, 500, 100, 200, 225, 270);

		g.setColor(Color.RED);
		g.fillOval(500, 200, 200, 200);
		
		g.setColor(Color.GREEN);
		g.drawLine(600, 300, 600, 800);
*/

	/*	g.setColor(Color.YELLOW);
		g.fillArc(450, 205, 100, 100, 0, 225);
		g.fillArc(450, 250, 100, 100, 45, 270);
		g.fillArc(650, 205, 100, 100, 270, 270);
		g.fillArc(650, 250, 100, 100, 180, 315);
		
		
		g.drawArc(515, 500, 100, 200, 45, 270);
		g.drawArc(585, 500, 100, 200, 225, 270);

		g.setColor(Color.GREEN);
		g.drawLine(600, 300, 600, 800);
		
		g.setColor(Color.RED);
		g.fillOval(500, 200, 200, 200);
		*/

/*		//Santiago
		g.setColor(Color.YELLOW);
		g.drawArc(600, 100, 200, 200, 270, 270);//top right
		g.drawArc(400, 100, 200, 200, 0, 270);//top left
		g.drawArc(400, 250, 200, 200, 130, 200);//bottom left		
		g.drawArc(600, 250, 200, 200, 210, 200);//bottom right
		
		g.drawArc(515, 500, 100, 200, 45, 270);
		g.drawArc(585, 500, 100, 200, 225, 270);

		g.setColor(Color.GREEN);
		g.drawLine(600, 400, 600, 800);
		
		g.setColor(Color.RED);
		g.drawOval(500, 200, 200, 200);
		*/



		int arc_width = 200;
		int arc_height = 200;
		
		int top_right_x = 600; 
		int top_right_y = 100; 
		int top_right_start = 270; 
		int top_right_dif = 270; 
		
		int top_left_x = 400; 
		int top_left_y = 100; 
		int top_left_start = 0; 
		int top_left_dif = 270; 
		
		int bottom_right_x = 400; 
		int bottom_right_y = 250; 
		int bottom_right_start = 130; 
		int bottom_right_dif = 200; 
		
		int bottom_left_x = 600; 
		int bottom_left_y = 250;
		int bottom_left_start = 210; 
		int bottom_left_dif = 200; 
		
		int leaf_width = 100;
		int leaf_height = 200;
		
		int left_leaf_x = 515;
		int left_leaf_y = 500;
		int left_start = 45;
		int left_dif = 270;
		
		int right_leaf_x = 585;
		int right_leaf_y = 500;
		int right_leaf_start = 225;
		int right_leaf_dif = 270;
		
		int stem_x_1 = 600;
		int stem_y_1 = 400;
		int stem_x_2 = 600;
		int stem_y_2 = 800;
		
		int circle_x = 500;
		int circle_y = 200;
		int circle_width = 200;
		int circle_height = 200;
		
		Color leafcolor = Color.YELLOW;
		Color stemcolor = Color.GREEN;
		Color corecolor = Color.RED;
		
		
		// Final
		g.setColor(leafcolor);
		g.drawArc(top_right_x, top_right_y, arc_width, arc_height, top_right_start, top_right_dif);//top right
		g.drawArc(top_left_x, top_left_y, arc_width, arc_height, top_left_start, top_left_dif);//top left
		g.drawArc(bottom_right_x, bottom_right_y, arc_width, arc_height, bottom_right_start, bottom_right_dif);//bottom left		
		g.drawArc(bottom_left_x, bottom_left_y, arc_width, arc_height, bottom_left_start, bottom_left_dif);//bottom right
		
		g.drawArc(left_leaf_x, left_leaf_y, leaf_width, leaf_height, left_start, left_dif);	//Left Leaf
		g.drawArc(right_leaf_x, right_leaf_y, leaf_width, leaf_height, right_leaf_start, right_leaf_dif); // Right Leaf

		g.setColor(stemcolor);	// Stem of the flower
		g.drawLine(stem_x_1, stem_y_1, stem_x_2, stem_y_2);	
		
		g.setColor(corecolor);
		g.drawOval(circle_x, circle_y, circle_width, circle_height); 	// Circle in the Middle 
		
		
		
		
	}
	
}
