class Examp1
{
   public static void main(String str[])
	{
		int i=0;
        double sum=0.0,avg=0.0;
        int size=Integer.parseInt(str[0]);
	    int[] arr=new int[size];

	   for(i=0;i<arr.length;i++)
	    {
            arr[i]=Integer.parseInt(str[i+1]);
	    }
	    for(i=0;i<arr.length;i++)
	    {
            sum=sum+arr[i];
	    }
	    avg=sum/arr.length;
	    System.out.println("the sum of array elements is:"+sum);
	    System.out.println("the average of array elements is:"+avg);
	}
}