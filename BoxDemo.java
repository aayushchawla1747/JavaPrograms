//wajp to develop a class called as box.the class should declare multiple constructors.the class should have a method to read length,breadth,height.
//the class should have a method to calculate and return the value of area and volume of box.the class should have a method to return the value of length ,breadth and height.write suitable main method()
class Box{
	private int length;
	private int breadth;
	private int height;
	
	public void setLength(int length){
		this.length=length;
	}
	
	public void setBreadth(int breadth){
		this.breadth=breadth;
	}
	
	public void setHeight(int height){
		this.height=height;
	}
	
	public int getLength(){
		return this.length;
	}
	
	public int getBreadth(){
		return this.breadth;
	}
	
	public int getHeight(){
		return this.height;
	}
	
	public int area(){
		return (2*((this.length*this.breadth)+(this.length*this.height)+(this.height*this.breadth)));
	}
	 
	public int volume()//yaha pass nhi krne h parameters qki uske pass knowledge h unn values ka toh this. krke likhna h
	{
		return (this.length*this.breadth*this.height);
	}
	
	Box(int length,int breadth,int height){
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	
	Box(){
		this.length=2;
		this.breadth=4;
		this.height=6;
	}
	public void display(){
		System.out.println("The length of the box is:"+this.length);
		System.out.println("The breadth of the box is:"+this.breadth);
		System.out.println("The height of the box is:"+this.height);
	}
}

class BoxDemo{
	public static void main(String[] args){
		Box b1=new Box(5,7,9);
		System.out.println("The Area of the box is:"+b1.area());
		System.out.println("The Volume of the box is:"+b1.volume());
		b1.display();
		Box b2=new Box();
		System.out.println("The Area of the box is:"+b2.area());
		System.out.println("The Volume of the box is:"+b2.volume());
		b2.display();
	}
}