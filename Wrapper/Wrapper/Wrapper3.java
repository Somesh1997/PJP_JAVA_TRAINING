class Wrapper3
{
	public static void main(String[] args) {
		Integer a=Integer.parseInt(args[0]);
		String m=Integer.toBinaryString(a);
		int k=Integer.parseInt(m);
		String p=String.format("%08d",k);
		System.out.println(p);
	}
}