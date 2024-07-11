package Assignment;

import java.util.Scanner;

public class P027_CustomException {
	
		 double diposit, withdraw;
		 double balance=2000;
		 public void Bankaccount(double balance)
		 {	
		 
		     this.balance=balance;
		 }
		  void deposit(double ammount)
		{
		       Scanner b=new Scanner(System.in);
		    System.out.println("diposit a amount");
		     ammount=b.nextInt();
		     balance +=ammount;
		}
		 void withdraw(double ammount)
		{
		       Scanner b=new Scanner(System.in);
		    System.out.println("withdraw a amount");
		     ammount=b.nextInt();
		     balance +=ammount;
		}

		  void display()
		  {
		      System.out.println(balance);
		  }
		public static void main(String[]args)
		{


		}}
	


