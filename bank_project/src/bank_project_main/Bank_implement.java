package bank_project_main;

import custom_exceptions.InvallidAmmountException;

public class Bank_implement implements Bank{


	double bal;

	public Bank_implement(int bal)
	{
		this.bal=bal; //constructer
	}

	@Override
	public void deposite(double ammount) {
		System.out.println("Deposited Ammount is ="+ammount);
		bal=bal+ammount;
		System.out.println("Ammount Deposited SuccesFully");
	}

	@Override
	public void withdrow(double ammount) {
		if(bal>ammount)
		{
			System.out.println("Withdrowal Ammount is = "+ammount);
			bal-=ammount;
			System.out.println("Ammount withdraw SuccesFully *'..'* ");
		}
		else  // Exception
		{
			try {
				throw new InvallidAmmountException("insufficient Ammount");
			} catch (Exception e)
			{
				System.out.println(e.getMessage());
			}


		}
	}

	@Override
	public double getbal() {
		return bal;
	}



}
