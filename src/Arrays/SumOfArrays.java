package Arrays;

public class SumOfArrays 
{
	public static void main(String[] args)
	{
		int a[] = {5,3,6,1,8,9};
		int sum = 0;
		for(int i=0; i<=a.length-1; i++)
		{
			sum = sum + a[i];
		}
		System.out.println("Sum of array = " + sum);
		
		
		// Approach-2: using enhanced for-loop
		int b[] = {23,45,43,55};
		int s = 0;
		for(int value:b)
		{
			sum = sum + value;
		}
		System.out.println("sum = " + s);
		
	}

}
