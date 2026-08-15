//WAJP to crate a class employee it should have methods to getDetails of employee from user,display details of employee write a main function to crate array of objects of class employee.

import java.util.*;
class Employee{
	String name;
	int id;
	double salary;
	
	
	public void getDetails(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		this.name=sc.nextLine();
		System.out.println("Enter your ID:");
		this.id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your salary:");
		this.salary=sc.nextDouble();
		sc.nextLine();
		
	}
	public void display(){
		System.out.println("Name:"+name);
		System.out.println("ID:"+id);
		System.out.println("Salary:"+salary);
		
	}

}

class EmployeeReferenceArray{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of employees:");
		int n=sc.nextInt();
		Employee e[]=new Employee[n];
		for(int i=0;i<n;i++){
			e[i]=new Employee();
			e[i].getDetails();
			e[i].display();
		}
	}
}