import java.util.*;
import java.io.*;
import java.math.*;


class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
	// create an array to store values
	int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
	//Sort array
	Arrays.sort(arr);

	// find smallest difference
	int smallestDif = 10000;
	
	for(int i = 0, j = 1; i < N-1; i++){
	    if (arr[j]-arr[i] <= smallestDif)
		smallestDif = arr[j]-arr[i];
	    j++;
	}
	
      

        System.out.println(Arrays.toString(arr));
	System.out.println(smallestDif);
    }
}