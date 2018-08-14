import java.util.Scanner;

public class Swapping {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int x,y,temp;
		System.out.println("Enter x and y");
		x=in.nextInt();
		y=in.nextInt();
		System.out.println("x and y before swapping: "+x+" and "+y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("x and y after swapping: "+x+" and "+y);
		
	}

}
