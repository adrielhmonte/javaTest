import java.util.Scanner;

public class hypotenuse{
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double x,y,z;
		
		System.out.println("Type the firt side: ");
		x = input.nextDouble();
		System.out.println("Type the second side: ");
		y = input.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("The hypostenuse is: "+z);
		input.close();
	}
}