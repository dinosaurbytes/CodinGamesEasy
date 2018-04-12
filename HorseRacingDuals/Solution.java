import java.util.*;
import java.io.*;
import java.math.*;
import java.util.Arrays;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
	// Create an array to store horses
	int[] horses = new int[N];
	

        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();

	    // store pi in horse array
	    horses[i] = pi;

	    // Sort array
	    Collections.sort( horses);
	    
        }
	for (int a = 0; a < horses.length; a++)
	    System.out.print(horses[a] + " ");
	System.out.println();
	
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

	//   System.out.println(Arrays.toString(horses));
       
    }
}