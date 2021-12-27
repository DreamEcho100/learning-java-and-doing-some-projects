import java.awt.*;
import java.awt.geom.QuadCurve2D;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		new MyFrame();
	}

}



class MyFrame extends JFrame{

	MyPanel panel;
	
	MyFrame(){
		panel = new MyPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setSize(750, 500);
		this.setVisible(true);
	} 
}

class MyPanel extends JPanel{
	
	MyPanel(){
		this.setPreferredSize(new Dimension(500,500));
	}
		
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;

		g2D.setPaint(new Color(121, 85, 72));
		g2D.fillRect(20, 300, 200, 200);
		g2D.setStroke(new BasicStroke(3));
		g2D.setPaint(Color.BLACK);
		g2D.drawRect(20, 300, 200, 200);

		g2D.setPaint(new Color(0, 188, 212));
		g2D.fillRect(150, 375, 50, 125);
		g2D.setStroke(new BasicStroke(3));
		g2D.setPaint(Color.BLACK);
		g2D.drawRect(150, 375, 50, 125);

		int[] WXPoints = {40, 40, 80, 120, 120, 80};
		int[] WYPoints = {400, 350, 325, 350, 400, 425};
		Polygon p = new Polygon();
        for (int i = 0; i < WXPoints.length; i++) {
            p.addPoint((WXPoints[i]), (WYPoints[i]));
        }
		g2D.setPaint(new Color(96, 125, 139));
		g2D.fillPolygon(p);
		g2D.setStroke(new BasicStroke(3));
		g2D.setPaint(Color.BLACK);
        g2D.drawPolygon(p);

		g2D.setPaint(Color.BLACK);
		g2D.setStroke(new BasicStroke(3));
		g2D.drawLine(80, 327, 80, 425);

		g2D.setPaint(Color.BLACK);
		g2D.setStroke(new BasicStroke(3));
		g2D.drawLine(40, 375, 120, 375);

		int[] HxPoints = {20, 120, 220};
		int[] HyPoints = {299, 185, 299};
		g2D.setPaint(Color.green);
		g2D.setPaint(new Color(139, 0, 0));
		g2D.fillPolygon(HxPoints, HyPoints, 3);
		g2D.setStroke(new BasicStroke(3));
		g2D.setPaint(Color.BLACK);
		g2D.drawPolygon(HxPoints, HyPoints, 3);

		g2D.setPaint(Color.white);
		g2D.fillArc(100, 225, 40, 40, 0, 360);
		g2D.setStroke(new BasicStroke(3));
		g2D.setPaint(Color.BLACK);
		g2D.drawArc(100, 225, 40, 40, 0, 360);

		QuadCurve2D q = new QuadCurve2D.Float();
		q.setCurve(120, 225, 105, 245, 120, 265);
		g2D.draw(q);

		int[] PXPoints = {250, 325, 350, 360, 385, 425, 500};//{40, 40, 80, 120, 120, 80};
		int[] PYPoints = {500, 425, 450, 435, 455, 425, 500};//{400, 350, 325, 350, 400, 425};
		Polygon plant = new Polygon();
        for (int i = 0; i < PXPoints.length; i++) {
            plant.addPoint((PXPoints[i]), (PYPoints[i]));
        }
		g2D.setPaint(new Color(76, 175, 80));
		g2D.fillPolygon(plant);
		g2D.setStroke(new BasicStroke(3));
		g2D.setPaint(Color.BLACK);
        g2D.drawPolygon(plant);
	}
}
