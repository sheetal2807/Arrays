package arrays;

//wap to store the first 5 char from a to z
//whose ascii 
//value is even number.
//print middle element

public class Ch {
	public static void main(String[] args) {
//b-66 c-67 d-68 e-69 f-70 g-71 h-72 i-73 j-74
		char arr[]={'B','C','D','E',
				'F','G','H','I','J'};
		{ 
		for(char i=0;i<arr.length;i++) {
			
			if (arr[i]%10==0)
					{
				System.out.println(arr[i]);
			}
			
		}
		
		}
	}

}
