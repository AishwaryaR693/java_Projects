package com;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {


		Scanner scan=new Scanner(System.in);

		Bank bank= new Bankimpl(2000);


		while(true) {
			System.out.println("1:Deposite Amount\n2:Withdraw Amoount\n3:check Balance");
			System.out.println("4:exite");

			System.out.println("Enter choice");
			int choice=scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter amount to be deposited");
				int amounttoDeposite=scan.nextInt();
				bank.deposite(amounttoDeposite); //bank.deposite(scan.nextint
				break;

			case 2:
				System.out.println("Enter amount to be withdraw");
				int amounttoWithdraw=scan.nextInt();
				bank.withdraw(amounttoWithdraw); //bank.weposite(scan.nextint
				break;

			case 3 :
				System.out.println("your balance is"+bank.getbalance()); //bank.weposite(scan.nextint
				break;

			case 4:
				System.out.println("Thank you! visit again");
				System.exit(0);
				break; 

			default:
				try
				{
					//if(choice==0 ||choice>=4) {
				throw new InvalidchoiceException("Invalid Choice! plz Enter a valid choice  ");	
				
				}
				catch (Exception f) {
					System.out.println(f.getMessage());  
				}
				//System.out.println("Invalid choice");

			}
			System.out.println("------------------------------");
		}
	}
}
