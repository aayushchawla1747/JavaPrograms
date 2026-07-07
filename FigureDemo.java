//consider a class figure and overload the function called area to display the area of figures like square,rectangle,triangle and circle.
class Figure{
	final float PI=3.14f;
	//square
	public int dispArea(int side){
		return side*side;
	}
	//circle
	public float dispArea(float radius){
		return PI*radius*radius;
	}
	//rectangle
	public int dispArea(int length,int breadth){
		return length*breadth;
	}
	//triangle
	public float dispArea(int base,float height){
		return 0.5f*base*height;
	}
}

class FigureDemo{
	public static void main(String[] args){
		Figure F1= new Figure ();
		System.out.println("Area of Square is:"+F1.dispArea(5));
		
		Figure F2=new Figure ();
		System.out.println("Area of Circle is:"+F2.dispArea(4.5f));
		
		Figure F3=new Figure ();
		System.out.println("Area of rectangle is:"+F3.dispArea(5,8));
		
		Figure F4=new Figure ();
		System.out.println("Area of Triangle is:"+F4.dispArea(4,5.6f));
	}
}