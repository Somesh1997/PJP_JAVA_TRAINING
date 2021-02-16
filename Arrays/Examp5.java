class Examp5
{
   public static void main(String str[])
	{
		int i=0;
        int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
        int size=Integer.parseInt(str[0]);
	    int[] arr=new int[size];

	   for(i=0;i<arr.length;i++)
	    {
            arr[i]=Integer.parseInt(str[i+1]);
	    }
		for (i=0;i<arr.length; i++)
		{
			if (max1 < arr[i])
			{
				max2 = max1;
				max1 = arr[i];
			}
			else if (max2 < arr[i])
			{
				max2 = arr[i];
			}
		}
		System.out.println("Largest two numbers are: " + max1+","+max2);

		for (i=0;i<arr.length; i++)
		{
			if (arr[i]<min1)
			{
				min2 = min1;
				min1 = arr[i];
			}
			else if (arr[i]<min2)
			{
				min2 = arr[i];
			}
		}
		System.out.println("Smallest two numbers are: " + min1+","+min2);    
	}
}