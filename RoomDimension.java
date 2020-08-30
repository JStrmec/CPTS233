package AssigmentCarpets;

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
