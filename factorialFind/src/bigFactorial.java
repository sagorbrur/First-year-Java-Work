import java.math.BigInteger;
import java.util.Scanner;


public class bigFactorial {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=s.nextInt();
		String fact=factorial(n);
		System.out.println("Factorial is "+fact);
	}
	public static String factorial(int n){
		BigInteger fact=new BigInteger("1");
		for(int i=1;i<=n;i++){
			fact=fact.multiply(new BigInteger(i+""));
		}
		return fact.toString();
	}

}
