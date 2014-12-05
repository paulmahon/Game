/** 2D arrays: Problem1 compute the average of the rainfall values stored each day for 4 weeks

@author adriana e chis & HDSCC students
*/
import java.util.Scanner;

public class RainfallApp {
	public static void main(String args[]){
		// declare a 2D array
		int  rain[][];

		// create a 2 D array with 4 rows (corresponding to 4 weeks) and 7 columns (corresponding to 7 days)
		rain = new int[4][7];

		// input
		Scanner sc = new Scanner(System.in);
		// prompt the user to input data
		for (int i = 0; i < rain.length; i++){
			for (int j = 0; j < rain[i].length; j++){
				System.out.println("enter a number for week: " + (i+1) + " day: " + (j + 1));
				rain[i][j] = sc.nextInt();
			}
		}

		int sum = 0; // declare and initialize the sum to 0
		double avg;
		// processing: calculate the sum of all elements of the array and how many elements the array contains
		int elements = 0;
		for (int i = 0; i < rain.length; i++){
			for (int j = 0; j <rain[i].length; j++){
				elements++; // we are traversing another element, that is the element from the array at the row i and column j
				sum = sum + rain[i][j]; // add the current element to the sum
			}
			System.out.println(elements); // display the number of elements seen so far
		}
		avg = (double) sum/elements; // compute the average of all the elements in the array

		// output: display the average
		System.out.println();
		System.out.println("average: " + avg);

		// output: display the 2D values -- the data the user entered
		System.out.println();
		System.out.println("The rainfall values are: ");
		for (int i = 0; i < rain.length; i++){
			for (int j = 0; j < rain[i].length; j++){
			    	System.out.print(rain[i][j] + " ");


			}
			System.out.println();
		}
	}
}
