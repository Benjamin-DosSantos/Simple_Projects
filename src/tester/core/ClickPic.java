package tester.core;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ClickPic extends Applet implements MouseListener{

	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	static int width = (int)(screenSize.getWidth());
	static int height = (int)(screenSize.getHeight());
	
	public void init(){
		this.setSize(new Dimension(width, height));
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		System.out.println("Mouse Clicked");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		System.out.println("Mouse Entered");
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		System.out.println("Mouse Exit");
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		System.out.println("Mouse Pressed");
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		System.out.println("Mouse Released");
		
	}

}
