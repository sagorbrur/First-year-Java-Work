import java.math.BigInteger;
import java.util.Scanner;

public class UVa369 {
	public static BigInteger fac(BigInteger n){
		if(n.compareTo(BigInteger.valueOf(1))<=0)
			return BigInteger.valueOf(1);
		return n.multiply(fac(n.subtract(BigInteger.valueOf(1))));
	}
	public static void main(String args[]){
		BigInteger M,N;
		Scanner S=new Scanner(System.in);
		for(;;){
			N = S.nextBigInteger();
			M=S.nextBigInteger();
			if(N.equals(BigInteger.valueOf(0))&&M.equals(BigInteger.valueOf(0))) break;
			System.out.printf("%s things taken %s at time is %s exactly.\n",N.toString(),M.toString(),fac(N).divide(fac(N.subtract(M)).multiply(fac(M))).toString());
			
		}
	}

}
