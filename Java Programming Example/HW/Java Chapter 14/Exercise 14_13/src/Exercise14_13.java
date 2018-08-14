import java.math.*;

public class Exercise14_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger bigNum=new BigInteger(Long.MAX_VALUE+"");
		bigNum.add(BigInteger.ONE);
		int count=1;
		while(count<=10){
				System.out.println();
				count++;
			}
			bigNum=bigNum.add(BigInteger.ONE);

	}
	public BigInteger square(BigInteger num){
		BigInteger sq;
		sq=num.multiply(num);
		return sq;
	}

}
