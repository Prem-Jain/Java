import java.util.concurrent.*;
public class SleepingBarber extends Thread
{
	public static Semaphore customers = new Semaphore(0);
	public static Semaphore barber = new Semaphore(0);
	public static Semaphore accessSeats = new Semaphore(1);
	public static final int chairs = 5;
	public static int freeSeats = chairs;
	class Customer extends Thread
	{
		int id;
		boolean notCut = true;
		public Customer(int i)
		{
			id = i;
		}
		public void run()
		{
			while(notCut)
			{
				try
				{
					accessSeats.acquire();
					if(freeSeats > 0)
					{
						System.out.println("Customer " + this.id + " just sat down");
						freeSeats--;
						customers.release();
						accessSeats.release();
						try
						{
							barber.acquire();
							notCut = false;
							this.get_haircut();
						}
						catch(InterruptedException ex) {}
					}
					else
					{
						System.out.println("There are no free seats. Customer " + this.id + " has left the barbersop");
						accessSeats.release();
						notCut = false;
					}
				}
				catch(InterruptedException ex) {}
			}
		}
		public void get_haircut()
		{
			System.out.println("Customer " + this.id + " is getting his hair cut");
			try
			{
				sleep(5050);
			}
			catch(InterruptedException ex) {}
		}
	}
	class Barber extends Thread
	{
		public void run()
		{
			while(true)
			{
				try
				{
					customers.acquire();
					accessSeats.release();
					freeSeats++;
					barber.release();
					accessSeats.release();
					this.cutHair();
				}
				catch(InterruptedException ex) {}
			}
		}
		public void cutHair()
		{
			System.out.println("The barber is cutting hair");
			try
			{
				sleep(5000);
			}
			catch(InterruptedException ex) {}
		}
	}
	public static void main(String args[])
	{
		SleepingBarber barberShop = new SleepingBarber();
		barberShop.start();
	}
	public void run()
	{
		Barber giovanni = new Barber();
		giovanni.start();
		for(int i = 0; i < 16; i++)
		{
			Customer cust = new Customer(i);
			cust.start();
			try
			{
				sleep(2000);
			}
			catch(InterruptedException ex) {}
		}
	}
}
	
