import java.util.Scanner;

public class ComputFibonacci {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the term of fibonacci: ");
		int n = in.nextInt();
		System.out.println("The Fibonacci Number of " + n + " is " + fibonacci(n));
		
	}
	//The recursive method for finding fibonacci
	public static long fibonacci(int n){
		if(n==0)//base case 
			return 0;
		else if(n==1)//base case
			return 1;
		else
			return fibonacci(n-1)+ fibonacci(n-2);
	}

}
/*
Here the system is if we enter 4 then 4 divide into two part
fib(4-1)+fib(4-2)=fib(3)+fib(2)
=(fib(2)+fib(1))+(fib(1)+fib(0))
=((fib(1)+fib(0))+fib(1))+(fib(1)+fib(0))
=((1+0)+1)+(1+0)
=3
so the output is 3 :D


*/