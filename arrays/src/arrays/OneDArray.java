package arrays;

public class OneDArray {

	public static void main(String[]args) {
	//SingleValueContainers
	int state1PopulationCount=502;
	int state2PopulationCount=786;
	int state3PopulationCount=987;
	int state4PopulationCount=300;
	int state5PopulationCount=509;
	
	
	//multi Value container
	//int[] countryPopulation =new int[5];//all elements were by default zero
	//int[] countryPopulation = {56,98,75,123,55};//elements have initial values implicit way
	int[] countryPopulation =new int[] {98,75,78,45,32};//explicit way
	
	System.out.println("countryPopulation is: "+countryPopulation);
	//1)Read the element in array
	//System.out.println("countryPopulation[0] is: "countryPopulation[0]);
	//System.out.println("countryPopulation[1] is: "countryPopulation[1]);
	
	//2)Read all
	for(int i=0;i<countryPopulation.length;i++) {
		System.out.println("countryPopulation["+i+"] is: "+countryPopulation[i]);
	}
	//write operation/update 
	countryPopulation[0]=5022;
	countryPopulation[1]=8566;
	countryPopulation[2]=52262;
	countryPopulation[3]=5156;
	countryPopulation[4]=8925;
	
	System.out.println();
System.out.println("re read opeartion");
	
/*for(int i=0;i<countryPopulation.length;i++) {
	
	System.out.println("countryPopulation["+i+"] is: "+countryPopulation[i]);
}*/

	//for each loop
int count=0;
for(int elm : countryPopulation) {
	count=count +elm;
	System.out.println(elm);
     }
	System.out.println("population count for country "+count);
	}
}