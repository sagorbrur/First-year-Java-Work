import java.util.Scanner;
public class PositiveNegativeOddEven {
	public static void main(String args[]){
		Scanner bucky=new Scanner(System.in);
		int a;
		System.out.println("Enter the value of a: ");
		a=bucky.nextInt();
		if(a>0&&a%2==0){
			System.out.println("The value of a is positive and even.");
		}else if(a>0&&a%2!=0){
			System.out.println("The value of a is positive and odd.");
		}else if(a<0&&a%2==0){
			System.out.println("The value of a is negative and even.");
		}else{
			System.out.println("The value of a is negative and odd.");
		}
	}

}
