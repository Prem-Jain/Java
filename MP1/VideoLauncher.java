package MP1;

import java.util.*;

public class VideoLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opt = 0;
		Scanner sc = new Scanner(System.in);
		VideoStore vs = new VideoStore();
		while(opt != 6)
		{
			System.out.print("Main Menu\n======\n1.Add Video\n2.Check Out Video\n3.Return Video\n4.Receive Rating\n5.List Inventory\n6.Exit\nEnter your choice : ");
			opt = sc.nextInt();
			sc.nextLine();
			switch(opt)
			{
			case 1:
				System.out.print("Enter the name of the video you want to add : ");
				String name = sc.nextLine();
				vs.addVideo(name);
				break;
			case 2:
				System.out.print("Enter the name of the video you want to checkout : ");
				String name1 = sc.nextLine();
				vs.doCheckout(name1);
				break;
			case 3:
				System.out.print("Enter the name of the video you want to return : ");
				String name2 = sc.nextLine();
				vs.doReturn(name2);
				break;
			case 4:
				System.out.print("Enter the name f the video you want to rate : ");
				String name3 = sc.nextLine();
				System.out.print("Enter the rating of this video : ");
				int rating = sc.nextInt();
				vs.receiveRating(name3, rating);
				break;
			case 5:
				vs.listInventory();
				break;
			}
		}
		System.out.println("Exitig!!! Thank you for using this application.");
		sc.close();
	}

}
