package securitycam1;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginPageHeader extends JPanel{
	
	CardLayout card;
	Container c;
	JFrame p;
	Color gy1;
	
	LoginPageHeader(JFrame f){
		
		 Color gy1 = f.getBackground();
		 setBackground(gy1);
		 this.p = f;
	     setMaximumSize(new Dimension(1200,50));

		Label l11=new Label("Admin Login");
	
		Label l12=new Label("User Login");
	
		l11.setAlignment(Label.CENTER);
		l12.setAlignment(Label.CENTER);
		l11.setFont(new Font("Serif", Font.PLAIN, 20));
		l12.setFont(new Font("Serif", Font.PLAIN, 20));
	
		l11.addMouseListener(new MouseListener(){
	
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				  p.add(new LoginPageBody(p));
			}
	
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				l11.setBackground(Color.lightGray);
			}
	
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				l11.setBackground(gy1);
			}
	
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
	
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		l12.addMouseListener(new MouseListener(){
	
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
		     p.add(new LoginPageBody1(p));
			}
	
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				l12.setBackground(Color.lightGray);
			}
	
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				l12.setBackground(gy1);
			}
	
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
	
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		add(l11);
		add(l12);
		setLayout(new GridLayout(1,2));
	
// 	c.setLayout(card);
//    
//	c.add("a",l11);
//	c.add("b",l12);
	
	}
}
