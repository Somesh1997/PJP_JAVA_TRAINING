package suite;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void testFindName() {
		  Employee e = new Employee();
		  ArrayList<String> em= new ArrayList<>();
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter all elements");
		  em.add(sc.next());
		  em.add(sc.next());
		  em.add(sc.next());
		  em.add(sc.next());
		  System.out.println("contents: "+em);
		  System.out.println("enter result");
		  String b = sc.next();
		  assertEquals("FOUND",e.findName(em,b));
	}

}
