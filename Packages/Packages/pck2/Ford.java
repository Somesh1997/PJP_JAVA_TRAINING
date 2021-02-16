package com.automobile.FourWheeler;
public class Ford extends com.automobile.Vehicle
{
	        public String modelName;
	        public String registrationNumber;
	        public String ownerName;
	        public int speed;
	        public int temp;
             public Ford(String modelName,String registrationNumber,String ownerName,int speed,int temp)
             {
             	this.modelName=modelName;
             	this.registrationNumber=registrationNumber;
             	this.ownerName=ownerName;
             	this.speed=speed;
             }


public String getModelName()
   {
	return "The model name of Ford = "+modelName;
   }
public String getRegistrationNumber()
      {
        return "The registration number of Ford = "+registrationNumber;
      }
public String getOwnerName()
     {
	return "The Owner Name of Ford = "+ownerName;
     }
public int Speed()
      {
	return(speed);
      }
public int tempControl()
         {
         return(temp); 
         }
}