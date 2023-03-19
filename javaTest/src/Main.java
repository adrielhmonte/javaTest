public class Main {
	
	public static void main(String[] args) {
		
		Human human = new Human("Rick", 65, 70);
		Human human2 = new Human("Adriel", 21, 63);
		
		System.out.println(human.name);
		System.out.println(human2.name);
		
		human.eat();
		human2.showAge();
		human.showAge();
	}
}