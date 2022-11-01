package DCCN;

import java.net.*;
import java.io.*;

public class Client {

	private Socket socket = null;
	private DataInputStream input = null;
	private DataOutputStream out = null;
	
	@SuppressWarnings("deprecation")
	public Client(String address, int port)
	{
		try
		{
			socket = new Socket(address, port);
			System.out.println("Connected");
			input = new DataInputStream(System.in);
			out = new DataOutputStream(socket.getOutputStream());
		}
		catch(Exception e) {};
		String line = "";
		while(!line.equals("Over"))
		{
			try
			{
				line = input.readLine();
				out.writeUTF(line);
			}
			catch(Exception e) {};
		}
		try
		{
			input.close();
			out.close();
			socket.close();
		}
		catch(Exception e) {};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client("127.0.0.1", 5000);
	}
}
