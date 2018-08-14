import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class ageCalculator {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int daysInMon[]={31,28,31,30,31,30,31,31,30,31,30,31};
		int days,month,year;
		char[] dob=new char[110];
		System.out.println("Enter your birhtdate: ");
		days=input.nextInt();
		System.out.println("Enter your birhtmonth: ");
		month=input.nextInt();
		System.out.println("Enter your birhtyear: ");
		year=input.nextInt();
		
		System.out.println("Date of Birth: "+days+"/"+month+"/"+year);
		Date d=new Date();
		System.out.println("Current Date: "+d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));
		
		days=daysInMon[month-1]-days+1;
		
		//calculating the num of year,month,date
		days=days+d.getDate();
		month=(12-month)+d.getMonth();
		year=(d.getYear()+1900)-year-1;
		
		if(month>=12){
			year=year+1;
			month=month-12;
		}
		
		//result option
		System.out.println("Age: "+year+" years "+month+" months "+days+" days ");
		
			
	}

}
