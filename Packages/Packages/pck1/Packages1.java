import test.Foundation;
class Packages1{




public static void main(String[] args) {
Foundation f=new Foundation();
System.out.println(f.var4);	//print the output("No error")
//System.out.println(f.var3);(can't accessible because var3 is in protected modifier )
//System.out.println(f.var1);(can't accessible outside of same class);
//System.out.println(f.var2);(can't accessible outside of package );
}
}