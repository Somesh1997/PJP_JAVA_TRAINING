class Examp4
{
   public static void main(String str[])
	{
		int i=0;
		char c;
        int size=Integer.parseInt(str[0]);
	    int[] arr=new int[size];
        for(i=0;i<arr.length;i++)
	    {
            arr[i]=Integer.parseInt(str[i+1]);
	    }
	    for(i=0;i<arr.length;i++)
	    {
           c=(char)arr[i];
           System.out.print(c+" ");
	    }
	    
	}
}