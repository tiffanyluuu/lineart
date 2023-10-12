import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
public class LineArtLab extends JPanel{
	
	// Practice using Loops, random #s and
	// methods
	public void paint(Graphics g) {
		
		int n = 59;
		int xC = 15;
		int xY = 10;
		
		int x1 = 10, y1 = 600; //top left
		int x2 = 10, y2 = 10;
		/*
		int x3 = 900, y3 = 10; //top right
		int x4 = 900, y4 = 555;
		
		int x5 = 10, y5 = 550; //bottom right
		int x6 = 900, y6 = 555;
		
		int x7 = 10, y7 = 10; //bottom left
		int x8 = 10, y8 = 550;
		*/
			
		for(int l = 0; l <= 3; l++) {
				
			

			if(l == 1) {
				
				 x1 = 250; 	
				 y1 = 460;
				 x2 = 250;
				 y2 = 150;
				
				
 
				
					
			} /*else if(l == 2) {
				
				 x1 = 4; 	
				 y1 = 4;
				 x2 = 4;
				 y2 = 100;
				
				 x3 = 200; 
				 y3 = 4;
				 x4 = 200;
				 y4 = 90;
				
				 x5 = 4; 
				 y5 = 90;
				 x6 = 200; 
				 y6 = 100;
				
				 x7 = 4; 
				 y7 = 4;
				 x8 = 4;
				 y8 = 100;
				
			} */
			
				//1) draw a concentric rectangle that's 10pixels from all sides of the "gray"
				//portion of the GUI
				
				//g.drawRect(10, 10, 870, 540);
				
				
				//starting and ending point variables
				//top left
			
				
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


