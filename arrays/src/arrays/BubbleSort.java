package arrays;

public class BubbleSort {
	
	static void sort(int []arr) {
		
		int len=arr.length;//5
		
		for(int i=0;i<len-1;i++) {//0 to 3
			for (int j=0;j<len-i-1;j++) {
				
				//swap adj elements
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	//normal sort
	public static void main(String[] args) {
		
		int arr[]= {4,1,10,-3,12};
		 BubbleSort.sort(arr);
		
		 for(int elm :arr) {
			 System.out.print(elm+" ");
		 }
	}

}
