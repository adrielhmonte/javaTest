package package1;
import java.io.FileWriter;
import java.io.IOException;
public class fileWriter {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write(" The sun sets on the horizon \n Bringing a farewell to the light of day \n But the shining stars twinkle \n Guiding us through the cold night \n Until the sun rises again in all its glory.");
			writer.append("\n (ChatGPT generated)");
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
