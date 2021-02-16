
package com.automobile.twowheeler;
import com.automobile.Vehicle;

public class Hero extends com.automobile.Vehicle
{
	public String modelName;
	public String registrationNumber;
	public String ownerName;
	public int speed;
	public Hero(String modelName,String registrationNumber,String ownerName,int speed)
	{
		this.modelName=modelName;
		this.registrationNumber=registrationNumber;
		this.ownerName=ownerName;
		this.speed=speed;
	}
public String getModelName()
{
	return "The model name of Hero  = "+modelName;
}
public String getRegistrationNumber()
{
        return "The registration number of Honda = "+registrationNumber;
}
public String getOwnerName()
{
	return "The Owner Name = "+ownerName;
}
public int getSpeed()
{
	return(speed);
}
public void radio()
{
	System.out.println("provides facility to control the radio device ");
}
}