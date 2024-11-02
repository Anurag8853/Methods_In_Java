class Program1
{
	public static void main(String[] args)
	{
		int x=47568;
		int digit=getLastDigit(x);
		System.out.println(digit);

	}
	
	public static int getLastDigit(int n)
	{
		return n%10;
	}
}