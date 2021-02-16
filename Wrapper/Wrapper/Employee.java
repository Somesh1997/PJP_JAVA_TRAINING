class Employee implements Cloneable
{
	int a=10;
	int b=20;
	public static void main(String[] args) throws CloneNotSupportedException{
		Employee s=new Employee();
		Employee s1=(Employee)s.clone();
		System.out.println("Original Object "+s.a+" "+s.b);
		s1.a=35;
		s1.b=40;
		System.out.println("Clone Object "+s1.a+" "+s1.b);
	

	}
}