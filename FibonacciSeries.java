package week1.assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 12;
		int firstNum = 0;
		int secondNum = 1;
		int sum;
		
		System.out.println("First Number is : " + firstNum);
		
		for (int i=1; i<=range; i++)
		{
			sum = firstNum + secondNum; //1,2,3,5,8
			firstNum = secondNum; //1,1,2,3,5
			secondNum = sum; //1,2,3,5,8
			System.out.print(firstNum + "   ");	//1,1,2,3,5
		}	
	}
}
