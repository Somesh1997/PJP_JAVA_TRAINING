class Examp2
{
   public static void main(String str[])
	{
		int i=0,max=0,min=0;
        int size=Integer.parseInt(str[0]);
	    int[] arr=new int[size];

	   for(i=0;i<arr.length;i++)
	    {
            arr[i]=Integer.parseInt(str[i+1]);
	    }
	    max=arr[0];
	    for(i=0;i<arr.length;i++)
	    {
            if(arr[i]>max)
            {
            	max=arr[i];
            }
	    }
	    min=arr[0];
	    for(i=0;i<arr.length;i++)
	    {
            if(arr[i]<min)
            {
            	min=arr[i];
            }
	    }
        System.out.println("the maximum value of array is:"+max);
	    System.out.println("the minimum value of array is:"+min);
	}
}