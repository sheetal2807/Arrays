package arrays;
//even in reverse order
public class EvenRev {

	public static void main(String[] args) {
		int arr[]= {0,1,2,3,4,5,6,7,8,9};
		{
			for(int i=arr.length-1; i>=0; i--) {
				//if(arr[i]%2==0) {
					System.out.println(arr[i]);
				//}
			}
		}

	}

}
