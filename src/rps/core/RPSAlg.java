package rps.core;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Random;

public class RPSAlg {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException{
		int num_gen = 200, num_r = 0, num_p = 0, num_s = 0, current_num = 0;
		double r_per, p_per, s_per;
		Random ran = new Random();
		PrintWriter writer = new PrintWriter("RPS_Results.txt", "UTF-8");
		for(int i = 0; i < num_gen; i++){
			 current_num = ran.nextInt(3);
			 if(current_num == 0){
				 System.out.println("Rock has been chosen!");
				 num_r++;
				 writer.write("Rock has been chosen!" + "\n");
			 }else if(current_num == 1){
				 System.out.println("Paper has been chosen!");
				 num_p++;
				 writer.write("Paper has been chosen!" + "\n");
			 }else if(current_num == 2){
				 System.out.println("Scissors have been chosen!");
				 num_s++;
				 writer.write("Scissors have been chosen!" + "\n");
			 }else{
				 System.out.println("A number that is not in the range has been generated!");
			 }
		}// End of for num_gen
		 System.out.println("Rock was chosen " + num_r + " times");
		 System.out.println("Paper was chosen " + num_p + " times");
		 System.out.println("Scissors was chosen " + num_s + " times");
		 writer.write("\n" + "Rock was chosen " + num_r + " times" + "\n");
		 writer.write("Paper was chosen " + num_p + " times" + "\n");
		 writer.write("Scissors was chosen " + num_s + " times" + "\n");
		 writer.close();
	}// End of main 
}// End of class
