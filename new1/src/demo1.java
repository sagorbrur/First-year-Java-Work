
public class demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int input = 10;
int finalresult = summation(input);
System.out.print(finalresult);
	}
	public static int summation(int n){
		int result=(n*(n+1))/2;
		
		return result;
	}

}