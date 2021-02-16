class VideoStore extends Video
{
	private Video[] store;
	public void addVideo(String name) 
	{
		Video video = new Video(name);
		int storeSize;
                //System.out.println(store[0]);
		if(store != null) 
			storeSize=store.length;
		else 
			storeSize=0;
		store = new Video[storeSize + 1];
		store[storeSize] = video;
	}
	public void doCheckout(String name) 
	{
		if (store == null || store.length == 0) 
		{
			System.out.println("Store is empty");
			return;
		}
		
		for (Video video : store) 
		{
			if (video.getName().equals(name))
			{
				video.doCheckout();
			}
		}
	}
	
	public void doReturn(String name) 
	{
		if (store == null || store.length == 0) 
		{
			System.out.println("Store is empty");
			return;
		}
		
		for (Video video : store)
		{
			if (video.getName().equals(name)) 
			{
				video.doReturn();
			}
		}
	}
	
	public void receiveRating(String name, int rating) 
	{
		if (store == null || store.length == 0) 
		{
			System.out.println("Store is empty");
			return;
		}
		
		for (Video video : store) 
		{
			if (video.getName().equals(name)) 
			{
				video.receiveRating(rating);
			}
		}
	}
	
	public void listInventory() 
	{
		if (store == null || store.length == 0) 
		{
			System.out.println("Store is empty");
			return;
		}
		
		for (int i = 0; i < 80; i++) 
			System.out.print("-");
		System.out.printf("\n\t%-20s\t|\t%-10s\t|\t%-15s\n", "Name", "Rating", "Checkout");
		for (int i = 0; i < 80; i++) 
			System.out.print("-");
		for (int i=0;i<store.length;i++)
		{
			System.out.printf("\n\t%-20s\t|\t%-10s\t|\t%-15s\n", store[i].getName(), store[i].getRating(), store[i].getCheckout());
		}
		for (int i = 0; i < 80; i++) 
			System.out.print("-");
	}
}