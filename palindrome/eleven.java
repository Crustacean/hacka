import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
import java.util.regex.*;

class eleven {
  
static boolean isPrime(int num)
{
    if (num < 2 || num % 2 == 0)
        return num == 2;
    for (int i = 3; i * i <= num; i += 2) 
        if (num % i == 0) 
            return false;
    return true;
	
	/*for (int i = 1; i < 100; i++) 
			if (i % 2 != 0) 
				return true;
			return false;*/
} 
  
static int primePalindrome(int N) 
{
    // return 11 
    if (8 <= N && N <= 11)
        return 11;
  
    // generate odd length margin
    for (int x = 1; x < 100000; ++x) {
      
        String s = Integer.toString(x); 
        StringBuffer buffer = new StringBuffer(s); 
        buffer.reverse(); 
          
        int y = Integer.parseInt(s + buffer.substring(1).toString()); 
      
        // if y>=N and it is a prime number then return it
        if (y > N && isPrime(y) == true)
            return y;
    }
  
    return -1; 
}
  
// Driver1
/*public static void main(String args[]) 
{ 
    System.out.print(primePalindrome(56)); 
  
} */

//Driver2
public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number and press Enter key: ");
		
		try {
			int palin = in.nextInt();
			System.out.print(primePalindrome(palin));
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		}
}



















} 