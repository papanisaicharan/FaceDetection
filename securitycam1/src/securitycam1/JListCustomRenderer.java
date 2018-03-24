package securitycam1;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class JListCustomRenderer {

	JListCustomRenderer(){
		ListItems l1 = new ListItems("Login Information");
	
		ListItems l2 = new ListItems("Login Information");
		ListItems l3 = new ListItems("Login Information");
		ListItems l4 = new ListItems("Login Information");
		ListItems l5 = new ListItems("Login Information");
		
	    DefaultListModel<ListItems> listModel = new DefaultListModel<>();
        listModel.addElement(l1);
        listModel.addElement(l2);
        listModel.addElement(l3);
        listModel.addElement(l4);
        listModel.addElement(l5);
   
        JList<ListItems> Listnav = new JList<>(listModel);
        Listnav.setBackground(new Color(0,0,255));
        Listnav.setCellRenderer(null);

	}
}
