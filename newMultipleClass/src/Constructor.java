import java.util.Arrays;
import java.util.Scanner;

public class Constructor {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int[] ar={561,1105,1729,2465,6601,8911,10585,15841,29341,41041,52633,62745,63973,75361};
		int n=-1;
		while((n=in.nextInt())!=0)
			 System.out.println((Arrays.binarySearch(ar, n) >=0? "The number "+ n + " is a Carmichael number." : n + " is normal."));
			
	}
}
