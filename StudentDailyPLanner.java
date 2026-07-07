class DailyPlanner{
	private String subject;
	private String taskDescription;
	private boolean isCompleted;
	
	public void setSubject(String subject){
		this.subject=subject;
	}
	public void setTaskDescription(String taskDescription){
		this.taskDescription=taskDescription;
	}
	public void setIsCompleted(boolean isCompleted){
		this.isCompleted=isCompleted;
	}
	public String getSubject(){
		return this.subject;
	}
	public String getTaskDescription(){
		return this.taskDescription;
	}
	public boolean getIsCompleted(){
		return this.isCompleted;
	}
	
	DailyPlanner(String subject,String taskDescription){
		this.subject=subject;
		this.taskDescription=taskDescription;
		this.isCompleted=false;
	}
	DailyPlanner(String Subject){
		this.subject=subject;
		this.taskDescription="Read Notes";
		this.isCompleted=false;
	}
	void markComplete(){
		if(isCompleted){
			System.out.println("The task is already completed");
		}
		else{
			this.isCompleted=true;
		}
	}
	void printTask(){
		System.out.println("The task is to:"+this.taskDescription);
		if (isCompleted){
			System.out.println("The task is completed");
		}
		else{
			System.out.println("The task is not completed");
		}
	}
}

class StudentDailyPlanner{
	public static void main(String[] args){
		DailyPlanner P1=new DailyPlanner("Java","Learning Basics");
		P1.markComplete();
		System.out.println("you have completed "+P1.getTaskDescription());
		DailyPlanner P2=new DailyPlanner("Python");
		P2.printTask();
		P2.markComplete();
		System.out.println("you have completed "+P2.getTaskDescription());
	}
}