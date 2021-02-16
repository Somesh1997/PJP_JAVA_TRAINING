class Examp7
{
   public static void main(String str[])
	{
		int i=0,j=0,k;
        int size=Integer.parseInt(str[0]);
	    int[] arr=new int[size];
        int len=size;
	   for(i=0;i<arr.length;i++)
	    {
            arr[i]=Integer.parseInt(str[i+1]);
	    }
	    for(i=0;i<len;i++)
	    {
          for(j=i+1;j<len;j++)
          {
          	if(arr[i]==arr[j])
          	{
          		for( k=j;k<len-1;k++)
          		{
          			arr[k]=arr[k+1];
                }
                len--;
          		
          	}
          }  
	    }
	     for(i=0;i<len;i++)
	    {
            System.out.print(arr[i]+" ");
	    }
	   
	}
}