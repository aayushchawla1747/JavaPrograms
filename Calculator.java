//wajp a menu driven calculator
class Calculator
{
	public static void main(String[] args)
	{
		int choice=3;
		
		int number1=4;
		int number2=3;
		System.out.println("1.Addition\n"+"2.Subtraction\n"+"3.Multiplication\n"+"4.Division\n"+"5.Exit");
		
			switch(choice)
			{
			case 1:
			System.out.println("Sum is: "+ (number1+number2));
			break;
			case 2:
			System.out.println("diff is: "+ (number1-number2));
			break;
			case 3:
			System.out.println("product is: "+ (number1*number2));
			break;
			case 4:
			System.out.println("division is: "+ (number1/number2));
			break;
			case 5:
			break;
			
		}
		
	}
}