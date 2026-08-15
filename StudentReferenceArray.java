import java.util.*;
class Student{
	String name;
	int rollno;
	
	Student(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	public void display(){
		System.out.println(this.name+"=>"+this.rollno);
	}
	
}

class StudentReferenceArray{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Student s1=new Student("FOO",18);
		
		s1.display();
		
		System.out.println("enter n:");
		int n=sc.nextInt();
		sc.nextLine();
		
		Student a[]=new Student[n];
		
		for(int i=0;i<n;i++){
			System.out.println("ENter name:");
			String name=sc.nextLine();
			System.out.println("Enter rollno:");
			int rollno=sc.nextInt();
			sc.nextLine();
			
			a[i]=new Student(name,rollno);
			
			a[i].display();
		}
	}
}