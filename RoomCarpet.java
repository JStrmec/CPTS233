package AssigmentCarpets;

public class RoomCarpet {
	public double area;
	public double costpersquareft;
	
	public void Carpet() {
		RoomDimension Obj = new RoomDimension();
		area = Obj.getArea();
	}
	public double getTotalCost(double cost,double area) {
		double totalCost=cost*area;
		return totalCost;
	}


}
