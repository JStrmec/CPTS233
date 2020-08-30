package AssigmentCarpets;

/** Jocelyn Strmec
 * Aug 30,2020
 * Assignment 1 Carpet Calculator
 * CPTS 233: MicroAssignment 1
 * Github URL: https://github.com/Strmec01/CPTS233.git
 **/

public class RoomDimension {
	public double width;
	public double length;
	private double area;
	
	public void RoomDimension(final double len,final double wid) {
		double dimension = len * wid;
		area = dimension;
		
	}
	
	public double getArea() {
		RoomDimension(width,length);
	   return area;
	}

	@Override
	public String toString() {
		return "RoomDimension [width=" + width + ", length=" + length + ", area=" + area + "]";
	}
	
}
