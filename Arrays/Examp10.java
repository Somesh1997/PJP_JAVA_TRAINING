class Examp10
{
   public static void main(String str[])
	{
		int i=0,j=0,k=0;
	    int[][] arr=new int[3][3];
        if(str.length!=9)
	    {
             System.out.println("please enter 9 integer numbers");
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
	  int max=arr[0][0];
         for(i=0;i<arr.length;i++)
	    {
	    	for(j=0;j<arr.length;j++)
	    	{
              if(arr[i][j]>max)
              {
              	max=arr[i][j];
              }
            }
        }
        System.out.println("biggest number in the array is"+max);   
	}
}