import java.util.Scanner;

public class TowerHannoi {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter number of disk: ");
		int n=in.nextInt();
		
		//Find the solution recursively
		System.out.println("The moves are: ");
		moveDisk(n,'A','B','C');

	}
	/*The method for finding the solution to move n disks from
	 * fromtower to Totower with auxtower
	 */
	
	public static void moveDisk(int n, char fromTower, char toTower,char auxTower){
		if(n==1)//stopping condition
			System.out.println("move disk " + n + " from " + fromTower + " to " + toTower);
		else
		{
			moveDisk(n-1,fromTower,auxTower, toTower);
			System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
			moveDisk(n-1,auxTower,toTower,fromTower);
		}
	}

}
