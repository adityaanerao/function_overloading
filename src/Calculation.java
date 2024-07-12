
public class Calculation {
	
	static void add(int a , int b)
	{
		int c  = a+ b;
		System.out.println(c);
	}
	
	static void add(double x, double y)
	{
		double z = x + y;
		System.out.println(z);
	}
	
	int add(int x ,int y, int z) 
	{
		return x + y + z;
	}

//	public static void main(String[] args)
//	{
//		Calculations c = new Calculations();
//	
//		c.add(10,20);
//	}
	
	
	public static void main(String[] args)
	{
	
		add(10,20);
		add(10.5,20.5);
	}
}
