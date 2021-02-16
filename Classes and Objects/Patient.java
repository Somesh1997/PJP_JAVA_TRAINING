import java.util.Scanner;
class Patient
{
	public static String patientName;
    public static double height;
	public static double weight;
	public Patient(String patientName,double height,double weight)
	{
		this.patientName=patientName;
		this.height=height;
		this.weight=weight;

	}
	public static double BMI;
	public static double computeBMI()
	{
		BMI=weight/(height*height);
		return(BMI);
			
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("Enter the name of Patient");
		String p=s.nextLine();
		System.out.println("Enter the height");
		int k=s.nextInt();
		System.out.println("Enter the weight");
		int m=s.nextInt();
		Patient patient=new Patient(p,k,m);
		double q=computeBMI();
		System.out.println(p+"  The BMI is "+q);	


			}
}