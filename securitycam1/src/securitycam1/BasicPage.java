package securitycam1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Path2D;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BasicPage  {
	
	static JFrame f,f1 ;
	BasicPage(){

	}
	
		public static void main(String[] args) throws InterruptedException {    
			// myPath = new Path2D.Double();
			 BasicPage b =new BasicPage();	
			 f = new JFrame("Nitrr Security System");
			 SplashGraphics1 h = new SplashGraphics1(f);
			 f.add(new SplashGraphics(f));
			 f.add(h);

			 f.setSize(1400,800);
			 f.setLayout(new BoxLayout(f.getContentPane(),BoxLayout.Y_AXIS));
			 f.setResizable(false);
			 f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			 f.setVisible(true);
             Thread.sleep(9000);
             f.dispose();

             EventQueue.invokeLater(new Runnable() {
     			public void run() {
     				try {
     					LoginPage frame = new LoginPage();
     					frame.setVisible(true);
     				
     				} catch (Exception e) {
     					e.printStackTrace();
     				}
     			}
     		});
             
     	
 
		}    
}


