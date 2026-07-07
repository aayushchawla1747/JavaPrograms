class SumOfDigits{
	public static void main(String[] args){
		System.out.println("Enter a number:");
		int sum=0, number=1548987;
		System.out.println(number);
		while(number!=0){
			sum+=number%10;
			number/=10;
		}
		System.out.println(sum);
	}
}