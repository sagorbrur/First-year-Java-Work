
public class RecursiveSelectionSort {

	public static void main(String[] args) {
		double[] list={2,3,2,5,6,1,-2,3,14,12};
		sort(list);
		for(int i = 0; i<list.length;i++)
			System.out.print(list[i] + " ");

	}
	
	public static void sort(double[] list){
		sort(list,0,list.length-1);
	}
	private static void sort(double[] list,int low,int high){
		if(low<high){
			//find the smallest number in the list 
			int indexOfMin=low;
			double min=list[low];
			for(int i=low+1;i<=high;i++){
				if(list[i]<min){
					min=list[i];
					indexOfMin=i;
				}
			}
			//swap
			list[indexOfMin]=list[low];
			list[low]=min;
			//sort the remaining list
			sort(list,low+1,high);
		}
	}

}
