package eleven;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//import test.ran;

public class exercise117 {

	public static void main(String[] args) {
		try {
			
		ArrayList<Integer> list =new ArrayList<Integer>();
		ArrayList<Integer> lis =new ArrayList<Integer>();
		Scanner input=new Scanner(System.in);
		for(int i=2;i<65;i++)
		{
			list.add(i);
		}
		/*for(int i=0;i<62;i++)
		{
			System.out.println(list.get(i));
		}*/
		lis=suffle(list);
		/*System.out.println(lis.get(2));
		System.out.println(lis.get(2));*/
		/*for(int i=0;i<lis.size();i++)
		{
			System.out.println(lis.get(i));
		}*/
		lis=suffle(list);
		//System.out.println();
		for(int i=0;i<lis.size();i++)
		{
			System.out.println("Enter the element of index number "+i);
			int n=input.nextInt();
			if(lis.get(i)==n)
				System.out.println("Right!!!!!!!!!!!!!!!");
			else {
				 System.out.println("Wrong!!!!!!!!!!!!!!");
			}
		}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public static ArrayList<Integer> suffle(ArrayList<Integer> list)
	{
		ArrayList<Integer> ll=new ArrayList<Integer>();
		Random number=new Random();
		//System.out.println(list.size());
		int n=list.size();
		for(int i=0;i<n;i++)
		{
			ll.add(list.get(number.nextInt(list.size())));
			//System.out.println(number.nextInt(list.size()));
			//System.out.println(ll.get(i));
		}
		return ll;
	}

}
