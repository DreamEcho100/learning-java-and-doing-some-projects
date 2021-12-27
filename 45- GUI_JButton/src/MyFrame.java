// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame /* implements ActionListener*/ {
	JButton button;
	JLabel label;
	
	MyFrame() {
		button = new JButton("Click :P");
		button.setBounds(125, 100, 250, 100);
		// button.addActionListener(this);
		button.addActionListener(e -> {
			System.out.println("BLAH BLAH BLAH");
			label.setVisible(true);
			button.setEnabled(false);
		});
		// button.setText("I 'm a button1");
		button.setFocusable(false);
		button.setFont(new Font("Comic Sans", Font.BOLD + Font.ITALIC, 25));
		button.setForeground(Color.cyan);
		button.setBackground(Color.DARK_GRAY);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		label = new JLabel("Hmm, I see.");
		label.setBounds(175, 150, 150, 150);
		label.setFont(new Font("Comic Sans", Font.BOLD, 25));
		label.setForeground(Color.ORANGE);
		label.setVisible(false);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);

		this.add(button);
		this.add(label);
	}

	/*
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == button) {
			System.out.println("BLAH BLAH BLAH");
			button.setEnabled(false);
			label.setVisible(true);
		}
	}
	*/
}
