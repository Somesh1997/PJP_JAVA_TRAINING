class Examp6
{
   public static void main(String str[])
	{
		int i=0;
        int size=Integer.parseInt(str[0]);
	    int[] a=new int[size];
        for(i=0;i<a.length;i++)
	    {
            a[i]=Integer.parseInt(str[i+1]);
	    }
	    
       int temp,j;
       for(i=0;i<a.length;i++)
       {
       	for(j=i+1;j<a.length;j++)
          {
               if(a[i]>a[j])
               {
                   temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
               }
          }
          
       }
    for(i=0;i<a.length;i++)
	    {
            System.out.println(a[i]);
	    }
	  
	}
}