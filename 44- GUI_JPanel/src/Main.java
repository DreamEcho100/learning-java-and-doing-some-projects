import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	
	public static void addPanelToFrame(JFrame frame, JPanel[] panels) {
		for (JPanel panel : panels) {
			frame.add(panel);
		}
	}
	
	public static void main(String[] args) {
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);
		redPanel.setLayout(new BorderLayout());
		
		JLabel label1 = new JLabel("Hi There!");
		label1.setVerticalAlignment(JLabel.BOTTOM);
		label1.setHorizontalAlignment(JLabel.RIGHT);
		
		redPanel.add(label1);

		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);

		JPanel[] panels = { redPanel, bluePanel, greenPanel };
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750, 750);
		frame.setVisible(true);
		// frame.add(redPanel);
		addPanelToFrame(frame, panels);

	}

}
