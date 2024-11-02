class Fruit
{
	public static void test()
	{
		System.out.println("This is test method");

	}
	public static void main(String[] args)
	{
		System.out.println("This is Fruit class");
		test();
		Fruit.test();
		Fruit f1= new Fruit();
		f1.demo();
		System.out.println("Program Ends");
		
	}
	
	public void demo()
	{
		System.out.println("This is demo method");
	}		
}