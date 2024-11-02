class Program3
{
	public static void main(String[] args)
	{
		System.out.println("This is Program3");
		int x=40;
		test(x);
		System.out.println(x);
		System.out.println("Program Ends!!");
	}
	public static void test(int x)
	{
		System.out.println("test method starts");
		System.out.println(x);
		x=x+30;
		System.out.println(x);
		System.out.println("test method Ends!");
	}
}