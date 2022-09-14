package secondquestion;

public class Ticket {

	private int ticketid;
	private int price;
	private static int availableTickets;
	
	
	public int getTicketid() {
		return ticketid;
	}


	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public static int getAvailableTickets() {
		return availableTickets;
	}


	public static void setAvailableTickets(int availableTickets) {
		Ticket.availableTickets = availableTickets;
	}
	
	public int calculateTicketCost(int noOfTickets)
	{
		int cost;
		if(noOfTickets<availableTickets) {
			cost = noOfTickets*price;
			availableTickets = availableTickets-noOfTickets;
			return cost;
		}
		else 
			return -1;
	}


	public Ticket(int ticketid, int price) {
		super();
		this.ticketid = ticketid;
		this.price = price;
	}
}
