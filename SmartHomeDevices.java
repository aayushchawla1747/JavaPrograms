/*6. Smart Home Devices

Setup:

Create an abstract class SmartDevice with:

* A concrete method turnOn() that prints:
    "Device is powered on."
* An abstract method operate().

Create subclasses:

* SmartLight → prints:
    "Brightness adjusted automatically."
* SmartFan → prints:
    "Fan speed adjusted automatically."

Task:
Create a SmartDevice reference pointing to a SmartFan object and call both turnOn() and operate().
*/
abstract class SmartDevice{
	public void turnOn(){
		System.out.println("Device is turned on.");
	}
	abstract public void operate();
}

class SmartLight extends SmartDevice{
	public void operate(){
		System.out.println("Brightness adjusted automatically");
	}
}

class SmartFan extends SmartDevice{
	public void operate(){
		System.out.println("Fan speed adjusted automatically");
	}
}

class SmartHomeDevices{
	public static void main(String[] args){
		SmartDevice ref;
		SmartLight l1=new SmartLight();
		SmartFan f1=new SmartFan();
		ref=f1;
		ref.turnOn();
		ref.operate();
	}
}