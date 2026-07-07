class CoffeeOrder{
	String customerName;
	int price;
	String coffeeSize;
	
	int getPrice(){
		if ("S".equals(this.coffeeSize)){
			return this.price=100;
		}
		else if ("M".equals(this.coffeeSize)){
			return this.price=150;
		}
		else if ("L".equals(this.coffeeSize)){
			return this.price=200;
		}
		else
			return this.price;
	}
	
	void printReceipt(){
		price=this.getPrice();
		System.out.println(this.customerName+" ordered a "+this.coffeeSize+" coffee of "+this.price+" rupees");
	}
	
	void upgradeToLarge(){
		if ("L".equals(coffeeSize)){
			System.out.println("The Coffee is already Large");
		}
		else{
			this.coffeeSize="L";
		}
	}
	CoffeeOrder(String customerName,String coffeeSize){
		this.customerName=customerName;
		this.coffeeSize=coffeeSize;
	}
	CoffeeOrder(){
		this.customerName=customerName;
		this.price=price;
		this.coffeeSize=coffeeSize;
		
	}
}

class CoffeeOrderDemo{
	public static void main(String[] args){
		CoffeeOrder O1=new CoffeeOrder("ABCD","M");
		O1.printReceipt();
		O1.upgradeToLarge();
		O1.printReceipt();
		CoffeeOrder O2=new CoffeeOrder("IJKL","L");
		O2.printReceipt();
		O2.upgradeToLarge();
		O2.printReceipt();
	}
}