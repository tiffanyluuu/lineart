import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
public class LineArtLab extends JPanel{
	
	// Practice using Loops, random #s and
	// methods
	public void paint(Graphics g) {
		
		
		
		//initializing the size, amount of lines
		int n = 59;
		int xC = 15;
		int xY = 10;
		
		//initializing coordinates
		int x1 = 10, y1 = 600; 
		int x2 = 10, y2 = 10;
	
		for(int l = 0; l <= 3; l++) {
				
			
			//inner shape
			if(l == 1) {
				
				 x1 = 220; 	
				 y1 = 460;
				 x2 = 220;
				 y2 = 150;
				
				n = 52;
				xC = 9;
				xY = 6;
 
				
					
			} 
			
				//1) draw a concentric rectangle that's 10pixels from all sides of the "gray"
				//portion of the GUI
				
				//g.drawRect(10, 10, 870, 540);
				
				
				//starting and ending point variables
			
				
				for (int num = 0; num < n; num++) {
					
					g.drawLine(x1, y1, x2, y2);
					
					x2+=xC;
					y1-=xY;			
				
				}
				
				//top right
				
				for (int num = 0; num < n; num++) {
					
					//g.drawLine(x3, y3, x4, y4);
					g.drawLine(x1, y1, x2, y2);
					
					x1+=xC;
					y2+=xY;
				}
				
				//bottom right
				
				
				for (int num = 0; num < n; num++) {
					
					//g.drawLine(x5, y5, x6, y6);
					g.drawLine(x1, y1, x2, y2);
					
					x2-=xC;
					y1+=xY;
				}
				
				
				//bottom left
			
				
				for (int num = 0; num < n; num++) {
					
					//g.drawLine(x7, y7, x8, y8);
					g.drawLine(x1, y1, x2, y2);
					
					x1-=xC;
					y2-=xY;
					
				}
				
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


