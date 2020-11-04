package arrays;

public class OneDArray2 {

	public static void main(String[] args) {
	//1-d array 	
	//int arr[]= {21,22,23,24,25};
	//print
	/*System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	System.out.println(arr[4]);
*/	
	//another type
	int countrypop[] = new int[] {30,31,32,33,34};
	System.out.println(countrypop);	
	
   //read all
	/*for(int i=0;i<arr.length;i++)//to print first type
	{
		System.out.println(arr[i]);
	}*/
	//read 2
	for(int i=0;i<countrypop.length;i++)//to print second type
	{
		System.out.println(countrypop[i]);
	}
	
	
	//to update
	countrypop[0]=666;
	
	System.out.println();
	
	System.out.println("updated ");
	
	System.out.println();
	
	//to print updated program
	for(int i=0;i<countrypop.length;i++) {
		
		System.out.println("countryPop["+i+"] is: "+countrypop[i]);
	}
	
	}

}
