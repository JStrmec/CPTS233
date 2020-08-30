package AssigmentCarpets;
import java.util.*;

public class clientCarpetClass {	
	public static void main(String [] args) {
		
		RoomCarpet rc = new RoomCarpet();
		RoomDimension rd = new RoomDimension();
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("What is the width of the room you are carpeting?");
			rd.width = input.nextDouble();
			System.out.println("What is the length of the room you are carpeting?");
			rd.length =input.nextDouble();
			System.out.println("What is the desired cost per square foor of carpet?");
			rc.CarpetCost = input.nextDouble();
		}
		
		Systen.out.println("The total cost of the carpet is" + )

	}

}
