package AssigmentCarpets;
/** Jocelyn Strmec
 * Aug 30,2020
 * Assignment 1 Carpet Calculator
 */
import java.util.*;

public class clientCarpetClass {	
	double cost;
	public static void main(String [] args) {
		
		RoomCarpet rc = new RoomCarpet();
		RoomDimension rd = new RoomDimension();
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("What is the width of the room you are carpeting?");
			rd.width = input.nextDouble();
			System.out.println("What is the length of the room you are carpeting?");
			rd.length =input.nextDouble();
			System.out.println("What is the desired cost per square foor of carpet?");
			cost = input.nextDouble();
			rc.carpetCost = cost;
		}
		
		System.out.println("The total cost of the carpet is $" + rc.getTotalCost(cost,rd.getArea()));

	}

}
