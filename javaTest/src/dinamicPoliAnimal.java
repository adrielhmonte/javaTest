import java.util.Scanner;
public class dinamicPoliAnimal {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Animal animal;
		
		
		System.out.println("What aniaml do you want?");
		System.out.println("1 - Dog or 2 - Cat");
		int choice = input.nextInt();
		
		if (choice==1) {
			animal = new Dog();
			animal.speak();
		}
		else if(choice==2) {
			animal = new Cat();
			animal.speak();
		}
		else {
			animal = new Animal();
			System.out.println("That choice was invalid");
			animal.speak();
		}
		
	}
}
