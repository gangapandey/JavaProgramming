package ControlSatement;

public class ForLoop 
{
	public static void main(String[] args)
	{
		// Print 1 to 10
		for(int a=1; a<=10; a++)
		{
			System.out.println(a);
		}
		
		
		// Print only even numbers from 1 to 10;
		for(int j=2; j<=10; j+=2)
		{
			System.out.println(j);
		}
		
		
		// Print 1 to 10 and also display if it is odd or even
		for(int i=1; i<=10; i++)
		{
			if(i%2==0)
			{
				System.out.println(i + "= Even Number");
			}
			else
			{
				System.out.println(i + "=Odd Number");
			}
		}
	}
	

}
