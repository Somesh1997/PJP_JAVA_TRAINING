import java.util.*;
class MyComprator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
   String s1=((Card)(obj1)).c;
		String s2=((Card)(obj2)).c;
		return s1.compareTo(s2);

    }
}




 public class Card
{
    public String c;
     public int key;
 public Card(String c,int key)
{
	this.c=c;
	this.key=key;
}
public void disp()
{
	System.out.println(c+" "+key);
}


public static void main(String[] args) {
	TreeSet<Card> card=new TreeSet<Card>(new MyComprator());
       Scanner sc=new Scanner(System.in);
       String cd="";
       int k=0;
       while(true)
       {
       	 if(card.size()==4)
        {
        	break;
        }
       	System.out.println("Enter a card ");
       	cd=sc.next();
       	k=sc.nextInt();
       
        Card cf=new Card(cd,k);
        card.add(cf);
       }
       System.out.println(card.size());
       try{
      for(Iterator<Card> it=card.iterator();it.hasNext();)
          {
             it.next().disp();
             //int mk=(int)it.next().key;
             //System.out.println(mj+" "+mk);
          
       }
   }
   catch(Exception e)
   {
   	System.out.println("");
   }
   }
}
