package week1.day2;

public class AssignmentCalculator {
		
		private int addTwoNumber(int num1,int num2)
	{
		return num1+num2;
		
	}
		
		public int mul(int num1,int num2)
		{
			return num1*num2;
			
		}
		public int sub(int num1,int num2)
		{
			return num1-num2;
			
		}
		
		public static void main(String[] args) {
			
			AssignmentCalculator cal = new AssignmentCalculator();
			System.out.println(cal.addTwoNumber(32, 47));
			System.out.println(cal.mul(25,45));
			System.out.println(cal.sub(87, 47));
			
		}
		

}
