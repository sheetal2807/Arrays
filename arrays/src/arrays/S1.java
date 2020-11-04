package arrays;

public class S1 {

	public static void main(String[] args) {
//wap to store 10 odd num start from
//250 print alternate element of array from index zero 
		//int start=250;
		
		int arr[]=new int [10];
		{
			for(int i=250;i<arr.length;i++) {
				
				if(i%2==0) 
				{
					System.out.println(arr[i]);
				}
				
			}
		}
		
			
	}

}
