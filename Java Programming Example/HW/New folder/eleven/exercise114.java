package eleven;

import java.util.ArrayList;
import java.util.Scanner;

public class exercise114 {
	public static void main(String[] args) {
		Scanner inputScanner= new Scanner(System.in);
		ArrayList< Integer> mm=new ArrayList<Integer>();
		try {
			
		
		while(true){
			System.out.println("Enter the element number !!!!!!!!! ");
			
			int num=inputScanner.nextInt();
			System.out.println("Enter the element  !!!!!!!!! ");
		for(int i=0;i<num;i++)
		{
			int n=inputScanner.nextInt();
			mm.add(n);
		}
		System.out.println("Maximume number is "+max(mm));
		}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static Integer max(ArrayList<Integer> mm)
	{
		System.out.println("Size is "+mm.size());
		if(mm.isEmpty())
		{
			return null;
		}
		int i=1;
		for(;i<mm.size();i++)
		{
			if(mm.get(i)<mm.get(i-1))
			{
				mm.add(mm.get(i-1));
			}
		}
	
		int nn=mm.get(i-1);
		mm.clear();
		return nn;
	}
}
