package com.automobile.FourWheeler;
public class Logan extends com.automobile.Vehicle
{
	        public String modelName;
	        public String registrationNumber;
	        public String ownerName;
	        public int speed;
	        public int position;
	        public Logan(String modelName,String registrationNumber,String ownerName,int speed,int position)
	{
		this.modelName=modelName;
		this.registrationNumber=registrationNumber;
		this.ownerName=ownerName;
		this.speed=speed;
		this.position=position;
	}





	public String getModelName()
{
	return "The model name of Logan = "+modelName;
}
public String getRegistrationNumber()
{
        return "The registration number of Logan = "+registrationNumber;
}
public String getOwnerName()
{
	return "The Owner Name Logan= "+ownerName;
}
public int Speed()
{
	return(speed);
}
public int gps()
{
	return(position);
}
}