import java.util.*;
class MyComprator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
    char s1=((Card)(obj1)).c;
    char s2=((Card)(obj2)).c;
    int m=0;
    if(s1==s2)
    {
    	m=0;
    }
    if(s1>s2)
    {
    	m=100;
    }
    if(s1<s2)
    {
    	m=-1;
    }
    return(m);

    }
}




 public class Card
{
    public char c;
     public int key;
 public Card(char c,int key)
{
	this.c=c;
	this.key=key;
}


public static void main(String[] args) {
	TreeSet<Card> card=new TreeSet<Card>(new MyComprator());
       Scanner sc=new Scanner(System.in);
       char cd='\0';
       int k=0;
       while(true)
       {
       	System.out.println("Enter a card ");
       	cd=sc.next().charAt(0);
       	k=sc.nextInt();
        if(card.size()==3)
        {
        	break;
        }
        Card cf=new Card(cd,k);
        card.add(cf);
       }
       System.out.println(card.size());
      for(Iterator<Card> it=card.iterator();it.hasNext();)
          {
             char mj=it.next().c;
             int mk=it.next().key;
             System.out.println(mj+" "+mk);
          
       }
   }
}
