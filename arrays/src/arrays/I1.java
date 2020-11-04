package arrays;
//new
import java.util.Arrays;

//wap to find repeating elements in array and add
//them and replace it in position 
//before the repeated element

public class I1 {

	public static void main(String[] args) {
		
		int arr[]= {2,1,3,3,5,4,6,6};
	
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
			//if(arr[i]==arr[j]) {
				System.out.println(arr[i]);
				
			//}	
			
			}
		
		};
		//approach-1 SORT
		
		/*Arrays.parallelSort(arr);
		System.out.println(Arrays.toString(arr));*/
		
		//approach-2
		//Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		
		

	}

}
