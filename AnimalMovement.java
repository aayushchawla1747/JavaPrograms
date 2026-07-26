/*2. Animal Movement

Setup:
Create a base class Animal with method move().

Create two subclasses:

* Bird → override move() to print:
    "Flies in the sky"
* Fish → override move() to print:
    "Swims in water"

Task:
In main(), create an Animal reference pointing to a Fish object. Call move().*/
abstract class Animal{
	abstract public void move();
}

class Bird extends Animal{
	public void move(){
		System.out.println("Flies in the sky.");
	}
}

class Fish extends Animal{
	public void move(){
		System.out.println("Swims in water.");
	}
}

class AnimalMovement{
	public static void main(String [] args){
		Animal ref;
		Bird B1=new Bird();
		Fish f1=new Fish();
		ref=f1;
		ref.move();
	}
}