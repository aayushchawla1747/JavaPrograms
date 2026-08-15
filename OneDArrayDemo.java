import java.util.Scanner;
class OneDArray{
	int a[];
	int i,j;
	int max=0;
	int size;
	Scanner sc=new Scanner(System.in);
	
	
	//asks size from the user and then fills the array.
	void createArray(){
		System.out.println("Enter the size of array:");
		size=sc.nextInt();
		a=new int[size];
		System.out.println("Enter elements one-by-one:");
		for(i=0;i<size;i++){
			a[i]=sc.nextInt();
		}
	}
	
	//to check the occurence of an key.
	void findKey(){
		System.out.println("Enter the number to find if it is present or not:");
		int key=sc.nextInt();
		boolean found=false;
		for(i=0;i<size;i++){
			if(a[i]==key){
				found=true;
				break;
			}
		}
		if (found)
			System.out.println(key+" is present in the array ");
		else
			System.out.println(key+" is not present in the array ");
	}
	
	//returns the index of the number to be searched in the array
	void returnIndex(){
		System.out.println("Enter the number to find its index:");
		int elem=sc.nextInt();
		boolean index=false;
		for(i=0;i<size;i++){
			if(a[i]==elem){
				System.out.println(elem+" found at index "+i);
				index=true;
				break;
			}
		}
		if(index=false)
			System.out.println("element not present in the array.");
	}
	
	void maxMin(){
		int min=a[0];
		//loop for finding the maximum element.
		for(i=0;i<size;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		//loop for finding the minimum element.
		for(j=0;j<size;j++){
			if(a[j]<min){
				min=a[j];
			}
		}
		System.out.println("Max:"+max+"\nMin:"+min);
	}
	
	//finding the second largest element from the array.
	void findSecondLargest(){
		int SecondLargest=0;
		for(i=0;i<size;i++){
			if(a[i]>SecondLargest && a[i]<max){
				SecondLargest=a[i];
			}
		}
		System.out.println("Second largest element:"+SecondLargest);
	}
	
	//find the number of even and odd elements in the array.
	void count(){
		int even=0,odd=0;
		for(i=0;i<size;i++){
			if(a[i]%2==0){
				even++;
			}
			else
				odd++;
		}
		System.out.println("Even numbers in the array:"+even+"\nOdd numbers in the array:"+odd);
	}
	
	//find duplicates
	void findDuplicates(){
		for(i=0;i<size;i++){
			for(j=i+1;j<size;j++){
				if(a[i]==a[j]){
					System.out.println(a[i]+" is duplicated.");
				}
			}
		}
	}
	
	//remove duplicates
	void removeDuplicates(){
		int unique[]=new int[size];
		int count=0;
		for(i=0;i<size;i++){
			boolean duplicate=false;
			for(j=0;j<count;j++){
				if(a[i]==a[j]){
					duplicate=true;
					break;
				}
			}
			if(!duplicate){
				unique[count]=a[i];
				count++;
			}
		}
		System.out.println("Array after removing duplicates:");
		for(int k=0;k<count;k++){
			System.out.print(unique[k]+" ");
		}
		System.out.println("The size of new arrays without duplicates is:"+count);
	}
}

class OneDArrayDemo{
	public static void main(String[] args){
		OneDArray a1=new OneDArray();
		a1.createArray();
		a1.findKey();
		a1.returnIndex();
		a1.maxMin();
		a1.findSecondLargest();
		a1.count();
		a1.findDuplicates();
		a1.removeDuplicates();
	}
}
