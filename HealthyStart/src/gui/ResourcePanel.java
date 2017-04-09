package gui;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
		btnNewButton.setBounds(33, 337, 213, 29);
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
		btnNewButton_3.setBounds(33, 214, 213, 29);
		this.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(100, 6, 562, 172);
		this.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(HealthyStartWindow.class.getResource("/gui/images/HealthyStartLogo.png")));
	}
	
	// ActionEvent for Returning to Main Menu
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Return to Main Menu");
		}
		public void actionPerformed(ActionEvent e) {
			changePanel(new MainMenuPanel(frame));
		}
	}
	
	// ActionEvent for User Profile button
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Links");
		}
		public void actionPerformed(ActionEvent e) {
			changePanel(new LinksPanel(frame));
		}
	}
	
	// ActionEvent for Resources and Information button
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Purchases");
		}
		public void actionPerformed(ActionEvent e) {
			changePanel(new PurchasesPanel(frame));
		}
	}
	
	// ActionEvent for Helpful Contacts button
	private class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
			putValue(NAME, "Educational");
		}
		public void actionPerformed(ActionEvent e) {
			changePanel(new EducationPanel(frame));
		}
	}
}
