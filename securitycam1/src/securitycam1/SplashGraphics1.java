package securitycam1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class SplashGraphics1 extends Canvas {
	JFrame j;
	private boolean set = false;
	SplashGraphics1(JFrame f){
		setBackground(Color.white);
		this.j=f;
		setBounds(0,0,1400,600);
		setSize(1400,600);
	}
	public void paint(Graphics g){
//		g.setColor(Color.black);
//		g.fillRect(0, 0,f.getWidth(),f.getHeight());
		g.setColor(Color.red);
		for(int i1=0;i1<=701;i1++){
			if(i1<=400){
					//g.drawLine(i,300,i,300);
					g.fillArc(i1,200,6,6,0,360);
					g.fillArc(1400-i1,200,6,6,0,360);
				}else if(i1==401) {
						for(int j=0;j<=100;j++){
								//	g.drawLine(300+j,300-j,300+j,300-j);
								g.fillArc(400+j,200-j,6,6,0,360);
								g.fillArc(1000-j,200+j,6,6,0,360);
								try {
									Thread.sleep(10);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						}
			}else{
				g.fillArc(100+i1,100,6,6,0,360);
				g.fillArc(1300-i1,300,6,6,0,360);
			}
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		g.setColor(new Color(100, 0, 255, 80));
//		for(int i = 3;i<=196;i++){
//		g.fillRect(503,303+i,400,2);
//		Thread.sleep(5);
//		}
		g.setColor(new Color(100, 0, 255, 80));
		int[] x = {300,400,500,1100,1000,900};//,500,700,800,900
		int[] y = {300,200,100,100,200,300};//300,500,400,300
		int z=6;
		g.fillPolygon(x, y, z);
		
		
		
//		while(true){
//			g.setColor(new Color(255, 0,100, 80));
//			g.fillRect(503,306,400,195);
//			Thread.sleep(1000);		
//			g.setColor(new Color(100, 0, 255, 80));
//			g.fillRect(503,306,400,195);
//			Thread.sleep(1000);
//		}
		
		g.setColor(Color.RED);
		String app_name="Security system of  nit Raipur presented by          ";
		String power="HSL";
		for(int i1=0;i1<app_name.length();i1++){
			String x1="";
			 x1=	x1+app_name.substring(i1,i1+1);
			 g.setFont(new Font("Book Antiqua", Font.PLAIN, 30));
			 if(i1<20){
		g.drawString(x1,500+i1*20,150);
			 }else if(i1 >=20){
				 g.drawString(x1,100+i1*20,200);
			 }else{
			
			 }
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		 g.drawString(power,650,250);
		 set = true;
			}

	public boolean closing(){
		if(set==true){
		return true;
		}else{
			return false;
		}
	}
}
