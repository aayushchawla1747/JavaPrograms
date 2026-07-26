//Calculate avg of no.s using arrays.take numbers and n from user.

import java.util.*;
class LearningArrays{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		double a[];
		a=new double[n];
		double sum=0;
		
		System.out.println("enter elements to be inserted into the array:");
		for(int i=0;i<n;i++){
			a[i]=sc.nextDouble();
			sum+=a[i];
		}
		double avg=sum/n;
		System.out.println("The Average of the numbers is:"+avg);
	}
}