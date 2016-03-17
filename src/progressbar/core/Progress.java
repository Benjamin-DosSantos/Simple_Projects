package progressbar.core;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class Progress extends JFrame{

	public static void main(String[] args){ 
		
		JFrame mainframe = new JFrame("Progress");
		
		mainframe.setSize(1000, 1000);
		mainframe.setVisible(true);
		
		JProgressBar progress = new JProgressBar();
		progress.setVisible(true);
		progress.setPreferredSize(new Dimension(400, 20));
		mainframe.add(progress);
		
		for(int r = 0; r < 100; r++){
			
			progress.setMaximum(100);
			progress.setValue(r);
			progress.setIndeterminate(false);

			
		}
		
	}
	
	public void init(){ }
	
	public void paint(){ }
	
}
