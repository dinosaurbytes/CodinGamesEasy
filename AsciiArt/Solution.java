import java.util.*;
import java.io.*;
import java.math.*;

class Solution {
    
    public static void main(String args[]){
	
	Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
	String[] arr = new String[H];
	if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine();
        for (int i = 0; i < H; i++) {
            arr[i] = in.nextLine();
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
    }
}

              