import java.util.Scanner;

public class RecursiveBinarySearch {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n,list[],search;
		System.out.println("Enter number of elements: ");
		n=in.nextInt();
		list=new int[n];
		for(int i=0;i<list.length;i++)
			list[i]=in.nextInt();
		System.out.println("Enter number that u want to search: ");
		search=in.nextInt();
		recursiveBinarySearch(list,search);
		System.out.println("Your desire number is in position of : " + recursiveBinarySearch(list,search) + " ");
		
		
	}
	
	public static int recursiveBinarySearch(int[] list,int key){
		int low=0;
		int high=list.length-1;
		return recursiveBinarySearch(list,key,low,high);
	}
	
	private static int recursiveBinarySearch(int[] list, int key, int low, int high){
		if(low>high)
			return -low-1;
		
		int mid=(low+high)/2;
		if(key<list[mid])
			return recursiveBinarySearch(list,key,low,mid-1);
		else if(key==list[mid])
			return mid;
		else
			return recursiveBinarySearch(list,key, mid+1,high);
	}

}
