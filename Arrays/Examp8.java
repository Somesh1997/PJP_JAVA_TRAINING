class Examp8
{
   public static void main(String str[])
	{
		int i=0,j,k=-1;
        int sum=0;
        int size=Integer.parseInt(str[0]);
	    int[] arr=new int[size];

	   for(i=0;i<arr.length;i++)
	    {
            arr[i]=Integer.parseInt(str[i+1]);
	    }
	    for(i=0;i<arr.length;i++)
	    {
           if(arr[i]==6)
           {
           	for(j=i+1;j<arr.length;j++)
           	{
           		if(arr[j]==7)
           		{
           			k=j-i;
           			break;
           		}
           	}
           	for(j=0;j<=k;j++)
           		i++;
            }
           	sum=sum+arr[i];
        }
	    
	    System.out.println("the sum of array elements is:"+sum);
	   
	}
}