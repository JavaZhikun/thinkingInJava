package paragraph5;

public class OverloadingVarargs 
{
	static void f(Character...characters)
	{
		System.out.println("first");
		for(Character c : characters)
			System.out.println(" " + c);
		System.out.println();
	}
	
	static void f(Integer...integers )
	{
		System.out.println("second");
		for(Integer i : integers)
			System.out.println(" " + i);
		System.out.println();
	}
	
	static void f(Long...longs)
	{
		System.out.println("third");
	}
	
	public static void main(String[] args)
	{
		f('a', 'b', 'c');
		f(1);
		f(2,1);
		f(0);
		f(0L);
	}
	

}
