package securitycam1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginPageBody extends JPanel{

	JFrame j;
	public LoginPageBody(JFrame f) {
		// TODO Auto-generated constructor stub
		setBackground(Color.pink);
		this.j =f;
		 setMaximumSize(new Dimension(1200,650));
		 setSize(1200,650);

		 JLabel l1 = new JLabel("hello");
		 
			l1.setBounds(50,50,100,20);
			l1.setForeground(Color.red);
			l1.setFont(new Font("Book Antiqua", Font.PLAIN, 30));
			l1.setLocation(300, 300);

			
		 add(l1);
		 
		 JLabel l2 = new JLabel("hello");
		 
			l2.setBounds(50,50,100,20);
			l2.setForeground(Color.red);
			l2.setFont(new Font("Book Antiqua", Font.PLAIN, 30));
			l2.setLocation(300, 300);

			
		 add(l2);
		 
		 JLabel l3 = new JLabel("hello");
		 
			l3.setBounds(50,50,100,20);
			l3.setForeground(Color.red);
			l3.setFont(new Font("Book Antiqua", Font.PLAIN, 30));
			l3.setLocation(300, 300);
		
			
		 add(l3);
		 
		 JLabel l4 = new JLabel("hello");
		 
			l4.setBounds(50,50,100,20);
			l4.setForeground(Color.red);
			l4.setFont(new Font("Book Antiqua", Font.PLAIN, 30));
			l4.setLocation(300, 300);
		
			
		 add(l4);
		 
		 JLabel l5 = new JLabel("hello");
		 
			l5.setBounds(50,50,100,20);
			l5.setForeground(Color.red);
			l5.setFont(new Font("Book Antiqua", Font.PLAIN, 30));
			l5.setLocation(300, 300);
		
			
		 add(l5);

		 setLayout(new GridLayout(3,3));
	}



}
