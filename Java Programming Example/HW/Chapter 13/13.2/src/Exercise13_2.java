import java.util.Scanner;

public class Exercise13_2 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		
		boolean done=false;
		int num1=0;
		int num2=0;
		System.out.print("Enter two integers: ");
		while(!done){
			try{
				num1=in.nextInt();
				num2=in.nextInt();
				done=true;
			}
			catch(Exception ex){
				System.out.print("Incorrect input and re-enter two integers: ");
				in.nextLine();
			}
		}
		System.out.println("Sum is " + (num1+num2));
	}

}
