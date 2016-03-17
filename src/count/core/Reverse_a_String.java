package count.core;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Reverse_a_String {

	 public static void main(String[] args){
			int run = 1;
			while(run == 1){
		
		 
	    JFrame frame = new JFrame("Reverse A String");
	   
	    String input = JOptionPane.showInputDialog(frame, "Please Enter A String To Be Reversed.");
	    
	    if(input == "Reset"){
	    	
	    	System.exit(0);
	    	
	    }
	    
	    String output = new StringBuilder(input).reverse().toString().toUpperCase();
	    
	    JOptionPane.showMessageDialog(frame, output);
 
			 Object[] options = {"Quit", "I want to Restart"};

			int Answer = JOptionPane.showOptionDialog(null, "What would you like to do? ","Quit : Continue", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
				    null, options,options[1]);
				    if(Answer == JOptionPane.YES_OPTION){

				        System.exit(0); 
				    }
				    else if (Answer == JOptionPane.CANCEL_OPTION) {
				        
				    	run = 0;
		} 	
	 }
   }
}
