/** 
* The purpose of this class is to model a television
* William Nicholas - 3/4/20
*/

public class Television
{
	// The brand name
	private String MANUFACTURER;
	
	// The size of the television screen
	private int SCREEN_SIZE;
	
	private boolean powerOn;
	private int channel;
	private int volume;
	
	/** 
	 * Getting the television set up in its default settings
	 */
	public Television(String MANUFACTURER, int SCREEN_SIZE)
	{
		this.MANUFACTURER = MANUFACTURER;
		this.SCREEN_SIZE = SCREEN_SIZE;
		powerOn = false;
		channel = 2;
		volume = 20;
	}
	
	/** 
	 * Getting the television set up in its default settings
	 */
	public Television(String MANUFACTURER, int SCREEN_SIZE, boolean powerOn, int channel, int volume)
	{
		this.MANUFACTURER = MANUFACTURER;
		this.SCREEN_SIZE = SCREEN_SIZE;
		this.powerOn = powerOn;
		this.channel = channel;
		this.volume = volume;
	}
	
	/** 
	 * Getting the television set up in its default settings
	 */
	public void setChannel(int station)
	{
		this.channel = station;
	}
	
	/** 
	 * Getting the television set up in its default settings
	 */
	public void power()
	{
		this.powerOn = !this.powerOn;
	}
	
	/** 
	 * Getting the television set up in its default settings
	 */
	public void increaseVolume()
	{
		this.volume = volume + 1;
	}

	/** 
	 * Getting the television set up in its default settings
	 */
	public void decreaseVolume()
	{
		this.volume = volume - 1;
	}
	
	/** 
	 * Getting the television set up in its default settings
	 */
	public int getChannel()
	{
		return channel;
	}

	/** 
	 * Getting the television set up in its default settings
	 */
	public int getVolume()
	{
		return volume;
	}
	
	/** 
	 * Getting the television set up in its default settings
	 */
	public String getManufacturer()
	{
		return MANUFACTURER;
	}
	
	/** 
	 * Getting the television set up in its default settings
	 */
	public int getScreenSize()
	{
		return SCREEN_SIZE;
	}
}
