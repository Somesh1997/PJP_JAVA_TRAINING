import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;
public class Demo1Test {

	@Test
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter strings");
		 
		String a=sc.next();
		String b= sc.next();
		System.out.println("enter result");
		String result=sc.next();
		Demo1 d = new Demo1();
		assertEquals(result,d.stringConcat(a,b));
		
	}

}
