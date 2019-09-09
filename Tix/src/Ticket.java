/**
 * CIS 2272
 * Homework week 1
 * this class builds a ticket object to review many aspects of object classes
 * @author Michael Kerr
 *
 */


public class Ticket {
	
	private String eventName;
	private double ticPrice;
	private char seatRow;
	private int seatNum;
	
	
	public Ticket(String eventName, double ticPrice, char seatRow, int seatNum) {
		this.eventName = eventName;
		this.ticPrice = ticPrice;
		this.seatRow = seatRow;
		this.seatNum = seatNum;
	}



	public void printTicket() {
		System.out.println("*********");
		System.out.println("TICKET");
		System.out.println(eventName);
		System.out.printf("$%.02f\n",ticPrice);
		System.out.println("Seat "+seatRow+"-"+seatNum);
		System.out.println("*********\n");
	}
	
}
