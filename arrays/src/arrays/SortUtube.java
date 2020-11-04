package arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortUtube {

	public static void main(String[] args) {
		 Integer arr[]= {3,5,9,7,1};
		 
		System.out.println(Arrays.toString(arr));
Arrays.sort(arr,Collections.reverseOrder());
System.out.println(Arrays.toString(arr));
	}

}
