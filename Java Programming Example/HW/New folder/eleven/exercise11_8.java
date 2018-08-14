package eleven;

import java.util.*;

public class exercise11_8 {

	public static void main(String[] args) {
		Accountt account=new Accountt("George", 1122, 1000);
		account.deposit(30);
		account.deposit(40);
	    account.deposit(50);
	    
	    account.withdraw(5);
	    account.withdraw(4);
	    account.withdraw(2);
		System.out.println("Account holder name "+account.getName());
		System.out.println("Interest rate "+account.getAnnualInterestRate());
		System.out.println("Balance "+account.getBalance());
		System.out.println("    Date			Character	Amount		Banlance");
		for(int i=0;i<account.transact.size();i++)
		{
			System.out.print(account.transact.get(i).getDate()+"	  ");
			System.out.print(account.transact.get(i).getCh()+"		");
			System.out.print(account.transact.get(i).getAmount()+"		");
			System.out.print(account.transact.get(i).getBalance()+"");
			System.out.println();
		}
	}

}

