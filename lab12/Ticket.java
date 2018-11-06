package Lab12;

public class Ticket
{
	private static int numTicketsSold = 0; // shared
	public static int getNumberSold() 
	{ 
		return numTicketsSold; 
	}
	
	private int ticketNum; // one per object
	
	public Ticket()
	{
		numTicketsSold++;
		ticketNum = numTicketsSold;
	}
	
	public String getInfo()
	{
		return "ticket # " + ticketNum + "; " + numTicketsSold + " ticket(s) sold.";
	}
	
	public int getTicketNumber() 
	{ 
		return ticketNum; 
	}
}
