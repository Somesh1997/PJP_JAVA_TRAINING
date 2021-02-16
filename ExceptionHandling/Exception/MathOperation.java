public class MathOperation
{
	public static void main(String[] args) throws Exception
	{
		int a[]=new int[5];
		int sum=0;
		double avg=0.0;
		try{
			for(int i=0;i<args.length;i++)
			{
                   a[i]=Integer.parseInt(args[i]);
                   sum=sum+a[i];
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getClass());
		}
			System.out.println("sum is ="+sum);
			avg=sum/5;
			System.out.println("average is ="+avg);

		
	
	}
}