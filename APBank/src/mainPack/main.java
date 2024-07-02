package mainPack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import components.Client;


public class main 
{
	private static List<Client> clients;
	 
	public static void main(String[] args)
	{
		clients = loadClients(3);
		displayClients(clients);
	}
	
	// Méthode qui génère le nombre d'objets clients-test passé en paramètre de la méthode. 
	
	public static List<Client> loadClients(int numberOfClients)
	{
		List<Client> clients = new ArrayList<>();
		
		for(int i = 1; i <= numberOfClients; i++)
		{
			clients.add(new Client("Firstname" + i, "Name" + i));
		}
		
		return clients;
	}
	
	// Méthode qui affiche les données de l'ArrayList contenant les clients.
	
	public static void displayClients(List<Client> clients)
	{
		String clientsString = clients.stream()
				.map(Client::toString)
				.collect(Collectors.joining("\n"));
		
		System.out.println(clientsString);
	}
	
	
	
	
}
