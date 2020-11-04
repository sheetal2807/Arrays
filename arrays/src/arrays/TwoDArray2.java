package arrays;

public class TwoDArray2 {

	public static void main(String[] args) {
		int mat1[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int mat2[][]= {
				{1,2,1},
				{5,4,3},
				{1,7,2}
		};
		//read matrix1
		System.out.println("matrixx 1");
		for(int i=0; i<mat1.length;i++){
			for(int j=0;j<mat1[i].length;j++) {
				System.out.print(mat1[i][j]+" ");
			}
			System.out.println();
		}
		//read matrix 2
		System.out.println("matrixx 2");
		for(int i=0; i<mat2.length;i++){
			for(int j=0;j<mat2.length;j++) {
				System.out.print(mat2[i][j]+" ");
			}
			System.out.println();
		}
		//addition of both matrix
		int mat3[][]=new int[3][3];
		for(int i=0; i<mat3.length;i++){
			for(int j=0;j<mat3.length;j++) {
				mat3[i][j]=mat1[i][j]+mat2[i][j];
			}
			System.out.println();
		}
		//to read/print mat3
		System.out.println("matrixx 3");
		for(int i=0; i<mat3.length;i++){
			for(int j=0;j<mat3.length;j++) {
				System.out.print(mat3[i][j]+" ");
			}
			System.out.println();
		}
		
	}
		
	}


