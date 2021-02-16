package com.automobile.twowheeler;
public class Honda extends com.automobile.Vehicle
{
      public String modelName;
      public String registrationNumber;
      public String ownerName;
      public int speed;
      public Honda(String modelName,String registrationNumber,String ownerName,int speed)
      {
      	this.modelName=modelName;
      	this.registrationNumber=registrationNumber;
      	this.ownerName=ownerName;
      	this.speed=speed;
      }




	public String getModelName()
{
	return "The model name of Honda = "+modelName;
}
public String getRegistrationNumber()
{
        return "The registration number of Honda = "+registrationNumber;
}
public String getOwnerName()
{
	return "The Owner Name Honda= "+ownerName;
}
public int getSpeed()
{
	return(speed);
}
public void cdplayer()
{
	System.out.println("provides facility to control the cd player device which is available in the car ");
}
}