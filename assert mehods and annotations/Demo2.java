import java.util.Scanner;
public class Demo2 {
	boolean palindromeCheck(String sc)
	{
		
	    String temp=sc;
	    StringBuffer sb = new StringBuffer(sc);
	    sb.reverse();
	    sc=sb.toString();
	    if(temp.equalsIgnoreCase(sc))
	    {
	    	return true;
	    }
	    else
	    	return false;
	}
}

