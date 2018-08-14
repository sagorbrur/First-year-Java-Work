import java.util.*;
import java.io.*;
import java.math.*;
public class UVa10929 {
	public static void main(String[] args){
		Scanner cin=new Scanner(new BufferedInputStream(System.in));
		PrintWriter cout=new PrintWriter(new BufferedOutputStream(System.out));
		while(int t=cin.nextInt())
		{
			BigInteger a=new BigInteger(cin.next());
			if(a%11==0){
				System.println(a.toString()+" is a multiple of 11");
			}else{
				System.println(a.toString()+" is not a multiple of 11");
			}
		}
	}

}
