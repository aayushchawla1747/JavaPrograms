class StringFunctionDemo{
	public static void main(String[] args){
		
		char c[]={'a','b','c','d'};
		byte b[]={65,66,67,68,69};
		char c2[]={'a','b','c','d','x','e','f','g','h'};

		//constructor accepting string literal
		String s1=new String("Hello");
		
		//constructor accepting character array
		String s2=new String(c);
		
		//default constructor:
		String s3=new String(b);
		
		//String(char array,offset,count)
		String s4=new String(c2,3,4);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

		String s5="hello world";
		
		int count=0;
		for(int i=0;i<s5.length();i++){
			//if(s5[i]=='o')
			if(s5.charAt(i)=='o')
				count++;
		}
		System.out.println("count of o:"+count);
		
		System.out.println(s5.indexOf('w'));		
		System.out.println(s5.indexOf('c'));
		
		System.out.println(s5.startsWith("Hello"));
		System.out.println(s5.endsWith("World"));
		
		char c3[]=s5.toCharArray();
		for(int j=0;j<c3.length;j++){
			System.out.print(c3[j]+" ");
		}
		
		System.out.println();
		
		String s0="HELLO world";
		System.out.println(s0.toUpperCase());
		System.out.println(s0.toLowerCase());
		
		String s7="                               Hiiiiiieeeeeeeeeeee!                        ";
		System.out.println(s7.trim());
		
		String s8="ab cd vaangad bhindi ef gh jai jhule";
		System.out.println(s8.contains("jhule"));


	}
}