/**
 * CIS 2272
 * Homework week 3
 * this is an abstract object class for a ticket object
 * @author Michael Kerr
 *
 */
public abstract class Ticket {
	
	// declare field variables
	protected String eventName;
	protected double price;
	protected char row;
	protected int seatNumber;
	protected int year;
	protected int month;
	protected int day;

	// constructor method
	public Ticket(String eventName, double price, char row, int seatNumber) {
		this.eventName = eventName;
		this.price = price;
		this.row = row;
		this.seatNumber = seatNumber;
	}
	
	// getter and setter
	public void setDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public String getDate() {
		return (month+"/"+day+"/"+year);
	}
	
	// this method prints the ticket to the console
	public void printTicket() {

		System.out.println("*********");
		System.out.println("TICKET");
		System.out.println(eventName);
		System.out.println(month+"/"+day+"/"+year);
		System.out.printf("$%.02f\n",price);
		System.out.println("Seat " + row + "-" + seatNumber);
		System.out.println("*********");
	}
	
	// abstract method that must be coded in the subclass
	public abstract String getPromoCode();

}