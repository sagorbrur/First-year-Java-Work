import java.util.Scanner;
public class Calculator {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int n;
		double fnum,snum,add,sub,multi,div;
		System.out.println("Enter first number: ");
		fnum=input.nextDouble();
		System.out.println("Enter second number: ");
		snum=input.nextDouble();
		add=fnum+snum;
		sub=fnum-snum;
		multi=fnum*snum;
		div=fnum/snum;
		System.out.println("Enter your choice(1.add,2.sub,3.multi,4.div)");
		n=input.nextInt();
		switch(n){
		case 1:
			System.out.println(add);
			break;
		case 2:
			System.out.println(sub);
			break;
		case 3:
			System.out.println(multi);
			break;
		case 4:
			System.out.println(div);
			break;
			default:
				System.out.println("Wrong choice...");
		}	
	}

}
