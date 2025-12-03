package Arrays;

public class BasicArrays 
{
	public static void main(String[] args)
	{
		// Declaring 1D array
		// Approach-1
		int a[]=new int[4];
			a[0] = 100;
			a[1] = 200;
			a[2] = 300;
			a[3] = 400;
			
		// Approach-2
		int b[] = {100, 200, 300, 400};
		
		// find length of an array
		System.out.println("Length of array:" + b.length);
		
		// read single value from array
		System.out.println(b[3]);
		
		// reading all value from array
		for(int i=0; i<b.length; i++)
		{
			System.out.println(i);
		}
		
		// enhanced for-loop
		for(int x:b)
		{
			System.out.println(x);
		}
		
		
		
		// Declaring 2D array
		
		// Approach-1
		int m[][] = new int[2][2];
			m[0][0] = 100;
			m[0][1] = 200;
			m[1][0] = 300;
			m[1][1] = 400;
			
	   // Approach-2
		int [][]n = new int[2][2];
	   //OR
		int[]p[] = new int[2][2];
	  //Approach-3
		int o[][]= {
				{100,200},
				{300,400}
		};
		
		
		// find size of an  array
		System.out.println("Size of rows:" + o.length);
		System.out.println("Size of coloumns:" + o[0].length);
		
		
		// read single value from array
		System.out.println(o[2][1]);
		
		// Read multiple value form array
		for(int r=0; r<=o.length-1; r++)
		{
			for(int c=0; c<=o[r].length-1; c++)
			{
				System.out.println(o[r][c]);
			}
		}
	}

}
