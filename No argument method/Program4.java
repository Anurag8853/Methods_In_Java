class Program4
{
	public static void main(String[] args)
	{
		System.out.println("This is Program4");
		demo();
		System.out.println("Program Ends!!");
		
	}
	public static void demo()
	{
		System.out.println("This is demo method");
		demo();   // Running Infinitely When a method call Itself 
		System.out.println("demo method Ends!");
	}
}