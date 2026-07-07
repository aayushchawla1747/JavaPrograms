class PrimeNumber{
	public static void main(String[] args)
	{
		int x=20;
		boolean isPrime=true;
		for(int i=2;i<x/2;i++)
		{
			if(x%i==0)
			{
				isPrime=false;
				break;
			}
		}
		
		
		if (isPrime)
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
		
	}
}