package arrays;

import java.util.Scanner;

public class Mainclass {
        
	//Main thread-th1 ..gc-th2
	//3 threads default gc is also thread in java
	public static void main(String[] args) {
		
		int x;
		Scanner sc = null;
				sc=new Scanner(System.in);
		System.out.println("enter value of x : ");
		x = sc.nextInt();
		System.out.println("X : "+ x);
		
		if (sc!=null) {
		sc.close();
		}
		
		

	}

}
