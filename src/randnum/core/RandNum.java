package randnum.core;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RandNum {

	public static void main(String[] args){
		
		String frameName = "Color Frame";
		
		int R = (int)(Math.random() * 255);
		int G = (int)(Math.random() * 255);
		int B = (int)(Math.random() * 255);
		
		Color colorBG = new Color(R, B, G);
	
		JFrame colorWindow = new JFrame(frameName);
		JPanel colorView = new JPanel();
		
		colorWindow.setVisible(true);
		colorWindow.add(colorView);
		JFrame.setDefaultLookAndFeelDecorated(true);
		colorWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		colorWindow.setSize(600, 600);
		
		colorView.setBackground(colorBG);
		
	}
}