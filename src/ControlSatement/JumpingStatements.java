package ControlSatement;

public class JumpingStatements 
{
	public static void main(String[] args)
	{
		//break statement
		for(int i=1; i<=10; i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}
		
		
		// continue statement
		for(int j=1; j<=10; j++)
		{
			if(j==3 || j==5 || j==7)
			{
				continue;
			}
			System.out.println(j);
		}
	}

}
