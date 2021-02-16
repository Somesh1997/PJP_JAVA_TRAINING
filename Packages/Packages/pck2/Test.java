import com.automobile.twowheeler.Hero;
import com.automobile.Honda;
import com.automobile.FourWheeler.Logan;
import com.automobile.FourWheeler.Ford;
import java.util.Scanner;
//import java.lang.System;
public class Test
{
public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Model Name of Hero : ");
	  String modHero=sc.next();
     // System.out.println();
      System.out.println("Enter the Registration Number of Hero : ");
      String regHero=sc.next();
     // System.out.println();
      System.out.println("Enter the Owner name : ");
      String ownnameHero=sc.next();
      System.out.println();
      System.out.println("Enter the speed : ");
      int speedHero=sc.nextInt();
      System.out.println();
      System.out.println("Enter the model Name of Honda : ");
      String modHonda=sc.next();
      System.out.println("Enter the Registration Number of Honda : ");
      String regHonda=sc.next();
      System.out.println("Enter the Owner Name : ");
      String ownnameHonda=sc.next();
      System.out.println("Enter the Speed of Honda : ");
      int speedHonda=sc.nextInt();
      System.out.println("Now Work's Upon Logan : ");
      System.out.println("Enter the ModelName  of Logan's : ");
      String modLogan=sc.next();
      System.out.println("Enter the RegistrationNumber of Logan : ");
      String regLogan=sc.next();
      System.out.println("Enter the Owner namme of Logan : ");
      String ownLogan=sc.next();
      System.out.println("Enter the speed of Logan : ");
      int speedLogan=sc.nextInt();
      System.out.println("Enter the position of Logan for Setting GPS :  ");
      int pos=sc.nextInt();
      System.out.println("Now work's upon Ford : ");
      out.println("Enter the ModelName of Ford : ")
      String modFord=sc.next();
      System.out.println("Enter the Registration number of Ford  : ");
      String regFord=sc.next();
      System.out.println("Enter the Owner name of Ford : ");
      String ownFord=sc.next();
      System.out.println("Enter the speed of Ford : ");
      int speedFord=sc.nextInt();
      System.out.println("Enter the condition of polution control device : ");
      int control=sc.nextInt();
	Hero hero=new Hero(modHero,regHero,ownnameHero,speedHero);
	System.out.println(hero.getModelName());
	System.out.println(hero.getOwnerName());
	System.out.println(hero.getRegistrationNumber());
	System.out.println("Speed is "+hero.getSpeed());
	hero.radio();
	Honda honda = new Honda(modHonda,regHonda,ownnameHonda,speedHonda);
	System.out.println(honda.getModelName());
    System.out.println(honda.getOwnerName());
	System.out.println(honda.getRegistrationNumber());
	System.out.println("speed is "+honda.getSpeed());
	honda.cdplayer();
	Logan logan = new Logan(modLogan,regLogan,ownLogan,speedLogan,pos);
	System.out.println(logan.getOwnerName());
	System.out.println(logan.getModelName());
	System.out.println(logan.getRegistrationNumber());
	System.out.println("Speed is "+logan.Speed());
	System.out.println("The position of GPS is "+logan.gps());



}
}