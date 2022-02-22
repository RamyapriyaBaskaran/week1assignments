package week1.assignment;

public class SumOfDigits {

	public static void main(String[] args) {
		int input = 12345;
		int sum = 0;
		
		while (input > 0)
		{
			int reminder = input % 10;
			System.out.println("Reminder is : " +reminder);
		    sum =  sum + reminder;
			System.out.println("sum is : " +sum);
			input = input/10;
			System.out.println("quotient is : " +input);
		}	
		System.out.println("sum of the given digits is : " +sum);
	}
}
