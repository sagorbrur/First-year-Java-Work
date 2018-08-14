package eleven;

import java.util.ArrayList;
import java.util.Date;

public class Accountt {
	private long ID;
	private double balance;
	private double annualInterestRate;
	private Date date;
	private String name;
	 ArrayList<transaction> transact=new ArrayList<transaction>();
	
	//constructor create
	public Accountt()
	{
		ID=0;
		balance=0;
		annualInterestRate=0;
		date=new Date();
	}
	public Accountt(String name,long iD, double balance) {

		this.name=name;
		ID = iD;
		this.balance = balance;
		date=new Date();
		annualInterestRate=1.5;
	}
	//accessor and mutator method
	
	
	public long getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		{
			balance=balance-withdrawAmount;
		transact.add(new transaction('W', withdrawAmount,balance, "Withdraw"));
		}
		else {
			System.out.println("your balance is not sufficient");
		}
	}
	public void deposit(double depositAmount)
	{
		if(depositAmount<balance)
		{	balance=balance+depositAmount;
		transact.add(new transaction('D', depositAmount, balance, "deposit"));
		}
		else
		{
			System.out.println("your balance is not sufficient");
		}
	}
	
}
