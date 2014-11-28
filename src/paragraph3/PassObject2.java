package paragraph3;

public class PassObject2 
{
	static void f(Number x)
	{
		x.f = 5.0f;
	}
	
	public static void main(String[] args)
	{
		Number n = new Number();
		n.f = 8.0f;
		
	    System.out.println("1: n.f: " + n.f);
	    f(n);
	    System.out.println("2: n.f:" + n.f);
	    
	    
	}

}

class Number
{
	float f;
}
