class Big
{
	public static void main(String[] args)
	{
		int a=54755;
		int b=94678;
		int big=getBig(a,b);
		System.out.println(big);
		System.out.println("Program Ends");
		
	}
	
	public static int getBig(int n1,int n2)
	{
		if(n1>n2)
		{
			return n1;
		}
		else
		{
		return n2;
		}
	}
}