/** 
*The purpose of this class is to model a television
*Thao Nguyen and 2/24/2020
*/
public class Television {
		//Instance Fields//
	
	private String MANUFACTURER; //brand name
	private int SCREEN_SIZE; //size of TV screen
	private boolean powerOn; //true if the power is on and false when off
	private int channel; //value of station
	private int volume; //loudness
		//Constructor//	
	
	public Television(String brand, int size) 
	{
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
	}
	public void power()
	{   
		volume = 20; 
		channel = 2;
		powerOn = !powerOn;
	}
		//Mutator//
	
	public void setChannel(int station) //value stored in channel field
	{
		channel = station;
	}
	public void increaseVolume( ) //increase the volume by 1
	{
		 volume+=1;
	}
	public void decreaseVolume() //decrease the volume by 1
	{
		 volume-=1;
	}
	public int getChannel() //return channel
	{
		return channel;
	}
	public int getVolume() //return volume
	{
		return volume;
	}
	public String getManufacturer() //return manufacturer
	{
		return MANUFACTURER;
	}
	public int getScreenSize() //return screenSize
	{
		return SCREEN_SIZE;
	}
}

