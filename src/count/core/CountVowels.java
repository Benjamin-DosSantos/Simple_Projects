package count.core;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CountVowels {

	 public static void main(String[] args){
		 
		 	int vowelcount = 0;
		 
			int run = 1;
			while(run == 1){
		
		 
	    JFrame frame = new JFrame("Count Vowels");
	   
	    String input = JOptionPane.showInputDialog(frame, "Please Enter A String For The Vowels To Be Counted.");
	    
	    for(int i=0;i < input.length();i++){
            if((input.charAt(i) == 'a') || 
                (input.charAt(i) == 'e')  ||
                (input.charAt(i) == 'i') || 
                (input.charAt(i) == 'o') ||
                (input.charAt(i) == 'u')) {

	    
	    String output = "There Where " + i + " Vowels In The String.";
	    
	    JOptionPane.showMessageDialog(frame, output);

	    	vowelcount = 0;
	    
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
	 }
 }