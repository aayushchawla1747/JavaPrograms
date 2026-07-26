/*1. Payment System

Setup:
Create a class PaymentMethod with a method pay(double amount).

Create two subclasses:

* UPIPayment → override pay() to print:
    "Paid ₹<amount> via UPI"
* CardPayment → override pay() to print:
    "Paid ₹<amount> using Card"

Task:
In main(), use a PaymentMethod reference to hold a CardPayment object and call pay(500).
*/

abstract class PaymentMethod{
	double amount;
	abstract public void pay();
}
class UPIPayment extends PaymentMethod{
	double amount;
	UPIPayment(double amount){
		this.amount=amount;
	}
	public void pay(){
		System.out.println("Paid "+amount+" via UPI");
	}
}

class CardPayment extends PaymentMethod{
	double amount;
	CardPayment(double amount){
		this.amount=amount;
	}
	public void pay(){
		System.out.println("Paid "+amount+" using Card");
	}
}

class PaymentSystem{
	public static void main(String [] args){
		PaymentMethod ref;
		UPIPayment u1=new UPIPayment(500);
		CardPayment c1=new CardPayment(1000);
		ref=c1;
		ref.pay();
	}
}