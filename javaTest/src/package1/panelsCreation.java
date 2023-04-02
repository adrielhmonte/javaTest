package package1;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class panelsCreation {

	public static void main(String[] args) {
		
		ImageIcon image = new ImageIcon("nerdgif.gif");
		
		JLabel label = new JLabel();
		label.setText("Hello");
		label.setIcon(image);
		label.setVerticalAlignment(JLabel.TOP);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0,0,250,250);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250,0,250,250);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0,250,500,250);
		greenPanel.add(label);
		greenPanel.setLayout(new BorderLayout());
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(700,700);
		frame.setVisible(true);
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);

	}

}
