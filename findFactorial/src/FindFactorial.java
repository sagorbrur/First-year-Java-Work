import java.util.Scanner;

public class FindFactorial {
	public static void main(String args[]){
		int n,i,fact=1;
		
		System.out.println("Enter an integer to calculate it's factorial...");
		Scanner in=new Scanner(System.in);
		
		n=in.nextInt();
		if(n<0)
			System.out.println("Number should be no-negative.");
		else{
			for(i=1;i<=n;i++){
				fact=fact*i;
			}
			System.out.println(+n+"! = "+fact);
		}
	}

}
