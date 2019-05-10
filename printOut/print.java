import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class print {
	
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number and press Enter key: ");
        int n = in.nextInt();		
		System.out.print( "\n" );
		System.out.print("Number entered: "+n);
		System.out.print( "\n" );
		System.out.println("Displaying your results...");
		System.out.print( "\n" );
		//int n=2;
		if (n>2 & n<20){
			for (int i=2; i<10; i++) {
			System.out.println(n +"x" +i +" = "+n*i);
			}
		}else{
			System.out.print("Not allowed");
			
		}	
				
			
		System.out.print( "\n" );
		System.out.println("Finished.");	
	}		
}