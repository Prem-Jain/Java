package DCCN;

import java.io.*;
import java.net.*;

public class Server {

	private Socket socket = null;
	private DataInputStream in = null;
	private ServerSocket server = null;

	public Server(int port)
	{
		try
		{
			server = new ServerSocket(port);
			System.out.println("Server Started");
			System.out.println("Waiting for a client...");
			socket = server.accept();
			System.out.println("Client accepted");
			in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			String line = "";
			while(!line.equals("Over"))
			{
				try
				{
					line = in.readUTF();
					System.out.println(line);
				}
				catch(Exception e) {};
			}
			System.out.println("Closing Connection");
			in.close();
			socket.close();
		}
		catch(Exception e) {};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server = new Server(5000);
	}
}
