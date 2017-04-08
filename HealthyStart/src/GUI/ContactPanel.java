package gui;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ContactPanel extends CustomPanel{
	private JFrame frame;
	
	public ContactPanel(JFrame frame){
		super(frame);
		this.frame = frame;
		
	}
	
}
