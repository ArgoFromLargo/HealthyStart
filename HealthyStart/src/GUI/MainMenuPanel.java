package gui;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import database.User;

@SuppressWarnings("serial")
public class MainMenuPanel extends CustomPanel{
	
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();
	private final Action action_3 = new SwingAction_3();
	private JFrame mainWindow;
	private User user;
	
	public MainMenuPanel(JFrame frame, User user) {
		super(frame);
		this.mainWindow = frame;
		this.user = user;
		
		JButton btnNewButton = new JButton("View Appointment Info");
		btnNewButton.setAction(action);
		btnNewButton.setBounds(33, 214, 213, 29);
		this.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("User Profile");
		btnNewButton_1.setAction(action_1);
		btnNewButton_1.setBounds(33, 255, 213, 29);
		this.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Resources and Information");
		btnNewButton_2.setAction(action_2);
		btnNewButton_2.setBounds(33, 296, 213, 29);
		this.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Helpful Contacts");
		btnNewButton_3.setAction(action_3);
		btnNewButton_3.setBounds(33, 337, 213, 29);
		this.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(100, 6, 562, 172);
		this.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(HealthyStartWindow.class.getResource("/gui/images/HealthyStartLogo.png")));

	}
	
	// ActionEvent for View Appointment Info button
	private class SwingAction extends AbstractAction {
		private static final long serialVersionUID = -5705307890460578789L;
		public SwingAction() {
			putValue(NAME, "View Appointment Info");
		}
		public void actionPerformed(ActionEvent e) {
			changePanel(new ViewAppInfoPanel(mainWindow, user), user);
		}
	}
	
	// ActionEvent for User Profile button
	private class SwingAction_1 extends AbstractAction {
		private static final long serialVersionUID = 3952694087855581876L;
		public SwingAction_1() {
			putValue(NAME, "User Profile");
		}
		public void actionPerformed(ActionEvent e) {
			changePanel(new UserProfilePanel(mainWindow, user), user);
		}
	}
	
	// ActionEvent for Resources and Information button
	private class SwingAction_2 extends AbstractAction {
		private static final long serialVersionUID = 5581455170518144160L;
		public SwingAction_2() {
			putValue(NAME, "Resources and Information");
		}
		public void actionPerformed(ActionEvent e) {
			changePanel(new ResourcePanel(mainWindow, user), user);
		}
	}
	
	// ActionEvent for Helpful Contacts button
	private class SwingAction_3 extends AbstractAction {
		private static final long serialVersionUID = -5115678276589030594L;
		public SwingAction_3() {
			putValue(NAME, "Helpful Contacts");
		}
		public void actionPerformed(ActionEvent e) {
			changePanel(new ContactPanel(mainWindow, user), user);
		}
	}
	
}
