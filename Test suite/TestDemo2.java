package suite;
import java.util.*;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class TestDemo2 {

	@Test
	public void testPalindromeCheck() {
		Demo2 d = new Demo2();
		Scanner sc1 = new Scanner(System.in);
	    System.out.println("enter the string");
	    String s = sc1.next();
		assertTrue("string is not palindrome",d.palindromeCheck(s));	  
	}

}
