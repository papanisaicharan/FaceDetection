package securitycam1;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

public class ListRenderer extends JLabel implements ListCellRenderer<ListItems>  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ListRenderer(){
		setOpaque(true);
	}

	@Override
	public Component getListCellRendererComponent(JList<? extends ListItems> list, ListItems value, int index,
			boolean isSelected, boolean cellHasFocus) {
		// TODO Auto-generated method stub
		
		  String name = value.getName();
		  
		  setText(value.getName());
		  
		 // setBorder(BorderFactory.createLineBorder(Color.getHSBColor(51, 0, 102),10));

//		  Border b = getBorder();
//		  Border  j =new EmptyBorder(10,10,10,10);
//		  setBorder(new CompoundBorder(b,j));
		  setBorder(new EmptyBorder(20, 20, 20, 20));
		   setFont(new Font("Tahoma", Font.BOLD, 14));
	        setBackground(new Color(0,0,0));
	        setBounds(0,0,150,50);
	        setSize(150,50);
	     
	        
	        setHorizontalAlignment(SwingConstants.CENTER);
	        if (isSelected) {
	            setBackground(list.getSelectionBackground());
	            setForeground(list.getSelectionForeground());
	        } else {
	            setBackground(list.getBackground());
	            setForeground(list.getForeground());
	        }


	        return this;
	}




	

}
