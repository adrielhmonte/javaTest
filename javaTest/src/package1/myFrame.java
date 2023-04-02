package package1;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class myFrame extends JFrame{
	
	myFrame(){
		
		this.setTitle("Cool Title"); // sets the window title
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit the application
		this.setSize(420,420); //sets the dimension of frame
		this.setResizable(false); //prevents from being resized
		this.setVisible(true); //make the frame visible
		
		ImageIcon image = new ImageIcon("logo.png");
		this.setIconImage(image.getImage()); //sets the icon of the windows
		this.getContentPane().setBackground(new Color(255,255,32)); // change the background color
		//this.getContentPane().setBackground(new Color(0xFFFFFF)); hexadecimal colors
		
	}

}
