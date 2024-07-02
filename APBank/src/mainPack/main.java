package mainPack;
import java.util.ArrayList;

import components.Client;

public class main 
{
	private static ArrayList<Client> clients;
	
	public static void main(String[] args)
	{
		clients = loadClients();
		displayClients();
	}
	
	public static void displayClients()
	{
		for(Client client : clients)
		{
			System.out.println(client);
		}
	}
	
	public static ArrayList<Client> loadClients()
	{
		ArrayList<Client> clients = new ArrayList<>();
		
		clients.add(new Client("Audran", "Puechmaille"));
		clients.add(new Client("Jon", "Pif"));
		clients.add(new Client("Claire", "Marshall"));
		clients.add(new Client("Pierre", "Dumas"));
		
		return clients;
	}
}
