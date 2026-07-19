//WAJP TO CREATE A CLASS EMPLOYEE THAT HAS ID,SALARY AND NAME TAKE INPUT FROM THE USER AND CREATE 3 OBJECTS OF CLASS USING PARAMETRIZED CONSTRUCTOR.
import java.util.Scanner;

class Person{
	int id;
	String name;
	double salary;
	
	Scanner sc = new Scanner(System.in);
	//if u have a next line after a nextInt,nextFloat..etc.,you need a extra nextLine netween them to flush out the extra enter.
	public void getData(){
		System.out.println("=====ENTER YOUR EMPLOYEE DETAILS:=====");
		System.out.println("Enter your Employee Id:");
		this.id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your name:");
		this.name=sc.nextLine();
		System.out.println("Enter your salary:");
		this.salary=sc.nextDouble();
	}
	
	public void display(){
		System.out.println("-----Employee Details-----");
		System.out.println("Name:"+this.name);
		System.out.println("Id:"+this.id);
		System.out.println("Salary:"+this.salary);
		System.out.println("---------------------------");
	}
	//object class is the parent class of every class bydefault
	//it has a method toString which generates a hashcode for object and returns the hashcode in form of a string.
	//jo hamara class h object uske pass toString nhi tha toh isliye usne apne parent class k toString ko call kia toh agar hamko hamare object k details print krwane h toh hamko hamare class mein toString ka method banana pdega ki vo method override hojaye.
	//BasicSyntax:
	//class object{
		//public String toString(){
		//	return this.hashcode;
		//}
	//}
	public String toString(){
		return this.name+" "+this.id+" "+this.salary;
	}
	
	Person(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	Person(){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

}

class revEmployee{
	public static void main(String[] args){
		Person e1 = new Person();
		e1.getData();

		Person e2 = new Person(123,"ABC",50000);

		Person e3= new Person();
		e3.getData();
		
		System.out.println(e1);//ab ye hamare person class ka toString bulayega aur uske details return krega toh fir hame display method ki as such need nhi h toh remove kr skte h.
		e1.display();
		e2.display();
		e3.display();
	}
}