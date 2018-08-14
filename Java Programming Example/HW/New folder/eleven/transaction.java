package eleven;

import java.util.Date;

public class transaction {
	private Date  date;
	private char ch;
	private double amount;
	private double balance;
	private String discription;
	
	
	public transaction(char ch, double amount, double balance,
			String discription) {
	
		this.ch = ch;
		this.amount = amount;
		this.balance = balance;
		this.discription = discription;
		date=new Date();
	}


	public String getDate() {
		return date.toString();
	}


	public char getCh() {
		return ch;
	}


	public double getAmount() {
		return amount;
	}


	public double getBalance() {
		return balance;
	}


	public String getDiscription() {
		return discription;
	}

	
}
