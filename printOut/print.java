import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class print {
	
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number and press Enter key: ");
        int n = in.nextInt();		
		
		System.out.println("Displaying your results...");
		System.out.print( "\n" );
		//int n=2;
		for (int i=1; i<=10; i++) {
		System.out.println(n +"x" +i +" = "+n*i);		
		//System.out.print( "\n" );
		}		
		System.out.print( "\n" );
		System.out.println("Finished.");	
	}		
}