import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VerifyModule extends JFrame {

	public VerifyModule() {
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setBackground(new java.awt.Color(204, 204, 255));
	    this.setSize(625, 625);
	    this.setLayout(null);
	    this.initComponents();
	    this.setVisible(true);
	}

	private void initComponents() {
		JPanel pMain = new JPanel();
		pMain.setLayout(new FlowLayout());
		pMain.setBounds(50, 50, 500, 500);
	    pMain.setBackground(Color.LIGHT_GRAY);
		
		JPanel pTop = new JPanel();
		pTop.setLayout(new FlowLayout());
		pTop.setPreferredSize(new Dimension(500, 60));
		pTop.setLayout(new FlowLayout());
	    pTop.setBackground(Color.LIGHT_GRAY);
		JLabel pTopLabel = new JLabel("Enter your code pin:");
		JTextField pTopPasswordField = new JPasswordField();
		pTopPasswordField.setPreferredSize(new Dimension(400, 40));
		pTopPasswordField.setFont(new Font("san-serif", Font.BOLD, 40));
		pTopPasswordField.setAlignmentY(CENTER_ALIGNMENT);
		
		pTop.add(pTopLabel);
		pTop.add(pTopPasswordField);
		
		
		JPanel pBottom = new JPanel();
		JPanel pBottomLeft = new JPanel();	    
	    JButton[] pBottomLeftBtns = {
	    		new JButton("1"), new JButton("2"), new JButton("3"),
	    		new JButton("4"), new JButton("5"), new JButton("6"),
	    		new JButton("7"), new JButton("8"), new JButton("9"),
	    		null, new JButton("0"), null
	    	};

	    JPanel pBottomRight = new JPanel();
	    JButton cancelBtn = new JButton("Cancel");
	    JButton enterBtn = new JButton("Enter");
	    JButton clearBtn = new JButton("Clear");

	    pBottom.setBackground(Color.DARK_GRAY);
	    pBottomLeft.setLayout(new GridLayout(4, 3, 1, 1));
	    pBottomLeft.setPreferredSize(new Dimension(180, 240));
	    pBottomLeft.setBackground(Color.LIGHT_GRAY);

	    JPanel pTemp;
		int i;
	    for (i = 0; i < pBottomLeftBtns.length; i++) {
	    	if (pBottomLeftBtns[i] != null) {
		    	pBottomLeftBtns[i].setSize(new Dimension(60, 60));
	    		pBottomLeft.add(pBottomLeftBtns[i]);
	    	} else {
	    		pTemp = new JPanel();
	    		pTemp.setBackground(Color.LIGHT_GRAY);
	    		pBottomLeft.add(pTemp);
	    	}
		}
	    
	    pBottom.add(pBottomLeft);

	    pBottomRight.setLayout(new GridLayout(4, 1, 1, 1));
	    pBottomRight.setBackground(Color.LIGHT_GRAY);
	    pBottomRight.setPreferredSize(new Dimension(100, 240));
	    
	    pBottomRight.add(cancelBtn);
	    pBottomRight.add(clearBtn);
	    pBottomRight.add(enterBtn);
	    
	    pBottom.add(pBottomRight);

	    pMain.add(pTop);
	    pMain.add(pBottom);
	    
	    this.add(pMain);
		
	}

}
