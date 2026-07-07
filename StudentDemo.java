class Student{
	//Blueprints
	String name;
	int p;
	int c;
	int m;
}

class StudentDemo{
	public static void main(String[] args){
		//Student s1;==>creates a referrence of student pointing to null
		//s1=new Student();creates an object of class student and is named as s1
		Student s1=new Student();//initialization while declaration.
		System.out.println(s1.name);
		System.out.println(s1.p);
		System.out.println(s1.c);
		System.out.println(s1.m);
		s1.name="ABC";
		s1.p=90;
		s1.c=85;
		s1.m=95;
		System.out.println(s1.name);
		System.out.println(s1.p);
		System.out.println(s1.c);
		System.out.println(s1.m);
	}
}