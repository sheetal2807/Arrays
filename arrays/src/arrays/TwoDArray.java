package arrays;

public class TwoDArray {

	public static void main(String[] args) {
		int [][] worldPopulation = {
//states for country-->   0   1    2   3   4  5   6
        				{1234,456,789,56,842,653,666},
		        		{321,546,959,76,84,65},
				        {349,565,729,565,582,253},
		};
		//System.out.println(worldPopulation.length);
		//System.out.println(worldPopulation[0]);
		//System.out.println(worldPopulation[1]);
		//System.out.println(worldPopulation[2]);
		
		
		//read
		System.out.println(worldPopulation[0][0]);
		System.out.println(worldPopulation[0][1]);
		System.out.println();
		//update
		worldPopulation[0][0]=7777;
		
		System.out.println(worldPopulation[0][0]);
		System.out.println();
		
		//read all
		for(int i=0;i<worldPopulation.length;i++){
			for(int j=0;j<worldPopulation[i].length;j++) {
			System.out.print(worldPopulation[i][j]+" ");
		}
          System.out.println();
		}
	}

}
