package paragraph5;

public class Burrito 
{
	Spiciness degree;
	
	public Burrito(Spiciness degree)
	{
		this.degree = degree;
	}
	
	public void describe()
	{
		System.out.println("This burrito is ");
		switch(degree)
		{
		case NOT:  System.out.println("not spicy at all");
		
		case MILD:
			
		case MEDIUM: System.out.println("a little not.");
		
		case HOT:
			
		case FLAMING:
		default:   System.out.println("may be not");
		}
	}
	
	
	public static void main(String[] args)
	{
		Burrito
		 plain = new Burrito(Spiciness.NOT),
		greenChile = new Burrito(Spiciness.MEDIUM),
		jalapeno = new Burrito(Spiciness.HOT);
		plain.describe();
		greenChile.describe();
		jalapeno.describe();
		
	}

}
