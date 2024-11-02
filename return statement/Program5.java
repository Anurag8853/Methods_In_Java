class Program5
{
	public static void main(String[] args)
	{
		test();	
	}
	
	public static int test()
	{
		System.out.println("test method starts");
		int x=34;
		if(x>5)
		{
			System.out.println("inside if block");
			return 100;
		}
		return 200;
	}
}