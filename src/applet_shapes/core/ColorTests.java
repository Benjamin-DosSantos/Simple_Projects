package applet_shapes.core;

import java.applet.Applet;
import java.awt.Color;
import java.util.Random;

public class ColorTests extends Applet{
	public void init(){
		Random ran = new Random();
		this.setBackground(new Color(ran.nextInt(255), ran.nextInt(255), ran.nextInt(255)));
	}
	
	public void paint(){
		
	}
}//End of class
