import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
public class LineArtLab extends JPanel{
	
	// Practice using Loops, random #s and
	// methods
	public void paint(Graphics g) {
		
		
		
		
		for(int i = 0; i < 3; i++) {
		
		}
		
		
		
		//1) draw a concentric rectangle that's 10pixels from all sides of the "gray"
		//portion of the GUI
		
		g.drawRect(10, 10, 870, 540);
		
		
		//starting and ending point variables
		//top left
		int x1 = 10, y1 = 10;
		int x2 = 10, y2 = 555;
		
		for (int var = 0; var < 90; var++) {
			
			g.drawLine(x1, y1, x2, y2);
			
			x1+=10;
			y2-=6;			
		
		}
		
		//top right
		int x3 = 900, y3 = 10;
		int x4 = 900, y4 = 555;
		
		for (int num = 0; num < 90; num++) {
			
			g.drawLine(x3, y3, x4, y4);
			
			x3-=10;
			y4-=6;
		}
		
		//bottom right
		int x5 = 10, y5 = 550;
		int x6 = 900, y6 = 555;
		
		for (int num = 0; num < 90; num++) {
			
			g.drawLine(x5, y5, x6, y6);
			
			x5+=10;
			y6-=6;
		}
		
		
		//bottom left
		int x7 = 10, y7 = 10;
		int x8 = 10, y8 = 550;
		
		for (int num = 0; num < 90; num++) {
			
			g.drawLine(x7, y7, x8, y8);
			
			x8+=10;
			y7+=6;
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] arg) {
		LineArtLab m = new LineArtLab();
	}
	
	public LineArtLab() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);
		
	}
}


