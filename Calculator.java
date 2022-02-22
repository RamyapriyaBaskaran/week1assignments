package week1.assignment;

public class Calculator {
	public int add (int num1, int num2, int num3)
	{
		int sumresult = num1 + num2 + num3;
		//System.out.println("Addition of given numbers : " +sumresult);
		return sumresult;
	}
	public int sub (int num1, int num2)
	{
		int subresult = num1 - num2;
		System.out.println("Subtraction of given numbers : " +subresult);
		return subresult;
	}
	public double mul (double num1, double num2)
	{
		double mulresult = num1 * num2;
		System.out.println("Multiplication of given numbers : " +mulresult);
		return mulresult;
	}
	public float divide (float num1, float num2)
	{
		float divresult = num1 / num2;
		//System.out.println("Division of given numbers : " +divresult);
		return divresult;
	}
}
