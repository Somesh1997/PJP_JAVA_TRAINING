import java.util.Scanner;
import static org.junit.Assert.*;

import org.junit.Test;

public class Demo2Test {

	@Test
	public void testPalindromeCheck() {
		Demo2 d = new Demo2();
		Scanner sc1 = new Scanner(System.in);
	    System.out.println("enter the string");
	    String s = sc1.next();
	    assertTrue("string is not palindrome",d.palindromeCheck(s));	  	  
	}

}
