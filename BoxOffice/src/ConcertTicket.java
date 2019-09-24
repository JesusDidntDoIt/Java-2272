/**
 * CIS 2272
 * Homework week 3
 * this class extends the ticket class and overrides an abstract method from the super class
 * @author Michael Kerr
 *
 */
public class ConcertTicket extends Ticket {
	
	// declare field variable
	private String genre;

	// constructor method
	public ConcertTicket(String eventName, double price, char row, int seatNumber, String genre) {
		super(eventName, price, row, seatNumber);
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}
	
	// this method overrides the super method and prints the ticket to the console
	public void printTicket() {
	    System.out.println("*********");
	    System.out.println(genre+" Concert Series");
	    super.printTicket();
	}
	
	// this method overrides the abstract method in the super class
	public String getPromoCode() {
		String code = this.eventName.substring(0,4);
		return (code.toUpperCase()+this.month);
	}
}
