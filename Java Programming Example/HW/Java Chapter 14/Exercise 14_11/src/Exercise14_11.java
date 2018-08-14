import java.math.*;

public class Exercise14_11 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger bigNum=new BigInteger("10000000000000000000000000000000000000");
		bigNum.add(BigInteger.ONE);
		int count=1;
		while(count<=10){
			if(bigNum.remainder(new BigInteger("5")).equals(BigInteger.ZERO)||bigNum.divide(new BigInteger("6")).equals(BigInteger.ZERO)){
				System.out.println(bigNum);
				count++;
			}
			bigNum=bigNum.add(BigInteger.ONE);
		}
	}

}
