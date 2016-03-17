package String_Minipulation;

public class String_Minipulation {
	public static void main(String[] args){
		String name = "This is america";
		char[] name_parts = name.toCharArray();
		
		for(int i = name.length() -1; i >= 0; i--){
			System.out.println(name_parts[i]);
		}// End of for name length
	}// End of method
}// End of class
