package ControlSatement;

import java.util.Scanner;

public class IfStatements 
{
	public static void main(String[] args)
	{
		// If statement
		int age = 35;
		if(age>18)
		{
			System.out.println("Eligible to vote");
		}
		
		
		// If-Else statement
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
		
		
		// Neested If-else statement
		int n=0;
		if(n>0)
		{
			System.out.println("Number is positive");
		}
		else if(n<0)
		{
			System.out.println("Number is negative");
		}
		else
		{
			System.out.println("MNumber is zero");
		}
		
		
		// Neested if-else
		if(true)
		{
			if(true)
			{
				System.out.println("abc");
			}
			else
			{
				System.out.println("xyz");
			}
		}
		else
		{
			System.out.println("123");
		}
	}

}
