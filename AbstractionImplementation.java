import java.util.Scanner;
abstract class Shape{
	//jabardasti hamko yaha area ka function banana pada qki agar iss parent k kisi child ko area ka function nhi hoga toh iss parent ka function call hoga.qki hamne main mein parent k refernce k through child ka object call kia h aur uska function chalwaya h.
	abstract public void calculateArea();
}

class Circle extends Shape{
	int radius;
	
	public void calculateArea(){
		System.out.println("Area of circle is:"+(3.14*radius*radius));
		
	}
	Circle(int radius){
		this.radius=radius;
	}
}

class Square extends Shape{
	int side;
	
	public void calculateArea(){
		System.out.println("Area of square is:"+(side*side));
	}
	Square(int side){
		this.side=side;
	}
}

class AbstractionImplementation{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Shape ref;
		int option;
		Square s1=new Square(5);
		Circle c1=new Circle(6);
		System.out.println("Enter the name of your shape:");
		System.out.println("1.square"+"\n"+"2.circle"+"\n"+"3.exit");
		option=sc.nextInt();
		switch(option){
			
				case 1:
					ref=s1;
					break;
				case 2:
					ref=c1;
					break;
				//case 3:
					
					//System.out.println("Exitingg....");
					//System.exit(0);
				default:
					ref=c1;break;
					//System.out.println("Invalid option");
					//System.exit(0);
		}
		
		
		//ref is referring wherever s1 is referring to.
		//ref=s1;
		//ref.calculateArea();
		//ref=c1;
		ref.calculateArea();
	}
}