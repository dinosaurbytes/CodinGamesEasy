import java.util.*;
import java.io.*;
import java.math.*;

class Sort{
    public static void main(String args[]){
	
	// add scanner
	Scanner in = new Scanner(System.in);
	int N = in.nextInt(); // number of inputs
	int[] array = new int[N]; // create an array to store inputs

	for (int i = 0; i < N; i++) // for loop to store inputs in array
	    array[i] = in.nextInt();
       

	System.out.println("Unsorted array: " + Arrays.toString(array));

	// sort array
	Arrays.sort(array);

	System.out.println("Sorted array: " + Arrays.toString(array));
    }
}