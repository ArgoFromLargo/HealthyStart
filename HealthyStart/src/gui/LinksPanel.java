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
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class LinksPanel extends CustomPanel{
	
	private final Action action = new SwingAction();
	private final Action action_2 = new SwingAction2();
	private JFrame frame;
	
	public LinksPanel(JFrame frame){
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
		
		JLabel lblNewLabel_1 = new JLabel("CDC Pregnancy Milestone Checklist");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(369, 219, 245, 16);
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
		   public void mouseClicked(MouseEvent e) {
		      if (e.getClickCount() > 0) {
		    	  if (Desktop.isDesktopSupported()) {
		                Desktop desktop = Desktop.getDesktop();
		                try {
		                		URI uri = new URI("https://www.cdc.gov/ncbddd/actearly/pdf/checklists/all_checklists.pdf");
		                        desktop.browse(uri);
		                } catch (IOException ex) {
		                        // do nothing
		                } catch (URISyntaxException ex) {
							//do nothing
						}
		        } else {
		               //do nothing
		        }
		      }
		   }
		});
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CDC Info on Pregnancy Risk");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(369, 247, 245, 16);
		lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
		   public void mouseClicked(MouseEvent e) {
		      if (e.getClickCount() > 0) {
		    	  if (Desktop.isDesktopSupported()) {
		                Desktop desktop = Desktop.getDesktop();
		                try {
		                		URI uri = new URI("https://www.cdc.gov/zika/parents/index.html");
		                        desktop.browse(uri);
		                } catch (IOException ex) {
		                        // do nothing
		                } catch (URISyntaxException ex) {
							//do nothing
						}
		        } else {
		               //do nothing
		        }
		      }
		   }
		});
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Florida Kid Care");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(369, 275, 245, 16);
		lblNewLabel_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
		   public void mouseClicked(MouseEvent e) {
		      if (e.getClickCount() > 0) {
		    	  if (Desktop.isDesktopSupported()) {
		                Desktop desktop = Desktop.getDesktop();
		                try {
		                		URI uri = new URI("https://www.healthykids.org/application/");
		                        desktop.browse(uri);
		                } catch (IOException ex) {
		                        // do nothing
		                } catch (URISyntaxException ex) {
							//do nothing
						}
		        } else {
		               //do nothing
		        }
		      }
		   }
		});
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Community Resources");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(369, 302, 245, 16);
		lblNewLabel_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
		   public void mouseClicked(MouseEvent e) {
		      if (e.getClickCount() > 0) {
		    	  if (Desktop.isDesktopSupported()) {
		                Desktop desktop = Desktop.getDesktop();
		                try {
		                		URI uri = new URI("https://anybabycan.org/community-resources/");
		                        desktop.browse(uri);
		                } catch (IOException ex) {
		                        // do nothing
		                } catch (URISyntaxException ex) {
							//do nothing
						}
		        } else {
		               //do nothing
		        }
		      }
		   }
		});
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Pregnancy Resources");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(369, 330, 245, 16);
		lblNewLabel_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
		   public void mouseClicked(MouseEvent e) {
		      if (e.getClickCount() > 0) {
		    	  if (Desktop.isDesktopSupported()) {
		                Desktop desktop = Desktop.getDesktop();
		                try {
		                		URI uri = new URI("http://www.webmd.com/baby/pregnancy-resources#1");
		                        desktop.browse(uri);
		                } catch (IOException ex) {
		                        // do nothing
		                } catch (URISyntaxException ex) {
							//do nothing
						}
		        } else {
		               //do nothing
		        }
		      }
		   }
		});
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Healthy Child");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(369, 358, 245, 16);
		lblNewLabel_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
		   public void mouseClicked(MouseEvent e) {
		      if (e.getClickCount() > 0) {
		    	  if (Desktop.isDesktopSupported()) {
		                Desktop desktop = Desktop.getDesktop();
		                try {
		                		URI uri = new URI("http://www.healthychild.org/");
		                        desktop.browse(uri);
		                } catch (IOException ex) {
		                        // do nothing
		                } catch (URISyntaxException ex) {
							//do nothing
						}
		        } else {
		               //do nothing
		        }
		      }
		   }
		});
		add(lblNewLabel_6);
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
