/**
 * CIS 2272
 * Homework week 3
 * this class extends the ticket class and overrides an abstract method from the super class
 * @author Michael Kerr
 *
 */

public class SportsTicket extends Ticket {
	
	// declare field variable
	private int gameNumber;
	
	// constructor method
	public SportsTicket(String eventName, double price, char row, int seatNumber, int gameNumber) {
		super(eventName, price, row, seatNumber);
		this.gameNumber = gameNumber;
	}

	public int getGameNumber() {
		return gameNumber;
	}
	
	// this method overrides the super method and prints the ticket to the console
	public void printTicket() {
	    System.out.println("*********");
	    System.out.println("Game #"+ gameNumber);
	    super.printTicket();
	}
	
	// this method overrides the abstract method in the super class
	public String getPromoCode() {
		String code = this.eventName.toUpperCase();
		int i = code.indexOf(" VS ");
		code = code.substring(0,i);
		return (code+this.day);
	}
}
