/**
 * CIS 2272
 * Homework week 3
 * this class creates and tests instances of the ticket class's children
 * @author Michael Kerr
 *
 */
public class BoxOfficeWeek3 {

	public static void main(String[] args) {
		
		//  creat a ticket object of each type and set date
		SportsTicket curling = new SportsTicket("Yetis vs The Ice Harpies",15.50,'C',14,8);
		curling.setDate(2019, 11,12);
		
		ConcertTicket whiteStripes = new ConcertTicket("White Stripes", 45.0,'L',35,"Rock");
		whiteStripes.setDate(2007, 7, 19);
		
		
		// tests the overridden printTicket and abstract getPromoCode methods
		curling.printTicket();
		System.out.println("PROMO CODE: "+curling.getPromoCode());
		System.out.println();
		whiteStripes.printTicket();
		System.out.println("PROMO CODE: "+whiteStripes.getPromoCode());
		

	}

}
