import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LaunchPage implements ActionListener {

	JFrame frame = new JFrame();
	JButton button = new JButton("Open an new window!");
	
	public LaunchPage() {
		
		button.setBounds(100, 160, 200, 40);
		button.addActionListener(this);
		
		frame.add(button);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == button) {
			frame.dispose();
			NewWindow myWindow = new NewWindow();
		}
	}
	

}
