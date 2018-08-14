import java.util.Scanner;
public class ComputFactorial {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a non-negatice integer: ");
		int n=in.nextInt();
		
		//Display Factorial
		System.out.println("Factorial of " + n + " is " + factorial(n));
	}

	//Return factorial by recursion
	public static long factorial(int n){
		if(n==0)//Base case
			return 1;
		else
			return n*factorial(n-1);//Recursive call
	}
}
