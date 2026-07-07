class HotelRoom{
	private int roomNo;
	private boolean isAC;
	private int price;
	
	public void setRoomNo(int roomNo){
		this.roomNo=roomNo;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public void setisAC(boolean isAC){
		this.isAC=isAC;
	}
	
	public int getRoomNo(){
		return this.roomNo;
	}
	public int getPrice(){
		if (isAC){
			this.price=2000;
		}
		else{
			this.price=1000;
		}
		return this.price;
	}
	public boolean getisAC(){
		return this.isAC;
	}
	HotelRoom(int roomNo,boolean isAC){
		this.roomNo=roomNo;
		this.isAC=isAC;
		this.price=price;
	}
	HotelRoom(int roomNo){
		this.roomNo=roomNo;
		this.isAC=true;
		this.price=price;
	}	
	public void printRoomDetails(){
		System.out.println("Room number is:"+this.roomNo);
		if (this.isAC){
			System.out.println("The room is Air-conditioned.");
		}
		else{
			System.out.println("The room is non air-conditioned");
		}
		System.out.println("The price of the room per night is:"+this.getPrice());
	}
}

class HotelRoomDemo{
	public static void main(String[] args){
		HotelRoom R1=new HotelRoom(13,true);
		R1.printRoomDetails();
		HotelRoom R2=new HotelRoom(15);
		R2.printRoomDetails();
		HotelRoom R3=new HotelRoom(14,false);
		R3.printRoomDetails();
	}
}