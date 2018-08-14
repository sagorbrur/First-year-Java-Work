import java.util.Scanner;
public class main {
	
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		StringBuilder builder=new StringBuilder();
		int cases=0;
		while(true){
			int n=scan.nextInt();
			long[] a=new long[n];
			for(int i=0;i<n;i++)
				a[i]=scan.nextLong();
			long max=-102;
			for(int i=0;i<n;i++){
				long product=a[i];
				for(int j=i+1;j<n;j++){
					max=Math.max(max, product);
					product*=a[j];
				}
				max=Math.max(max, product);
			}
			if(max<0)
				max=0;
			builder.append("Case #" + ++cases+": The maximum product is"+max+".\n");
			builder.append("\n");
			if(!scan.hasNext())
				break;
		}
		System.out.println(builder.toString());
	}

}
