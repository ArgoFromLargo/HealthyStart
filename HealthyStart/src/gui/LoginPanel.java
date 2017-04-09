package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class LoginPanel extends CustomPanel {

	private JFrame mainWindow;
	private JTextField txtEnterEmailHere;
	private final Action action = new SwingAction();
	private String email;
	
	public LoginPanel(JFrame mainWindow) {
		super(mainWindow);
		this.mainWindow = mainWindow;
		
		txtEnterEmailHere = new JTextField();
		txtEnterEmailHere.setToolTipText("Enter email address here");
		txtEnterEmailHere.setBounds(266, 300, 263, 26);
		add(txtEnterEmailHere);
		txtEnterEmailHere.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setAction(action);
		btnNewButton.setToolTipText("Submit email address");
		btnNewButton.setBounds(296, 355, 172, 29);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(115, 67, 562, 172);
		this.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(HealthyStartWindow.class.getResource("/gui/images/HealthyStartLogo.png")));
		
		JLabel lblNewLabel_1 = new JLabel("Enter email");
		lblNewLabel_1.setBounds(192, 305, 75, 16);
		add(lblNewLabel_1);
	}
	
	// ActionEvent for starting Main Menu and capturing email
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Submit email address");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			email = txtEnterEmailHere.getText();
			changePanel(new MainMenuPanel(mainWindow));
		}
	}
}
