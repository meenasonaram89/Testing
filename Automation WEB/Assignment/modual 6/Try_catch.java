package assignment;

import java.util.Scanner;

class Divide {
	public void division()throws ArithmeticException{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a");
		int a=sc.nextInt();
		System.out.println("enter b");
		int b=sc.nextInt();
		int c=a/b;
		System.out.println(c);
				
	}
}

public class Try_catch {
	public static void main(String[] args) {
		
		try {
			Divide d=new Divide();
			d.division();
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
		}
	}
}
