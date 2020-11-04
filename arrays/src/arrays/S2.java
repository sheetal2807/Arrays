package arrays;

public class S2 {

	public static void main(String[] args) {
		//wap to store1st 10 num div by 5 in rev order.
		//print alternate elements from index 1
	int arr[]= {1,5,10,15,16,20,21,25,27,30,32,35,40,45,50};
	
	for(int i=0; i<arr.length; i++) {
		
		if(i%2==5) 
		{
			System.out.println(arr[i]);
		}

	}

	}
}
