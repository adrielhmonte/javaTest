import java.util.InputMismatchException;
import java.util.Scanner;
public class exceotionHandling {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		try {
			int x,y,z;
		
			System.out.println("Type the first number: ");
			x = input.nextInt();
			System.out.println("Type the second number: ");
			y = input.nextInt();
			z = x/y;
			System.out.println(z);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by 0");
		}
		catch (InputMismatchException e) {
			System.out.println("You have to type a number");
		}
		catch (Exception e) {
			System.out.println("Something went wrong");
		}
		finally{
			input.close();
		}
	}
}
