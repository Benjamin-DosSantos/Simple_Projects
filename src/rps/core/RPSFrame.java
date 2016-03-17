package rps.core;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RPSFrame {
	public static void main(String args[]){
		
		Color bgcolor = Color.BLUE;
	
		String[] images = {"images\\Rock.jpg", "images\\Paper.jpg", "images\\Sissors.jpg"};
		ImageIcon rock_image = new ImageIcon(images[0]);
		ImageIcon paper_image = new ImageIcon(images[1]);
		ImageIcon scissors_image = new ImageIcon(images[2]);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)(screenSize.getWidth());
		int height = (int)(screenSize.getHeight());
		
		String frame_name = "Rock, Paper, Scissors";
		int frame_width = 500;
		int frame_height = 500;
		int frame_xpos = (width / 4);
		int frame_ypos = (height / 4);
		
		JFrame main_frame = new JFrame(frame_name);
		JPanel main_panel = new JPanel(); 
		
		main_frame.setVisible(true);
		main_frame.setSize(new Dimension(frame_width, frame_height));
		main_frame.setLocation(new Point(frame_xpos, frame_ypos));
		main_frame.add(main_panel);
		
		main_panel.setBackground(bgcolor);
		
		JButton rock = new JButton(rock_image);
		rock.setVisible(true);
		rock.setPreferredSize(new Dimension(100, 100));
		rock.setLocation(new Point(100, 100));
		main_panel.add(rock);
	}
}
