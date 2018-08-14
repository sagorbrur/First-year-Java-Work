import java.util.Scanner;
public class CompoundInterest {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		/*compound interest is total interest in a period;
		 * the formula is FV = PV � (1+r)^n
		 * here FV=future Value,PV=Previous value,r=rate of interest, n=period;
		 */
		//int day;
		double amount;
		double principal;
		double rate;
		
		System.out.print("Enter your principal: ");
		principal=input.nextDouble();
		System.out.println("Enter rate: ");
		rate=input.nextDouble();
		//day=input.nextInt();
		
		for(int day=1;day<=20;day++){
			amount=principal*Math.pow(1+rate,day);
			System.out.println("your 20 days amount: ");
			System.out.println(day+"   "+amount);
		}
	}

}