package securitycam1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;

import javax.swing.JLabel;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private Image background;
	private JButton btnSubmit;
	private boolean valuetoClose = false;


	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					LoginPage frame = new LoginPage();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	
	
	public LoginPage() {
		getContentPane().setBackground(new Color(102, 102, 204));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 964, 605);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 153, 204));
		panel.setBounds(10, 11, 938, 59);
		getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		Label lblAdminLogin = new Label("ADMIN LOGIN");
		
		lblAdminLogin.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 14));
		lblAdminLogin.setForeground(Color.RED);
		lblAdminLogin.setBackground(new Color(51, 0, 102));
		lblAdminLogin.setAlignment(Label.CENTER);
		panel.add(lblAdminLogin);
		
		Label lblLogin = new Label("LOGIN");
		lblLogin.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 14));
		lblLogin.setForeground(Color.RED);
		lblLogin.setBackground(new Color(51, 0, 102));
		lblLogin.setAlignment(Label.CENTER);
		
		panel.add(lblLogin);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 0, 102));
		panel_1.setBounds(10, 79, 333, 486);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(116, 5, 0, 0);
		panel_1.add(label);
		
		JLabel lblNationalInstituteOf = new JLabel("NATIONAL INSTITUTE ");
		lblNationalInstituteOf.setForeground(new Color(255, 255, 255));
		lblNationalInstituteOf.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNationalInstituteOf.setHorizontalAlignment(SwingConstants.CENTER);
		lblNationalInstituteOf.setBounds(10, 11, 313, 35);
		panel_1.add(lblNationalInstituteOf);
		
		JLabel lblOfTechnologyRaipur = new JLabel("OF TECHNOLOGY");
		lblOfTechnologyRaipur.setForeground(new Color(255, 255, 255));
		lblOfTechnologyRaipur.setHorizontalAlignment(SwingConstants.CENTER);
		lblOfTechnologyRaipur.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblOfTechnologyRaipur.setBounds(10, 54, 313, 41);
		panel_1.add(lblOfTechnologyRaipur);
		
		JLabel lblRaipur = new JLabel(" RAIPUR");
		lblRaipur.setForeground(new Color(255, 255, 255));
		lblRaipur.setHorizontalAlignment(SwingConstants.CENTER);
		lblRaipur.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRaipur.setBounds(10, 110, 313, 29);
		panel_1.add(lblRaipur);
		
		JPanel panel_5 = new JPanel()
				{
			 public void paintComponent(Graphics g){
			       // paint code
				 super.paintComponent(g);
				g.drawImage(background, 0, 0, null);
			    }
				};
		panel_5.setBounds(75, 150, 182, 192);
	    background = Toolkit.getDefaultToolkit().createImage("C:\\Users\\saicharan\\Desktop\\images.jpg");
		panel_1.add(panel_5);
		
		JLabel lblGoToNitrr = new JLabel("Go to Nitrr website");
		lblGoToNitrr.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblGoToNitrr.setForeground(new Color(255, 0, 0));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblGoToNitrr.setForeground(new Color(0, 0, 153));
			}
		});
		lblGoToNitrr.setForeground(new Color(204, 0, 0));
		lblGoToNitrr.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGoToNitrr.setHorizontalAlignment(SwingConstants.CENTER);
		lblGoToNitrr.setBounds(64, 396, 193, 14);
		panel_1.add(lblGoToNitrr);

		
	
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(173, 216, 230));
		panel_2.setBounds(353, 79, 595, 486);
		getContentPane().add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(173, 216, 230));
		panel_2.add(panel_3, "name_24591466774903");
		panel_3.setLayout(null);
		
		JLabel lblUsename = new JLabel("UserName                          :");
	
		lblUsename.setForeground(new Color(0, 0, 0));
		lblUsename.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUsename.setBounds(72, 134, 213, 30);
		panel_3.add(lblUsename);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setBounds(340, 134, 187, 34);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password                           :");
		lblPassword.setForeground(new Color(0, 0, 0));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(72, 227, 213, 40);
		panel_3.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(340, 233, 186, 32);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		btnSubmit = new JButton("Submit");
	
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSubmit.setForeground(new Color(255, 0, 0));
		btnSubmit.setBackground(new Color(240, 248, 255));
		btnSubmit.setBounds(218, 344, 155, 40);
		panel_3.add(btnSubmit);
		
		JLabel lblAdminLogin_1 = new JLabel("ADMIN LOGIN");
		lblAdminLogin_1.setForeground(new Color(0, 0, 0));
		lblAdminLogin_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAdminLogin_1.setBounds(230, 29, 155, 40);
		panel_3.add(lblAdminLogin_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(173, 216, 230));
		panel_2.add(panel_4, "name_24874320331857");
		panel_4.setLayout(null);
		
		
		JLabel lblSecurityLogin = new JLabel("SECURITY LOGIN");
		lblSecurityLogin.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSecurityLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblSecurityLogin.setBounds(230, 29, 155, 40);
		panel_4.add(lblSecurityLogin);
		
		JLabel lblUsername = new JLabel("UserName                             :");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUsername.setBounds(72, 134, 213, 30);
		panel_4.add(lblUsername);
		
		JLabel lblPassword_1 = new JLabel("Password                             :");
		lblPassword_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword_1.setBounds(72, 227, 213, 40);
		panel_4.add(lblPassword_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(340, 134, 187, 34);
		panel_4.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(340, 233, 186, 32);
		panel_4.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnSubmit_1 = new JButton("SUBMIT");
		btnSubmit_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSubmit_1.setForeground(new Color(255, 0, 0));
		btnSubmit_1.setBounds(218, 344, 155, 40);
		panel_4.add(btnSubmit_1);
		
		lblLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_2.removeAll();
				panel_2.repaint();
				panel_2.revalidate();
				
				panel_2.add(panel_4);
				panel_2.repaint();
				panel_2.revalidate();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblLogin.setBackground(new Color(51, 204, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblLogin.setBackground(new Color(51, 0, 102));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblLogin.setBackground(new Color(173, 216, 230));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				lblLogin.setBackground(Color.WHITE);
			}
		});
		
		lblAdminLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_2.removeAll();
				panel_2.repaint();
				panel_2.revalidate();
				
				panel_2.add(panel_3);
				panel_2.repaint();
				panel_2.revalidate();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblAdminLogin.setBackground(new Color(51, 204, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblAdminLogin.setBackground(new Color(51, 0, 102));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				lblAdminLogin.setBackground(Color.WHITE);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblAdminLogin.setBackground(new Color(173, 216, 230));
			}
		});
		
		btnSubmit.addActionListener(new ActionListener() {
		
			private String userNameadmin;	
			private String passwordadmin;

			public void actionPerformed(ActionEvent arg0) {
				userNameadmin = textField.getText();
				passwordadmin = textField_1.getText();
				String p1 = userNameadmin+passwordadmin;
				try{
					InetAddress ip=InetAddress.getByName("SAICHARAN");  
					  
					//System.out.println("Host Name: "+ip.getHostName());  
					//System.out.println("IP Address: "+ip.getHostAddress());
				Socket s=new Socket(ip.getHostName(),1313);  
			DataInputStream din=new DataInputStream(s.getInputStream());  
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
		
			dout.writeUTF(userNameadmin); 
			dout.writeUTF(passwordadmin);
			String str = din.readUTF();

					if(str.equals("true")){
					
					DetailsFrame frame = new DetailsFrame();
					frame.setVisible(true);
				    dispose();
					}
					dout.close();  
					s.close(); 
					}catch(Exception e){
					System.out.println(e);
				}				
			}
		});
		
	}


}
