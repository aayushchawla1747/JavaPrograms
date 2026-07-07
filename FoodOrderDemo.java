class FoodOrder{
	String userName;
	String restaurant;
	int itemsCount;
	int totalAmount;
	FoodOrder(String userName,String restaurant){
		this.userName=userName;
		this.restaurant=restaurant;
	}
	FoodOrder(String userName,String restaurant,int itemsCount){
		this.userName=userName;
		this.restaurant=restaurant;
		this.itemsCount=itemsCount;
	}
	void addItems(int newItemsCount){
		this.itemsCount+=newItemsCount;
	}
	void printBill(){
		this.totalAmount=80*this.itemsCount;
		System.out.println(this.itemsCount+" items ordered from "+this.restaurant+" restaurant for "+this.totalAmount+" rupees");
		
	}
}

class FoodOrderDemo{
	public static void main(String[] args){
		FoodOrder F1=new FoodOrder("ABCD","MCD");
		F1.addItems(5);
		F1.printBill();
		FoodOrder F2=new FoodOrder("PQRS","BK",8);
		F2.printBill();
		F2.addItems(2);
		F2.printBill();
		
	}
}