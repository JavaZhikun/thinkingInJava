package paragraph5;

public class Mugs
{
	Mug mug1 = new Mug(1);
	Mug mug2 = new Mug(2);
	
	
	//匿名内部类
	{
    System.out.println("mug1 & mug2 initialized");
	}
	
    Mugs()
    {
    	System.out.println("Mugs()");
    }
    
    Mugs(int i)
    {
    	System.out.println("Mugs(int)");
    }
    
    public static void main(String[] args) {
		System.out.println("Inside main()");
		new Mugs();
		System.out.println("new Mugs() completed");
		new Mugs();
		System.out.println("new Mugs(1) completed");
	}
}

class Mug
{
	Mug(int marker)
	{
		System.out.println("Mug(" + marker + ")");
	}
	
	void f(int marker)
	{
		System.out.println("f(" + marker +")");
	}
}
