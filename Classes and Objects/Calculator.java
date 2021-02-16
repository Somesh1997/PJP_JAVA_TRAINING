class Calculator
{
	//static
      public static int powerInt(int num1,int num2)
      {
            int f=1;
            for(int i=0;i<num2;i++)
            {
            	f=f*num1;
            }
            return(f);
                        
         }
         static double sum=1;
         public static double powerDouble(double num3,int num4)
         {
         	for(int i=0;i<num4;i++)
         	{
         		sum=sum*num3;
         	}
         	return(sum);
         }
      public static void main(String[] args) {
      int num1=Integer.parseInt(args[0]);
      int num2=Integer.parseInt(args[1]);
      double num3=Double.parseDouble(args[2]);
      int num4=Integer.parseInt(args[3]);
                  System.out.println("power of Integer values "+powerInt(num1,num2));
                  System.out.println("power of Double valuse "+powerDouble(num3,num4));


//      double num3=Double.parseDouble();
       
        
      
      }
}






