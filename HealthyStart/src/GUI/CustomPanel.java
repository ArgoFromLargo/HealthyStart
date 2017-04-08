package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CustomPanel extends JPanel{

	private static final long serialVersionUID = -2759107326913383028L;
	private JFrame frmHealthyStart;
	
	
	public CustomPanel(JFrame frmHealthyStart) {
		this.frmHealthyStart = frmHealthyStart;
		this.setBounds(6, 6, 788, 466);
		// frmHealthyStart.getContentPane().add(panel);
		this.setLayout(null);

	}
	
	public JFrame getFrame() {
		return this.frmHealthyStart;
	}
	
	// Change GUI to new desired page
	public void changePanel(JPanel nextPanel) {
		// JPanel newJPanel = new JPanel();
		// newJPanel.setBounds(6, 6, 788, 466);
		// newJPanel.setBackground(new Color(238, 238, 238));
		
		// JButton btnNewButton = new JButton("Back to Main Menu");
		// btnNewButton.setAction(mainMenuAction);
		// btnNewButton.setBounds(33, 214, 213, 29);
		// newJPanel.add(btnNewButton);
		
		frmHealthyStart.getContentPane().removeAll();
		frmHealthyStart.getContentPane().add(nextPanel);
		frmHealthyStart.getContentPane().revalidate(); 
		frmHealthyStart.getContentPane().repaint();
	}
	
}
