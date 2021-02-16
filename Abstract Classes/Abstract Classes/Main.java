abstract class GeneralBank
{

	public abstract double getFixedDepositInterestRate();
	public abstract double getSavingsInterestRate();
} 
class ICICIBank extends GeneralBank
{
	 public double getSavingsInterestRate()
	 {
            return 4;
	 }
	 public double getFixedDepositInterestRate()
	 {
	 	return 8.5;
	 }

}
class KotMBank extends GeneralBank
{
	public double getFixedDepositInterestRate()
	{
		return 9;
	}
	public double getSavingsInterestRate()
	{
		return 6;
	}
}
public class Main
{
	public static void main(String[] args) {
		ICICIBank i=new ICICIBank();
		KotMBank k=new KotMBank();
		GeneralBank g=new KotMBank();
		GeneralBank m=new ICICIBank();
		double a=i.getSavingsInterestRate();
		double b=i.getFixedDepositInterestRate();
		double c=k.getFixedDepositInterestRate();
		double d=k.getSavingsInterestRate();
		double e=g.getSavingsInterestRate();
		double f=g.getFixedDepositInterestRate();
		double h=m.getSavingsInterestRate();
		double v=m.getFixedDepositInterestRate();
		System.out.println("Saving Interest of ICICIBank = "+a+"%  , "+h+"%");
		System.out.println("Fixed Deposit Interest of ICICIBank = "+b+"%  ,  "+v+"%");
		System.out.println("Saving Interest of KotMBank = "+d+"%   ,  "+e+"%");
		System.out.println("Fixed Deposit Interest of KotMBank = "+c+"%    ,   "+f+"%");


	}
}