package package1;
import java.io.File;

public class fileManipulation {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\adrie\\git\\javaTest\\javaTest\\src\\package1\\test_file.txt");
		
		if(file.exists()) {
			System.out.println("that file exists");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			file.delete();
		}
		
		else {
			System.out.println("that file doesnt exists");
		}
		
		
		
	}

}
