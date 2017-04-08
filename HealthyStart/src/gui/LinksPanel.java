package gui;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class LinksPanel extends CustomPanel{
	
	private final Action action = new SwingAction();
	private final Action action_2 = new SwingAction2();
	private JFrame frame;
	
	public LinksPanel(JFrame frame){
		super(frame);
		this.frame = frame;
		
		JButton btnNewButton = new JButton("Return to Main Menu");
		btnNewButton.setAction(action);
		btnNewButton.setBounds(33, 214, 213, 29);
		this.add(btnNewButton);
		
		JButton btnNewButton2 = new JButton("Back");
		btnNewButton.setAction(action_2);
		btnNewButton.setBounds(63, 244, 213, 29);
		this.add(btnNewButton);
	}
	
	// ActionEvent for Returning to Main Menu
	@SuppressWarnings("serial")
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Return to Main Menu");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			changePanel(new MainMenuPanel(frame));
		}
	}
	
	// ActionEvent for Returning to Main Menu
	@SuppressWarnings("serial")
	private class SwingAction2 extends AbstractAction {
		public SwingAction2() {
			putValue(NAME, "Back");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			changePanel(new MainMenuPanel(frame));
		}
	}
}
