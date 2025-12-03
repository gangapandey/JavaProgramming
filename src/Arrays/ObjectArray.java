package Arrays;

public class ObjectArray 
{
	public static void main(String[] args)
	{
		Object a[] = {100, 10.5, 'A', "Welcome", true};
		for(Object x: a)
		{
			System.out.println(x);
		}
	}
}
