class SSCSTUDENT{
	int rollNo;
	String name;
	double per;
	SSCSTUDENT(int rollNo,String name,double per){
		this.rollNo=rollNo;
		this.per=per;
		this.name=name;
	}
	public void display(){
		System.out.println(this.rollNo);
		System.out.println(this.name);
		System.out.println(this.per);
	}
}

class SCISTUDENT extends SSCSTUDENT{
	int p;
	int c;
	int m;
	SCISTUDENT(int rollNo,String name,double per,int p,int c,int m){
		super( rollNo, name, per);
		this.p=p;
		this.c=c;
		this.m=m;
		
	}
	
	public void display(){
		System.out.println(this.rollNo);
		System.out.println(this.name);
		System.out.println(this.per);
		System.out.println(this.p);
		System.out.println(this.c);
		System.out.println(this.m);
	}
}

class Inheritance{
	public static void main(String[] args){
		SSCSTUDENT S1= new SSCSTUDENT(45,"Rohit",90);
		S1.display();
		
		SCISTUDENT S2= new SCISTUDENT(18,"VIRAT",84,90,65,80);
		S2.display();
	}
}