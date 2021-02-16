class Examp9
{
   public static void main(String str[])
	{
		int i=0,j=0,k=0;
	    int[][] arr=new int[2][2];
	    if(str.length!=4)
	    {
             System.out.println("please enter 4 integer numbers");
             System.exit(0);
	    }

	   for(i=0;i<arr.length;i++)
	    {
	    	for(j=0;j<arr.length;j++)
	    	{
            arr[i][j]=Integer.parseInt(str[k]);
            k++;
            }
	    }
	    System.out.println("The given array is");
         for(i=0;i<arr.length;i++)
	    {
	    	for(j=0;j<arr.length;j++)
	    	{
	    	
            System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
	    }
	  int temp;
         for(i=0;i<arr.length-1;i++)
	    {
	    	for(j=0;j<arr.length;j++)
	    	{
          temp=arr[i][j];
          arr[i][j]=arr[arr.length-1-i][arr.length-1-j];
          arr[arr.length-1-i][arr.length-1-j]=temp;
            }
        }
        System.out.println("reverse of the array is");

	     for(i=0;i<arr.length;i++)
	    {
	    	for(j=0;j<arr.length;j++)
	    	{
	    	
            System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
	    }
	   
	}
}