package assignment;

import java.util.Scanner;

public class firstbigestno1 {
public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the first no :");
	int a = sc.nextInt();
	System.out.println("enter the second no :");
	int b = sc.nextInt();
	System.out.println("ent the third no :");
	int c = sc.nextInt();

	if (a > b) {
	System.out.println("num "+a);
	} else if (b >c) {
		System.out.println("big num" + b);
	} else {
		System.out.println("big num " + c);
	}
}
}
