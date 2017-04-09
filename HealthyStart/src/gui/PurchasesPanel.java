package gui;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class PurchasesPanel extends CustomPanel{
	
	private final Action action = new SwingAction();
	private final Action action_2 = new SwingAction2();
	private JFrame frame;
	
	public PurchasesPanel(JFrame frame){
		super(frame);
		this.frame = frame;
		
		JButton btnNewButton = new JButton("Return to Main Menu");
		btnNewButton.setAction(action);
		btnNewButton.setBounds(33, 255, 213, 29);
		this.add(btnNewButton);
		
		JButton btnNewButton2 = new JButton("Back");
		btnNewButton2.setAction(action_2);
		btnNewButton2.setBounds(33, 214, 213, 29);
		this.add(btnNewButton2);
		
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
	
	// ActionEvent for Returning to Main Menu
	private class SwingAction2 extends AbstractAction {
		public SwingAction2() {
			putValue(NAME, "Back");
		}
		public void actionPerformed(ActionEvent e) {
			changePanel(new ResourcePanel(frame));
		}
	}
}
