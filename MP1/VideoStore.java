package MP1;

import java.util.*;

public class VideoStore {
	ArrayList<Video> store = new ArrayList<>();
	
	void addVideo(String name)
	{
		store.add(new Video(name));
	}
	void doCheckout(String name)
	{
		for(int i = 0; i < store.size(); i++)
		{
			if(store.get(i).getName().equals(name))
				store.get(i).doCheckout();
		}
	}
	void doReturn(String name)
	{
		for(int i = 0; i < store.size(); i++)
		{
			if(store.get(i).getName().equals(name))
				store.get(i).doReturn();
		}
	}
	void receiveRating(String name, int rating)
	{
		for(int i = 0; i < store.size(); i++)
		{
			if(store.get(i).getName().equals(name))
				store.get(i).receiveRating(rating);
		}
	}
	void listInventory()
	{
		System.out.println("---------------------------------------");
		System.out.printf("%10s | %10s | %10s\n", "Video Name", "Checkout", "Ratings");
		for(int i = 0; i < store.size(); i++)
		{
			System.out.printf("%10s | %10s | %10s\n", store.get(i).getName(), store.get(i).getCheckout(), store.get(i).getRating());
		}
		System.out.println("---------------------------------------");
	}
}
