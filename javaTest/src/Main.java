public class Main {
	
	public static void main(String[] args) {
		
		CarEnc car = new CarEnc("Volkswagen","Gol bolinha",2009);
		CarEnc car2 = new CarEnc("Volkswagen","Fusca",1967);
		
		car2.copy(car);
		
		System.out.println(car2);
	}
}