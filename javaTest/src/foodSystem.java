import java.util.Scanner;
import java.util.ArrayList;

public class foodSystem {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<String> food = new ArrayList<String>();
		
		int op,y;
		String x;
		
		while(true) {
			System.out.println("Welcome! What you wann do?");
			System.out.println("1 - Add food to the list");
			System.out.println("2 - Remove food in the list");
			System.out.println("3 - See the list");
			System.out.println("4 - Exit");
			
			op = input.nextInt();
			
			if(op==1) {
				System.out.println("Type 4 food you want to add in the list: ");
				for(int i=0;i<4;i++) {
					x = input.next();
					food.add(x);
				}
			}
			if(op==2) {
				System.out.println("Type the food ID to remove: ");
				y = input.nextInt();
				food.remove(y);
			}
			if(op==3) {
				for(int i=0;i<food.size();i++) {
					System.out.println(food.get(i));
				}
			}
			if(op==4) {
				System.out.println("Goodbye!");
				break;
			}
		}
		input.close();
	}
}