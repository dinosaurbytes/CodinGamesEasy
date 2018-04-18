import java.util.*;
import java.io.*;
import java.math.*;

class Solution {
    
    static final char FIRST_CHAR = 'A';
    static final char LAST_CHAR = 'Z';
    static final char QUESTION_MARK = LAST_CHAR + 1;
    
    public static void printChar(int l, char c, String[] rep, int w) {
        int begin = (c - FIRST_CHAR) * w;
        int end = begin + w;
        System.out.print(rep[l].substring(begin, end));
    }
        
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
	
	if (in.hasNextLine()) {
            in.nextLine();
        }
        
        // Text to display
        String T = in.nextLine().toUpperCase(); 
        
        //Ascii Art
        String[] arr = new String[H];
        for (int i = 0; i < H; i++) {
            arr[i] = in.nextLine();
        }

        // print results
        for (int l=0; l < H; l++){
            for (char c : T.toCharArray())
                if (FIRST_CHAR <= c && LAST_CHAR >= c)
		    printChar(l,c,arr,L);
		else 
		    printChar(l,QUESTION_MARK,arr,L);
	    System.out.println();
	}
    }
    
}