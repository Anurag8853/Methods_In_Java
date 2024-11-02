class Program2
{
	public static void main(String[] args)
	{
		int n=47568;
		int digit=getLastDigit(n);
		System.out.println(digit);
		System.out.println("Program Ends!!");	
	}

	public static int getLastDigit(int n)
	{
		int ld=n%10;
	return ld*ld;
	}
}