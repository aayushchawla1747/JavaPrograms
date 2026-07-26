/*5. Food Delivery Partner

Setup:

Create a class DeliveryPartner with method deliverOrder().

Create subclasses:

* BikeDelivery → override deliverOrder() to print:
    "Order delivered by Bike."
* DroneDelivery → override deliverOrder() to print:
    "Order delivered by Drone."

Task:
Store a DroneDelivery object inside a DeliveryPartner reference and deliver an order.*/

abstract class DeliveryPartner{
	abstract public void deliverOrder();
}

class BikeDelivery extends DeliveryPartner{
	public void deliverOrder(){
		System.out.println("Order delivered by Bike.");
	}
}
class DroneDelivery extends DeliveryPartner{
	public void deliverOrder(){
		System.out.println("Order delivered by Drone.");
	}
}

class FoodDeliveryPartner{
	public static void main(String[] args){
		DeliveryPartner ref;
		BikeDelivery b1=new BikeDelivery();
		DroneDelivery d1=new DroneDelivery();
		ref=d1;
		ref.deliverOrder();
	}
}