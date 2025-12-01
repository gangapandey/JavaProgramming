package Basics;

public class Variables 
{
	public static void main(String[] args)
	{
		 int a;        // declaration
	     a = 10;        // assignment
	        
	     a= 20;        // updated
	     System.out.println(a);
	        
	     // Approach-1 ---> Use if all the variables belongs to different data types
	     int x = 10;
	     int y = 20;
	     int z = 30;
	     
	     // Approach-2 ---> Use if all the variables belongs to same data types
	     int p,q,r;
	     p = 10;
	     q = 20;
	     r = 30;
	        
	     // Approach-3 ---> Use if all the variables belongs to same data type
	     int k=10, l=20, m=30;
	     
	     System.out .println("The value of p =" + p);
	     System.out .println("The value of q =" + q);
	     System.out .println("The value of r =" + r);
	        
	     System.out.println(p+ " " + q + " " + r);
	}

}
