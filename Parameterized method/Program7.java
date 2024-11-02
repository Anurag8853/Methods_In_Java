//Design a method which will accept a number and will return square

class Program7
{
	public static void main(String[] args)
	{		
		int p=23;
		int sq=getSquare(p);
		System.out.println(p);
		System.out.println(sq);
		System.out.println("Program Ends");		
	}
	
	public static int getSquare(int x)
	{
		return x*x;
	}
}