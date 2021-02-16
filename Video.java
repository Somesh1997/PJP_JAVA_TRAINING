class Video
{
	private String videoName;
	private boolean checkout;
	private int rating;
	Video()
	{}
	
	public Video(String name)
	{
		videoName=name;
	}
	String getName()
	{
		return this.videoName;
	}
	void doCheckout()
	{
		checkout=true;
	}
	void doReturn()
	{
		checkout=false;	
	}
	void receiveRating(int rating)
	{
		this.rating=rating;
	}
	int getRating()
	{
		return this.rating;
	}
	boolean getCheckout()
	{
		return this.checkout;
	}
}