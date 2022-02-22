package week1.assignment;

public class NegativeToPositiveNumber {

	public static void main(String[] args) {
		int number = -50;
		if (number<0)
		{
			int num = -(number);
			System.out.println("The given number " +number+ " is converted to " +num);
		}
		else 
			System.out.println("The given number " +number+ " is positive number");
	}

}
