class Employee{
	private String name;
	private int salary;
	
	//parametrized constructor
	Employee(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
	
	//our own default constructor which is usually provided by java but it doesnt provide when we build our own constructor.
	Employee(){
		this.name="";
		this.salary=0;
	}
	
	public String getName(){
		return this.name;//this ka mtlb jis object k liye call hua h.
	}
	
	public int getSalary(){
		//role level filters will appear here (if any)
		return this.salary;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setSalary(int salary){
		if (salary>=0)
		{
			this.salary=salary;
		}
	}
}

class EmployeeDemo{
	public static void main(String[] args){
		Employee e1= new Employee("Aayush",250000);
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		Employee e2=new Employee();
		e2.setName("ABCD");
		e2.setSalary(150000);
		System.out.println(e2.getName());
		System.out.println(e2.getSalary());
	}
}