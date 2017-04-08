package gui;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ResourcePanel extends CustomPanel{
	
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();
	private final Action action_3 = new SwingAction_3();
	private JFrame frame;
	
	public ResourcePanel(JFrame frame){
		super(frame);
		this.frame = frame;
		JButton btnNewButton = new JButton("Return to Main Menu");
		btnNewButton.setAction(action);
		btnNewButton.setBounds(33, 214, 213, 29);
		this.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Educational links");
		btnNewButton_1.setAction(action_1);
		btnNewButton_1.setBounds(33, 255, 213, 29);
		this.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Recommended purchases");
		btnNewButton_2.setAction(action_2);
		btnNewButton_2.setBounds(33, 296, 213, 29);
		this.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Facts and tips");
		btnNewButton_3.setAction(action_3);
		btnNewButton_3.setBounds(33, 337, 213, 29);
		this.add(btnNewButton_3);
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
	
	// ActionEvent for User Profile button
	private class SwingAction_1 extends AbstractAction {
		private static final long serialVersionUID = 3952694087855581876L;
		public SwingAction_1() {
			putValue(NAME, "Links");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			changePanel(new LinksPanel(frame));
		}
	}
	
	// ActionEvent for Resources and Information button
	private class SwingAction_2 extends AbstractAction {
		private static final long serialVersionUID = 5581455170518144160L;
		public SwingAction_2() {
			putValue(NAME, "Purchases");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			changePanel(new PurchasesPanel(frame));
		}
	}
	
	// ActionEvent for Helpful Contacts button
	private class SwingAction_3 extends AbstractAction {
		private static final long serialVersionUID = -5115678276589030594L;
		public SwingAction_3() {
			putValue(NAME, "Education");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			changePanel(new EducationPanel(frame));
		}
	}
}
