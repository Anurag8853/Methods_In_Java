class Program2
{
	public static void test()
	{
		System.out.println("This is test method");
	}
	public static void main(String[] args)
	{
		System.out.println("This is Program2");
		demo();
		System.out.println("Program Ends!!");
	}
	public static void demo()
	{
		System.out.println("This is demo method");
		test();
	}
}