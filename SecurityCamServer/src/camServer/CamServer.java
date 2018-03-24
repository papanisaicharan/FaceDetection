package camServer;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class CamServer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CamServer frame = new CamServer();
					frame.setVisible(true);
					frame.setTitle("CamServer");
					ServerSocket ss=new ServerSocket(1313);  
					Socket s=ss.accept();  
					DataInputStream din=new DataInputStream(s.getInputStream());  
					DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
					//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
					
					
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","Charan13");
					
					Statement stmt=con.createStatement();
					String s1 = null,p = null;
					ResultSet rs=stmt.executeQuery(" select UserName,Password from CamUserAdmin");
					while(rs.next()){
						s1= rs.getString(1);
						p =rs.getString(2);
						}

					String str = din.readUTF();
					String str1 = din.readUTF();
					if(str.equals(s1) && str1.equals(p)){
						dout.writeUTF("true");
					}
					con.close();
					s.close();  
					ss.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CamServer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}


}
