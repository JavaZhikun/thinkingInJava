package paragraph5;

public class OverloadingVarargs2 {
	static void f(float i ,Character...characters)
	{
		System.out.println("first");
	}

	//需要增加一个可变参数才能解决问题
	static void f(char c,Character...characters)
	{
		System.out.println("second");
	}
	
	public static void main(String[] args)
	{
	      f(1,'a');
	      f('a', 'b');
	}
}
