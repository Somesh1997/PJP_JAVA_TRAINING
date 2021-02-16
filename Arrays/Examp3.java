class Examp3
{
   public static void main(String str[])
	{
		int i=0;
        int size=Integer.parseInt(str[0]);
        int item=Integer.parseInt(str[1]);
	    int[] arr=new int[size];
        for(i=0;i<arr.length;i++)
	    {
            arr[i]=Integer.parseInt(str[i+2]);
	    }
	    for(i=0;i<arr.length;i++)
	    {
            if(item==arr[i])
            {
            	System.out.println(i);
            	break;
            }
	    }
	    if(i==arr.length)
	    {
	    	System.out.println("-1");
	    }
	}
}