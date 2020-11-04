package arrays;

public class Even {//store 1st 5 even no and print

	public static void main(String[] args) {
		int arr[]= {0,1,2,3,4,5,6,7,8}; //0 2 4 6 8
		
		for(int i=0;i<arr.length;i++) {
			
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
