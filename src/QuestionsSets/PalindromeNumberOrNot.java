package QuestionsSets;

import java.util.Scanner;

public class PalindromeNumberOrNot 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int num=sc.nextInt();
		int orgNum=num;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(orgNum==rev)
		{
			System.out.println("Entered number is palindrome number.");
		}
		else
		{
			System.out.println("Entered number is not palindrome number.");
		}
		
		
	}
}
