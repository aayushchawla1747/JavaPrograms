class additionCLA{
	public static void main(String[] args){
		int num1=Integer.parseInt(args[0]);//parse int is static method of class integer,called for the class and not for the object
		int num2=Integer.parseInt(args[1]);//converts string to integer
		System.out.println("The first no. is :"+num1);
		System.out.println("The second no. is :"+num2);
		System.out.println("The addition of two no.s is :"+(num1+num2));
	}
}