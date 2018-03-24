package securitycam1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JTree;
import javax.swing.ListCellRenderer;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.opencv.core.Core;



import javax.swing.UIManager;

import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JMenu;
import java.awt.CardLayout;
import javax.swing.JMenuItem;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DetailsFrame extends JFrame {
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					DetailsFrame frame = new DetailsFrame();
//					frame.setVisible(true);
//			
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	private Image background;

	public DetailsFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0,1370, 730);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 102, 204));
		panel.setBounds(0, 0, 1364, 701);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(123, 104, 238));
		panel_1.setBounds(0, 0, 335, 705);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(75, 0, 130));
		panel_2.setBounds(10, 11, 315, 122);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNationalInstitueOf = new JLabel("National Institue of Technology Raipur");
		lblNationalInstitueOf.setHorizontalAlignment(SwingConstants.CENTER);
		lblNationalInstitueOf.setForeground(new Color(255, 255, 255));
		lblNationalInstitueOf.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNationalInstitueOf.setBounds(10, 11, 315, 42);
		panel_2.add(lblNationalInstitueOf);
		
		JPanel panel_4 = new JPanel()
		{
	 public void paintComponent(Graphics g){
	       // paint code
		 super.paintComponent(g);
		g.drawImage(background, 0, 0, null);
	    }
		};
        background = Toolkit.getDefaultToolkit().createImage("C:\\Users\\saicharan\\Desktop\\images.jpg");
		panel_4.setBounds(109, 64, 100, 45);
		panel_2.add(panel_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(75, 0, 130));
		panel_3.setBounds(10, 142, 315, 552);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		ListItems l1 = new ListItems("Login Information");	
		ListItems l2 = new ListItems("Database");
		ListItems l3 = new ListItems("Register users");
		ListItems l4 = new ListItems("Camera Views");
		ListItems l5 = new ListItems("Security Settings");
		ListItems l6 = new ListItems("unauthorized Entries");
		
		  DefaultListModel<ListItems> listModel = new DefaultListModel<>();
		  
		  	listModel.addElement(l4);
	        listModel.addElement(l2);
	        listModel.addElement(l3);
	        listModel.addElement(l5);
	        listModel.addElement(l6);
	        listModel.addElement(l1);
		
		JList<ListItems> Listnav = new JList<>(listModel);
		int  t = Listnav.getFirstVisibleIndex();
	
		

		Listnav.setBounds(0, 11, 315, 444);
		panel_3.add(Listnav);
		Listnav.setBorder(new TitledBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), new BevelBorder(BevelBorder.LOWERED, null, null, null, null)), "Navigation", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(255, 255, 255)));
		Listnav.setFont(new Font("Tahoma", Font.BOLD, 20));
		Listnav.setForeground(new Color(255, 255, 255));
		Listnav.setBackground(new Color(75, 0, 130));
		Listnav.setCellRenderer(new ListRenderer());
		
		
		
		JLabel lblNewLabel = new JLabel("Application design @ 2017");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(245, 255, 250));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(28, 466, 231, 33);
		panel_3.add(lblNewLabel);
		
		JLabel lblNitrracin = new JLabel("nitrr.ac.in");
		lblNitrracin.setForeground(new Color(245, 255, 250));
		lblNitrracin.setHorizontalAlignment(SwingConstants.CENTER);
		lblNitrracin.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNitrracin.setBounds(38, 509, 191, 32);
		panel_3.add(lblNitrracin);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(335, 71, 1020, 619);
		panel.add(panel_5);
		panel_5.setBackground(new Color(102, 102, 204));
		panel_5.setLayout(new CardLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255));
		panel_5.add(panel_6, "name_81041647305045");
		panel_6.setLayout(new GridLayout(2,2));
		
		JButton btnSasasa = new JButton("sasasa");
		btnSasasa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				javafx.application.Application.launch(FXHelloCV.class);
			}
		});
		panel_6.add(btnSasasa);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_6.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("New button");
		panel_6.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_6.add(btnNewButton_2);
		
		JPanel panel_7 = new JPanel();
		panel_5.add(panel_7, "name_81041663852593");
		panel_7.setLayout(null);
		
		JLabel lblThisIs_4 = new JLabel("this is 2");
		lblThisIs_4.setBounds(206, 129, 99, 66);
		panel_7.add(lblThisIs_4);
		
		JPanel panel_8 = new JPanel();
		panel_5.add(panel_8, "name_81062802403198");
		panel_8.setLayout(null);
		
		JLabel lblThisIsrd = new JLabel("this is 3rd");
		lblThisIsrd.setBounds(312, 108, 127, 14);
		panel_8.add(lblThisIsrd);
		
		JPanel panel_9 = new JPanel();
		panel_5.add(panel_9, "name_81066260592328");
		panel_9.setLayout(null);
		
		JLabel lblThisIs_2 = new JLabel("this is 4");
		lblThisIs_2.setBounds(200, 117, 99, 66);
		panel_9.add(lblThisIs_2);
		
		JPanel panel_10 = new JPanel();
		panel_5.add(panel_10, "name_81068563091749");
		panel_10.setLayout(null);
		
		JLabel lblThisIs_1 = new JLabel("this is 5");
		lblThisIs_1.setBounds(174, 97, 99, 66);
		panel_10.add(lblThisIs_1);
		
		JPanel panel_11 = new JPanel();
		panel_5.add(panel_11, "name_81073117675503");
		panel_11.setLayout(null);
		
		JLabel lblThisIs = new JLabel("this is 6");
		lblThisIs.setBounds(244, 68, 99, 66);
		panel_11.add(lblThisIs);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBounds(335, 11, 1020, 60);
		panel.add(panel_13);
		panel_13.setLayout(new CardLayout(0, 0));
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(new Color(75, 0, 130));
		panel_15.setBounds(336, 11, 1019, 60);
		panel_13.add(panel_15);
		panel_15.setLayout(null);
		
		Label lblLogout = new Label("Logout");
		lblLogout.setAlignment(Label.CENTER);
		lblLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblLogout.setBackground(new Color(255, 0, 0));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblLogout.setBackground(new Color(75, 0, 130));
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
			}
		});
		lblLogout.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLogout.setForeground(new Color(255, 255, 255));
		
		lblLogout.setBounds(915, 11, 94, 38);
		panel_15.add(lblLogout);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(75, 0, 130));
		panel_14.setBounds(10, 11, 788, 38);
		panel_15.add(panel_14);
		panel_14.setLayout(null);
		
		Label label = new Label("New label");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label.setBackground(new Color(255, 0, 0));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				label.setBackground(new Color(75, 0, 130));
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
			}
		});
		label.setAlignment(Label.CENTER);
		label.setBounds(0, 0, 137, 38);
	
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBackground(new Color(75, 0, 130));
		panel_14.add(label);
		
		Label label_1 = new Label("egsfhhdf");
		label_1 .addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_1.setBackground(new Color(255, 0, 0));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				label_1.setBackground(new Color(75, 0, 130));
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
			}
		});
		label_1.setAlignment(Label.CENTER);
		label_1.setBounds(151, 0, 137, 38);

		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_14.add(label_1);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(75, 0, 130));
		panel_13.add(panel_16, "name_63112939572471");
		panel_16.setLayout(null);
		
		Label label_3 = new Label("Logout");
		label_3.setFont(new Font("Dialog", Font.BOLD, 14));
		label_3.setAlignment(Label.CENTER);
		label_3.setForeground(new Color(255, 255, 255));
		label_3.setBackground(new Color(75, 0, 130));
		label_3.setBounds(915, 11, 94, 38);
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_3.setBackground(new Color(255, 0, 0));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				label_3.setBackground(new Color(75, 0, 130));
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
			}
		});
		panel_16.add(label_3);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(new Color(75, 0, 130));
		panel_13.add(panel_17, "name_65244541364203");
		panel_17.setLayout(null);
		
		Label label_4 = new Label("Logout");
		label_4.setForeground(new Color(255, 255, 255));
		label_4.setFont(new Font("Dialog", Font.BOLD, 14));
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_4.setBackground(new Color(255, 0, 0));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				label_4.setBackground(new Color(75, 0, 130));
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
			}
		});
		label_4.setBackground(new Color(75, 0, 130));
		label_4.setAlignment(Label.CENTER);
		label_4.setBounds(915, 11, 94, 38);
		panel_17.add(label_4);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(new Color(75, 0, 130));
		panel_13.add(panel_18, "name_65272213065238");
		panel_18.setLayout(null);
		
		Label label_5 = new Label("Logout");
		label_5.setFont(new Font("Dialog", Font.BOLD, 14));
		label_5.setForeground(new Color(255, 255, 255));
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_5.setBackground(new Color(255, 0, 0));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				label_5.setBackground(new Color(75, 0, 130));
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
			}
		});
		label_5.setBackground(new Color(75, 0, 130));
		label_5.setAlignment(Label.CENTER);
		label_5.setBounds(915, 11, 94, 38);
		panel_18.add(label_5);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(new Color(75, 0, 130));
		panel_13.add(panel_19, "name_65288576544632");
		panel_19.setLayout(null);
		
		Label label_6 = new Label("Logout");
		label_6.setFont(new Font("Dialog", Font.BOLD, 14));
		label_6.setForeground(new Color(255, 255, 255));
		label_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_6.setBackground(new Color(255, 0, 0));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				label_6.setBackground(new Color(75, 0, 130));
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
			}
		});
		label_6.setBackground(new Color(75, 0, 130));
		label_6.setAlignment(Label.CENTER);
		label_6.setBounds(915, 11, 94, 38);
		panel_19.add(label_6);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(new Color(75, 0, 130));
		panel_13.add(panel_20, "name_65297574825966");
		panel_20.setLayout(null);
		
		Label label_2 = new Label("Logout");
		label_2.setFont(new Font("Dialog", Font.BOLD, 14));
		label_2.setForeground(new Color(255, 255, 255));
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_2.setBackground(new Color(255, 0, 0));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				label_2.setBackground(new Color(75, 0, 130));
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
			}
		});
		label_2.setBackground(new Color(75, 0, 130));
		label_2.setAlignment(Label.CENTER);
		label_2.setBounds(915, 11, 94, 38);
		panel_20.add(label_2);

	
		MouseListener mouseListener = new MouseAdapter() {
		    public void mouseClicked(MouseEvent e) {
		    	int  i = Listnav.getSelectedIndex();
		    	switch(i) {
		    	case 0:
		    		panel_5.removeAll();
					panel_5.repaint();
					panel_5.revalidate();
					
					panel_13.removeAll();
					panel_13.repaint();
					panel_13.revalidate();
					
					panel_13.add(panel_15);
					panel_13.repaint();
					panel_13.revalidate();
					
					panel_5.add(panel_6);
					panel_5.repaint();
					panel_5.revalidate();
					break;
		    	case 1:
		    		panel_5.removeAll();
		    		panel_5.repaint();
		    		panel_5.revalidate();
					
		    		panel_13.removeAll();
					panel_13.repaint();
					panel_13.revalidate();
					
					panel_13.add(panel_16);
					panel_13.repaint();
					panel_13.revalidate();
		    		
					panel_5.add(panel_7);
					panel_5.repaint();
					panel_5.revalidate();
					break;
		    	case 2:
		    		panel_5.removeAll();
		    		panel_5.repaint();
		    		panel_5.revalidate();
					
		    		panel_13.removeAll();
					panel_13.repaint();
					panel_13.revalidate();
					
					panel_13.add(panel_17);
					panel_13.repaint();
					panel_13.revalidate();
		    		
					panel_5.add(panel_8);
					panel_5.repaint();
					panel_5.revalidate();
					break;
		    	case 3:
		    		panel_5.removeAll();
		    		panel_5.repaint();
		    		panel_5.revalidate();
					
		    		panel_13.removeAll();
					panel_13.repaint();
					panel_13.revalidate();
					
					panel_13.add(panel_18);
					panel_13.repaint();
					panel_13.revalidate();
		    		
					panel_5.add(panel_9);
					panel_5.repaint();
					panel_5.revalidate();
					break;
		    	case 4:
		    		panel_5.removeAll();
		    		panel_5.repaint();
		    		panel_5.revalidate();
					
		    		panel_13.removeAll();
					panel_13.repaint();
					panel_13.revalidate();
					
					panel_13.add(panel_19);
					panel_13.repaint();
					panel_13.revalidate();
		    		
					panel_5.add(panel_10);
					panel_5.repaint();
					panel_5.revalidate();
					break;
		    	case 5:
		    		panel_5.removeAll();
		    		panel_5.repaint();
		    		panel_5.revalidate();
					
		    		panel_13.removeAll();
					panel_13.repaint();
					panel_13.revalidate();
					
					panel_13.add(panel_20);
					panel_13.repaint();
					panel_13.revalidate();
		    		
					panel_5.add(panel_11);
					panel_5.repaint();
					panel_5.revalidate();
					break;
				default :
					
		    }
		}
		};

		Listnav.addMouseListener(mouseListener);
		
	
	}
}
