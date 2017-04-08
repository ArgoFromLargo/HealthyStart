package gui;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ViewAppInfoPanel extends CustomPanel{

	private static final long serialVersionUID = -3501699976386189601L;
	private final Action action = new SwingAction();
	private JFrame frame;

	public ViewAppInfoPanel(JFrame frame) {
		super(frame);
		this.frame = frame;
		JButton btnNewButton = new JButton("Return to Main Menu");
		btnNewButton.setAction(action);
		btnNewButton.setBounds(33, 214, 213, 29);
		this.add(btnNewButton);
	}
	
	// ActionEvent for Returning to Main Menu
	private class SwingAction extends AbstractAction {
		private static final long serialVersionUID = -5705307890460578789L;
		public SwingAction() {
			putValue(NAME, "Return to Main Menu");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			changePanel(new MainMenuPanel(frame));
		}
	}
	
}
