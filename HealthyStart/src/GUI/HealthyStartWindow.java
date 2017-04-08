package gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Button;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JPanel;

public class HealthyStartWindow {

	private JFrame frmHealthyStart;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();
	private final Action action_3 = new SwingAction_3();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HealthyStartWindow window = new HealthyStartWindow();
					window.frmHealthyStart.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HealthyStartWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHealthyStart = new JFrame();
		frmHealthyStart.setBackground(new Color(238, 238, 238));
		frmHealthyStart.setTitle("Welcome to Healthy Start");
		frmHealthyStart.setBounds(100, 100, 800, 500);
		frmHealthyStart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHealthyStart.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 788, 466);
		frmHealthyStart.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("View Appointment Info");
		btnNewButton.setAction(action);
		btnNewButton.setBounds(33, 214, 213, 29);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("User Profile");
		btnNewButton_1.setAction(action_1);
		btnNewButton_1.setBounds(33, 255, 213, 29);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Resources and Information");
		btnNewButton_2.setAction(action_2);
		btnNewButton_2.setBounds(33, 296, 213, 29);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Helpful Contacts");
		btnNewButton_3.setAction(action_3);
		btnNewButton_3.setBounds(33, 337, 213, 29);
		panel.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(6, 6, 562, 172);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(HealthyStartWindow.class.getResource("/gui/images/HealthyStartLogo.png")));
	}
	
	private void changePanel() {
		JPanel newJPanel = new JPanel();
		newJPanel.setBackground(new Color(2, 2, 2));
		
		frmHealthyStart.getContentPane().removeAll();
		frmHealthyStart.getContentPane().add(newJPanel);
		frmHealthyStart.getContentPane().revalidate(); 
		frmHealthyStart.getContentPane().repaint();

	}

	private class SwingAction extends AbstractAction {
		private static final long serialVersionUID = -5705307890460578789L;
		public SwingAction() {
			putValue(NAME, "View Appointment Info");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			changePanel();
		}
	}
	private class SwingAction_1 extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 3952694087855581876L;
		public SwingAction_1() {
			putValue(NAME, "User Profile");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			changePanel();
		}
	}
	private class SwingAction_2 extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 5581455170518144160L;
		public SwingAction_2() {
			putValue(NAME, "Resources and Information");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_3 extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = -5115678276589030594L;
		public SwingAction_3() {
			putValue(NAME, "Helpful Contacts");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
