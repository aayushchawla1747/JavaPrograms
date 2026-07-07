class StudentStatic{
	static int count=0;
	String name;
	int rollNo;
	StudentStatic(int rollNo,String name){
		this.name=name;
		this.rollNo=rollNo;
		this.count++;
	}
}

class Count{
	public static void main(String[] args){
		StudentStatic s1=new StudentStatic(20,"abc");
		StudentStatic s2=new StudentStatic(21,"def");
		StudentStatic s3=new StudentStatic(22,"pqr");
		StudentStatic s4=new StudentStatic(23,"xyz");
		StudentStatic s5=new StudentStatic(24,"lmn");
		System.out.println("The no. of objects created is:"+StudentStatic.count);
	}
}