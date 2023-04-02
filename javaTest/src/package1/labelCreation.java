package package1;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class labelCreation {

	public static void main(String[] args) {
		
		ImageIcon image = new ImageIcon("vasco.png");
		Border border = BorderFactory.createLineBorder(Color.red,3);
		
		JLabel label = new JLabel(); // create a label
		label.setText("Vasco, the mount giant"); //set text of label
		label.setIcon(image); //puts the image in a label
		label.setHorizontalTextPosition(JLabel.CENTER); //set the text position horizontally
		label.setVerticalTextPosition(JLabel.TOP); //set the text position vertically
		label.setForeground(Color.red); // set the color of font
		label.setFont(new Font("MV Boli", Font.ITALIC,20)); // sets the style of font
		label.setIconTextGap(25); // how far the text is from image
		label.setBackground(Color.black); // change the background color
		label.setOpaque(true); // display the color
		label.setBorder(border); // set the border created
		label.setVerticalAlignment(JLabel.CENTER); //sets the image position
		label.setHorizontalAlignment(JLabel.CENTER); // position vertically
		//label.setBounds(100,100,500,500);
		
		JFrame frame = new JFrame(); // create the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the frame
		//frame.setSize(500,500); // set the size of frame
		//frame.setLayout(null);
		frame.setVisible(true); // turn the frame visible
		frame.add(label);
		frame.pack();
		
	}

}
