class TrainTicket{
	private String passengerName;
	private int trainNumber;
	private String seatType;
	private int fare;
	
	public void setpassengerName(String passengerName){
		this.passengerName=passengerName;
	}
	public void settrainNumber(int trainNumber){
		this.trainNumber=trainNumber;
	}
	public void setseatType(String seatType){
		this.seatType=seatType;
	}
	public void setfare(int fare){
		this.fare=fare;
	}
	public String getpassengerName(){
		return this.passengerName;
	}
	public int gettrainNumber(){
		return this.trainNumber;
	}
	public String getseatType(){
		return this.seatType;
	}
	public int getfare(){
		if ("Sleeper".equalsIgnoreCase(seatType)){
			this.fare=150;
			return this.fare;
		}
		else if ("AC".equalsIgnoreCase(seatType)){
			this.fare=300;
			return this.fare;
		}
		else{
			System.out.println("Invalid seatType");
			return -1;
		}
	}
	
	TrainTicket(String passengerName,int trainNumber,String seatType){
		this.passengerName=passengerName;
		this.trainNumber=trainNumber;
		this.seatType=seatType;
	}
	TrainTicket(String passengerName,int trainNumber){
		this.passengerName=passengerName;
		this.trainNumber=trainNumber;
		this.seatType="Sleeper";
	}
	
}

class TrainTicketDemo{
	public static void main(String[] args){
		TrainTicket T1=new TrainTicket("ABC",12345,"AC");
		System.out.println("The fare of T1 is:"+T1.getfare());
		TrainTicket T2=new TrainTicket("PQR",45678);
		System.out.println("The fare of T2 is:"+T2.getfare());

	}
}