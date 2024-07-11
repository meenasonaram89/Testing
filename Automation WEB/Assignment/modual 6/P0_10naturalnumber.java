package assignment;

import java.util.Scanner;

public class P0_10naturalnumber {
	public static void main(String[] args) {
		System.out.println("while loop");
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int i = 0;
		// System.out.println (" Enter your number ");
		number = sc.nextInt();
		while (i < number) {
			System.out.println(i + 1);
			i++;
		}

	}
}
