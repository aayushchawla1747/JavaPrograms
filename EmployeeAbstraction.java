//WAJP to create an abstract class Employee with fields name,id and an abstract method calculateSalary(),a non-abstract method display(),Create 2 subclasses FullTimeEmployee and PartTimeEmployee.each should have its own logic for salary calculation.use abstraction and polymorphism.

abstract class EmployeeAbstract{
	String name;
	int id;
	double salary;
	abstract public void calcSalary();
	void display(){
		System.out.println("Name:"+this.name+";Id:"+this.id);
	}
}

class FullTimeEmployee extends EmployeeAbstract{
	final int annualSalary=1200000;
	public void calcSalary(){
		System.out.println("Your salary is:"+(annualSalary/12));
	}
	FullTimeEmployee(String name,int id){
		this.name=name;
		this.id=id;
	}
}
class PartTimeEmployee extends EmployeeAbstract{
	final int hourlySalary=500;
	int hours;
	public void calcSalary(){		
		System.out.println("Your salary is:"+this.hours*hourlySalary);
	}
	PartTimeEmployee(String name,int id,int hours){
		this.id=id;
		this.name=name;
		this.hours=hours;
	}
}

class EmployeeAbstraction{
	public static void main(String[] args){
		EmployeeAbstract ref;
		FullTimeEmployee f1=new FullTimeEmployee("ABC",123);
		PartTimeEmployee p1=new PartTimeEmployee("DEF",456,12);
		ref=f1;
		ref.display();
		ref.calcSalary();
		ref=p1;
		ref.display();
		ref.calcSalary();
		
	}
}