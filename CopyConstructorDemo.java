class Person{
	int rollNo;
	String name;
	
	Person(int rollNo,String name){
		this.name=name;
		this.rollNo=rollNo;	
	}
	Person(Person s){
		this.name=s.name;
		this.rollNo=s.rollNo;	
	}
}
class CopyConstructorDemo{
	public static void main(String[] args){
		Person s1=new Person(45,"rohit");
		System.out.println("The name of s1:"+s1.name);
		System.out.println("The rollno of s1:"+s1.rollNo);
		Person s2=new Person(s1);
		System.out.println("The name of s2:"+s2.name);
		System.out.println("The rollno of s2:"+s2.rollNo);
		
	}
}