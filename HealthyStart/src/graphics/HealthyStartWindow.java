package graphics;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class HealthyStartWindow {

	private JFrame frmHealthyStart;

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
		frmHealthyStart.setBounds(100, 100, 618, 328);
		frmHealthyStart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel HealthyStartLogo = new JLabel("");
		HealthyStartLogo.setHorizontalAlignment(SwingConstants.CENTER);
		HealthyStartLogo.setIcon(new ImageIcon("src/graphics/images/HealthyStartLogo.png"));
		frmHealthyStart.getContentPane().add(HealthyStartLogo, BorderLayout.CENTER);
	}

}
