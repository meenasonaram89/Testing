package assignment;

import java.util.Scanner;

public class Sum_Valueof_Array {
	public static void main(String[] args) {
		
	
	int i=1,j=2,k=3,l=4,m=5;
	int arry[]= {1,2,3,4,5,6,7};
		System.out.println("arry of length :"+arry.length);
		for(int index=0;index<arry.length;index++) {
			System.out.println(arry[index]);
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int index=0;index<arry.length;index++) {
			System.out.println("enter of element a["+index+"] :");
			a[index]=sc .nextInt();
		}
		int sum=0;
		for (int index=0;index<arry.length;index++) {
			sum=sum+a[index];
		}
		System.out.println("sum of ele :"+sum);
		
			
			
		}
}
