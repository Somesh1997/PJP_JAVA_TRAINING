import java.util.Scanner;
class Author
{
	private String name;
	private String email;
	private char gender;
	Author(String name,String email,char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}

    public void setName(String name)
    {
	 this.name=name;
    }
	public String getName()
	{
		return name;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public String getEmail()
	{
		return email;
	}
	public void setGender(char gender)
	{
		this.gender=gender;
	}
	public char getGender()
	{
		return gender;
	}
	public String toString()
	{
		return " author name -->  "+name+"   ,author Email --->   "+email+"    ,auhtor gender --->   "+gender+"";
	}


}
public class Book
{

private String bookname;
private Author author;
private double price;
private int qtyInStock;
Book(String bookname,Author author,double price,int qtyInStock)
{
	this.bookname=bookname;
	this.author=author;
	this.price=price;
	this.qtyInStock=qtyInStock;
}
public void setBookName(String bookname)
{
	this.bookname=bookname;
}
 public String getBookName() {
      return bookname;
   }
   public void setAuthor(Author author)
   {
   	this.author=author;
   }
   public Author getAuthor() {
      return author;  // return member author, which is an instance of the class Author
   }
   public double getPrice() {
      return price;
   }
   public void setPrice(double price) {
      this.price = price;
   }
   public int getQty() {
      return qtyInStock;
   }
   public void setQty(int qtyInStock) {
      this.qtyInStock = qtyInStock;
   }
 
   // The toString() describes itself
   public String toString() {
      return "Bookname -->" + bookname +"   ,Bookprice -->"+price +"   ,BookQtyInStock -->" + qtyInStock + "      "+author;
   }
   public static void main(String[] args) {
   	

Author s=new Author("somesh gangwar","someh6g@gmail.com",'M');
//System.out.println(s);
Book b=new Book("The conjuring",s,10.3,2);
//System.out.println(b);
//b.setBookName("the titanic");
//System.out.println(b);
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Author Name:");
String n1=sc.nextLine();
s.setName(n1);
System.out.println("Enter the Author Email:");
String n2=sc.nextLine();
s.setEmail(n2);
System.out.println("Enter the gender of Author:");
char n3=(sc.nextLine()).charAt(0);
s.setGender(n3);
System.out.println("Enter the book Name:");
String n4=sc.nextLine();
b.setBookName(n4);
System.out.println("Enter the price of book :");
double n5=sc.nextDouble();
b.setPrice(n5);
System.out.println("Enter the quantity in stock : ");
int n6=sc.nextInt();
b.setQty(n6);
System.out.println(b);

   }
}




























