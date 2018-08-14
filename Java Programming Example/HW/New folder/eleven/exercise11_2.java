package eleven;

import java.util.Date;
import java.util.GregorianCalendar;

public class exercise11_2 {

	public static void main(String[] args) {
		
		person p1=new student("DHIRAJ","Rangpur","dhirajroy.cse@gmail.com","01767522268");
		person p2=new Employee("DHIRAJ ROY", "DHAKA", "dhirajroy.cse@gmail.com", "01767522268", "CSE", 70000);
		person p3=new stuff("DHIRAJ ROY", "DHAKA", "dhirajroy.cse@gmail.com", "01767522268", "CSE", 70000,"5.30","Boss");
		System.out.println(p3.toString());
	}

}

///person class start *************************************************
class person{
	String name;
	String address;
	String emailAddres;
	String PhoneNumber;
	public person(String name, String address, String emailAddres,
			String phoneNumber) {
	
		this.name = name;
		this.address = address;
		this.emailAddres = emailAddres;
		PhoneNumber = phoneNumber;
	}
	public person() {
		
	}
	@Override
	public String toString() {
		return "name=" + name + ",\n address=" + address
				+ "\n"+" emailAddres=" + emailAddres + ",\n PhoneNumber="
				+ PhoneNumber + "\n ";
	}
	
}

/****************** student class by extrend person classs**********************************/
class student extends person{
	final String  classStatus="junior";

	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public student(String name, String address, String emailAddres,
			String phoneNumber) {
		super(name, address, emailAddres, phoneNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString()+"\nstudent classStatus=" + classStatus + "\n ";
	}
}


/****************** Employee class by extrend person classs**********************************/
class Employee extends person{
	
	final String classStatu="Senior";
	String office;
	long salary;
	MyDate date;
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String address, String emailAddres,
			String phoneNumber,String office,long salary) {
		super(name, address, emailAddres, phoneNumber);
		this.office=office;
		this.salary=salary;
		date=new MyDate();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return  super.toString()+"classStatu=" + classStatu + "\n, office=" + office
				+ ",\n salary=" + salary + ",\n date=" + date.getDay();
	}	
	
}
class stuff extends Employee{
	String officeHour;
	String rank;
	public stuff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public stuff(String name, String address, String emailAddres,
			String phoneNumber, String office, long salary,String officeHour,String rank) {
		super(name, address, emailAddres, phoneNumber, office, salary);
		// TODO Auto-generated constructor stub
		this.officeHour=officeHour;
		this.rank=rank;
	}
	@Override
	public String toString() {
		return "\nofficeHour=" + officeHour + ",\n rank=" + rank
				+ ",\n classStatu=" + classStatu + ",\n office=" + office
				+ ",\n salary=" + salary + ",\n date=" + date.getDay() + ",\n name=" + name
				+ "\n, address=" + address + ", \n emailAddres=" + emailAddres
				+ ",\n PhoneNumber=" + PhoneNumber;
	}
	
	
	
}

class MyDate{
	int year=0,month=0,day=0;
	GregorianCalendar calendar;
	public MyDate() {
		calendar=new GregorianCalendar();
		year=calendar.get(GregorianCalendar.YEAR);
		month=calendar.get(GregorianCalendar.MONTH);
		day=calendar.get(GregorianCalendar.DAY_OF_MONTH);
	}
	public  MyDate(double elapsedTime) {
		double second=elapsedTime/1000;
		double minute=second/60;
		double hour=minute/60;
		double day=hour/24;
		
		this.day=(int) (day%30);
		month=(int)(day%12);
		year=(int)(day/365)+1970;
	}
	public MyDate(int year, int month, int day) {
		
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public void setDate(double elapsedTime) {
		double second=elapsedTime/1000;
		double minute=second/60;
		double hour=minute/60;
		double day=hour/24;
		
		this.day=(int) (day%30);
		month=(int)(day%12);
		year=(int)(day/365)+1970;
	}	
}



