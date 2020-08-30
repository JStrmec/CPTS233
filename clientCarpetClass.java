package AssigmentCarpets;
import java.util.*;

public class clientCarpetClass {	
	double w,l;
	public static void main(String [] args) {
		
		RoomCarpet rc = new RoomCarpet();
		RoomDimension rd = new RoomDimension();
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("What is the width of the room you are carpeting?");
			w = input.nextDouble();
			rd.width = w;
			System.out.println("What is the length of the room you are carpeting?");
			l =input.nextDouble();
			rd.length = l;
			System.out.println("What is the desired cost per square foor of carpet?");
			rc.CarpetCost = input.nextDouble();
		}
		
		System.out.println("The total cost of the carpet is" + rc.getTotalCost);

	}

}
