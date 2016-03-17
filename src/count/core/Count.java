package count.core;

public class Count {

	public static void main(String[] args) throws InterruptedException{
		
	}
	
	public Count( int base, int amount, int sleeptime_in_ms, int maxnum) throws InterruptedException{
		
		int i = 0;
		int numover = 0;
		int numunder = 0;
		
		while(i <= amount){
			
			int num = (int)(Math.random()*maxnum);
			
			System.out.println(num);
			
			if(num > base){
				
				numover = numover + 1;
				
			}else {
				
				numunder = numunder + 1;
				
			}
			
			
			i = i + 1;
			
			Thread.sleep(sleeptime_in_ms);
			
		} 
			
		if(i > amount){
			
			System.out.println("There Were " + numover + " Numbers Over " + base  + ".");
			System.out.println("There Were " + numunder + " Numbers Under " + base  + ".");
		}
			
	}
	
		
	}
	