import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
// import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		
		// ImageIcon image = new ImageIcon("dude.png");

		Border border = BorderFactory.createLineBorder(Color.green, 3);
		
		JLabel label = new JLabel();
		label.setText("Bro, do you even code?");
		// label.setIcon(image);
		// label.setHorizontalTextPosition(JLabel.CENTER); //set text TOP,CENTER, BOTTOM of ImageIcon
		// label.setVerticalTextPosition(JLabel.TOP); //set text TOP,CENTER, BOTTOM of ImageIcon
		label.setForeground(new Color(0x00FF00));
		label.setFont(new Font("MV Boli", Font.PLAIN, 100));
		// label.setIconTextGap(-25); //set gap of text to image
		label.setBackground(Color.black);
		label.setOpaque(true);
		//label.setBorder(border); //sets border of label (not image+text)
		label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within labe
		label.setBorder(border);
		// 	//label.setBounds(100, 100, 250, 250); //set x,y position within frame as well as dimensions
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(500,500);
		//frame.setLayout(null);

		frame.setVisible(true);
		frame.add(label);
		frame.pack();
	}

}
