/**
 * CIS 2272
 * Homework week 1
 * this is a runner class for printing ticket objects
 * @author Michael Kerr
 *
 */


public class TicketSeller {

	public static void main(String[] args) {
		for(int x=1;x<=20;x++) {
			Ticket baseballGame = new Ticket("Red Sox vs. Yankees", 120.00, 'B',(x*2));
			baseballGame.printTicket();
		}

	}

}
