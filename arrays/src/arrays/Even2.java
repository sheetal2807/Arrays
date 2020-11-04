package arrays;

public class Even2 {
//wap to generate 5 even no. ending with 4 or 8 
//between the range 100 and 150 and store it in array and print
	public static void main(String[] args) {
		//104 108 114 118 124 128 
		
		int num=100;
        
		int arr[]=new int[5];
		
		for(int i=0;i<arr.length;num=num+2)
		{
			if(num%10==4 || num%10==8) {
				arr[i]=num;
				
				System.out.println(arr[i]);	
			}
			i++;
		}
		
	}

}
