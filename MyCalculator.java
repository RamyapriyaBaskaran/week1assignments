package week1.assignment;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		int sum = cal.add(50, 100, 25);
		System.out.println("Addition of given numbers : " +sum);
		
		cal.sub(2500, 1000);
		
		cal.mul(200.5467889, 35.67890);
		
		float div = cal.divide(10.234f, 2.456f);
		System.out.println("Division of given numbers : " +div);
		}
}
