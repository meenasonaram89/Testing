package assignment;

import java.util.Scanner;

public class given_number {

//	public int findArrary(int i) {
		
	
	
	
	public static void main(String[] args) {
		int i,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter of factorial");
		int num=sc.nextInt();
		for (i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("enter factorial "+num+"is  :"+fact);
	}
}
