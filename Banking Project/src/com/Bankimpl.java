package com;

public class Bankimpl implements Bank{
	int bal;

	public Bankimpl(int bal){
		this.bal=bal;
	}

	@Override
	public void deposite(int amount) {
		System.out.println("deposited Ammount is "+amount);
		bal+=amount;  //bal=bal+amount
		System.out.println("Amount deposited succesfully!!!");
	}

	@Override
	public void withdraw(int amount) {
		if(amount<=bal) {
			System.out.println("Withdraw Ammount is "+amount);
			bal-=amount;   //bal=balamount
			System.out.println("Amount Withdraw succesfully!!!");
		}
		else
		{
			try {
				throw new  InsufficientBalanceException("insufficient Balance guru!!");
			}
			catch (Exception e) {
				System.out.println(e.getMessage());          
			}
		}
	}

	@Override
	public int getbalance(){
		return bal ;
	}
	 

}
