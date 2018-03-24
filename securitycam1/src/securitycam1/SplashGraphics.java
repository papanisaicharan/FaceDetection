package securitycam1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class SplashGraphics extends Canvas{

	JFrame p;
	SplashGraphics(JFrame f){
		setBackground(Color.white);	  
		this.p = f;
		setBounds(0,0,1400,200);
		setSize(1400,200);
	}
	
	public void paint(Graphics g){
		Toolkit t = Toolkit.getDefaultToolkit();
		Image i =t.getImage("C:\\Users\\saicharan\\Desktop\\nitrr1.jpg");
		g.drawImage(i,120,100,null);
		g.setColor(Color.RED);
		String app_name="NITRR SECURITY";
		for(int i1=0;i1<app_name.length();i1++){
			String x="";
			 x=	x+app_name.substring(i1,i1+1);
			 g.setFont(new Font("Book Antiqua", Font.PLAIN, 30));
		g.drawString(x, 350+i1*50,100);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		String app_name1="SYSTEM";
		for(int i1=0;i1<app_name1.length();i1++){
			String x="";
			 x=	x+app_name1.substring(i1,i1+1);
			 g.setFont(new Font("Book Antiqua", Font.PLAIN, 30));
		g.drawString(x, 550+i1*50,150);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
			}

	}
