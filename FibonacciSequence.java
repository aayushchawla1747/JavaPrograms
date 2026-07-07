class FibonacciSequence
{
	public static void main(String[] args){
		int a=0;
		int b=1;
		int n=5;
		int c;
		System.out.println("Fibonacci Sequence:");
		for(int i=0;i<n;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
}