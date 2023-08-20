package week1.day2;
//continue -- will skip , move on to next iteration
public class LearnContinue {
	public static void main(String[] args) {
		
		for (int i = 1;i < 10 ; i++) {
			
			if(i==3) {
				System.out.println("THree");
				continue;
			}
			
			System.err.println(i);
		}
		System.out.println("out of for loop");
			
		
	}
}
	
	

}