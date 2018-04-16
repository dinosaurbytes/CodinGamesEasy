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
        String T = in.nextLine(); //inputed phrase Q1 is E
	// sorting the next lines A,B,C asciiart in an array called arr
        for (int i = 0; i < H; i++) {
            arr[i] = in.nextLine();
        }

	// change string T into char array
	char[] ch = T.toCharArray();
	System.out.println(ch[0]);
	int ascii = (int) ch[0] - (int) 'A';
	System.out.println(ascii);
	
	//printing ascii art
	for (int i = 0; i < H; i++)
	    System.out.println(arr[i].substring(ascii, ascii + L));


        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
	// arr[0].substring(2,4)
	/*
        System.out.println(arr[0].substring(2,4));
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	*/
    }
}

              