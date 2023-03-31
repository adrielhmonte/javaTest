public class Racing {
	
	public static void main(String[] args) {
		
		CarPoli car = new CarPoli();
		BicyclePoli bicycle = new BicyclePoli();
		Boat boat =  new Boat();
		
		VehiclePoli[] racers = {car,bicycle,boat};
		
		for(VehiclePoli x : racers) {
			x.go();
		}
		
	}
}