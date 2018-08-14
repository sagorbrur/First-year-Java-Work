package eleven;

import java.util.Date;

public class exercise113 {

	public static void main(String[] args) {
		
	}

}
class checkingAccount extends Account{
	public void overdranLimit() {
		
	}
}
class Account{
	private long ID;
	private double balance;
	private double annualInterestRate;
	private Date date;
	
	//constructor create
	public Account()
	{
		ID=0;
		balance=100;
		annualInterestRate=0;
		date=new Date();
	}
	public Account(long iD, double balance) {
	
		ID = iD;
		this.balance = balance;
		date=new Date();
	}
	//accessor and mutator method
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	
	//required method....
	public String getDate() {
		return date.toString();
	}
	public double getMonthlyInterestRate()
	{
		return annualInterestRate/12.0;
	}
	
	
	
	public double getMonthlyInterest()
	{
		
		return balance*(annualInterestRate/12)/100;
	}
	public void withdraw(double  withdrawAmount)
	{
		if(withdrawAmount<balance)
		balance=balance-withdrawAmount;
		else {
			System.out.println("your balance is not sufficient");
		}
	}
	public void deposit(double depositAmount)
	{
		if(depositAmount<balance)
			balance=balance+depositAmount;
		else {
			System.out.println("your balance is not sufficient");
		}
	}
	
}
