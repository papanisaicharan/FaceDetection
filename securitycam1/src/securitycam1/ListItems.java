package securitycam1;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ListItems {
	private String name;

	public ListItems(String name2) {
		// TODO Auto-generated constructor stub
		this.name = name2;
	}


	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    @Override
    public String toString() { 
        return name; 
    }





}
