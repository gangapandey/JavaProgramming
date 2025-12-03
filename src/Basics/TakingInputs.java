package Basics;

import java.util.Scanner;

public class TakingInputs 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		System.out.println("Your entered number is :" + num);
		
		System.out.println("Enter a decimal number:");
		double dec = sc.nextDouble();
		System.out.println("Your entered number is :" +dec);
		
		System.out.println("Enter a city:");
		String city = sc.next();
		System.out.println("Your entered city is :" +city);
	}

}
