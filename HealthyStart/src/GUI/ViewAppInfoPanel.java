package gui;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import database.User;

@SuppressWarnings("serial")
public class ViewAppInfoPanel extends CustomPanel{

	private final Action action = new SwingAction();
	private JFrame frame;
	private User user;

	public ViewAppInfoPanel(JFrame frame, User user) {
		super(frame);
		this.frame = frame;
		this.user = user;
		JButton btnNewButton = new JButton("Return to Main Menu");
		btnNewButton.setAction(action);
		btnNewButton.setBounds(33, 214, 213, 29);
		this.add(btnNewButton);
		
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
			changePanel(new MainMenuPanel(frame, user), user);
		}
	}
	
}
