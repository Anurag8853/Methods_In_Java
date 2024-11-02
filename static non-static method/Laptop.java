class Laptop
{
	public static void test(int x)
	{
		System.out.println("This is test method " + x);
	}
	
	public static void demo(int[] x)
	{
		System.out.println("This is demo method " + x.length);
	}
	
	public static void main(String[] args)
	{
		System.out.println("This is Laptop class");
	
		System.out.println("Array length is " + args.length);
		int p = 23;
		test(p);
		int[] k={12,34,56};
		demo(k);
		System.out.println("===========");
		String[] t={};
		Vehicle.main(t);
		System.out.println("===========");
		System.out.println("Program Ends");
		
		
	}
}