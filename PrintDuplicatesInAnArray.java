package week1.assignment;

public class PrintDuplicatesInAnArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20,100,105,107,100,200,105};
		System.out.println("Length of an array is: " +arr.length);
		System.out.print("Duplicates in an array : ");

		int count;
		for (int i=0;i<=arr.length-1;i++)
		{
			count = 0;
			for (int j=i+1; j<arr.length;j++)
			{
				if (arr[i]==arr[j])
					{
					count++;
					break;
					}
			}
			if(count>0)
				System.out.print(arr[i] + " ");
		}		
	}
}
