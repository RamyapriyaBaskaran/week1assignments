package week1.assignment;

public class FindPrimeNumber {

	public static void main(String[] args) {
		int input = 73;
		boolean flag = false;
		
		for (int i=2; i <= input/2; i++) 
		{
			if(input % i == 0)
			{
				flag = true;
				break;
			}
		}
		
		 if (flag==false) 
			 System.out.println(input +" is a PRIME number"); 
		 else
			 System.out.println(input + " is not a PRIME number");
		
	}
}