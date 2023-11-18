package SETTINGS;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;

public class UNIAPP extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			UNIAPP dialoga = new UNIAPP();
			dialoga.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialoga.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public UNIAPP() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		setTitle("UNINSTALL APPS");
		
		UNIAPP dialoga  = this;
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JAVA_ECLIPSE\\JAVA_OS\\src\\pics\\settings.png"));
		setBounds(100, 100, 704, 513);
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(192, 192, 192));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(0, 0, 162, 476);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("DISPLAY SETTINGS");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 10));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 64, 128));
		btnNewButton.setBounds(14, 133, 136, 26);
		panel.add(btnNewButton);
		
		JButton btnNetworkSettings = new JButton("NETWORK SETTINGS");
		btnNetworkSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NETWORKSEC dialogns = null;
				try {
					dialogns = new NETWORKSEC();
					dialogns.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialogns.setVisible(true);
					dialogns.setModal(true);
					dialoga.dispose();
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNetworkSettings.setForeground(Color.WHITE);
		btnNetworkSettings.setFont(new Font("Dialog", Font.BOLD, 10));
		btnNetworkSettings.setBackground(new Color(0, 64, 128));
		btnNetworkSettings.setBounds(14, 186, 136, 26);
		panel.add(btnNetworkSettings);
		
		JButton btnSoundSettings = new JButton("SOUND SETTINGS");
		btnSoundSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soundsettings dialogvol = null;
				try {
					dialogvol = new soundsettings();
					dialogvol.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialogvol.setVisible(true);
					dialogvol.setModal(true);
					dialoga.dispose();
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSoundSettings.setForeground(Color.WHITE);
		btnSoundSettings.setFont(new Font("Dialog", Font.BOLD, 10));
		btnSoundSettings.setBackground(new Color(0, 64, 128));
		btnSoundSettings.setBounds(14, 235, 136, 26);
		panel.add(btnSoundSettings);
		
		JButton btnCatnapSecurity = new JButton("CATNAP SECURITY");
		btnCatnapSecurity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CATNAP dialogn = null;
				try {
					dialogn = new CATNAP();
					dialogn.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialogn.setVisible(true);
					dialoga.dispose();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnCatnapSecurity.setForeground(Color.WHITE);
		btnCatnapSecurity.setFont(new Font("Dialog", Font.BOLD, 10));
		btnCatnapSecurity.setBackground(new Color(0, 64, 128));
		btnCatnapSecurity.setBounds(14, 285, 136, 26);
		panel.add(btnCatnapSecurity);
		
		JButton btnUninstallApps = new JButton("UNINSTALL APPS");
		btnUninstallApps.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				UNIAPP dialoga = null;
				try {
					dialoga = new UNIAPP();
					dialoga.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialoga.setVisible(true);
					dialoga.dispose();
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnUninstallApps.setForeground(Color.WHITE);
		btnUninstallApps.setFont(new Font("Dialog", Font.BOLD, 10));
		btnUninstallApps.setBackground(new Color(0, 64, 128));
		btnUninstallApps.setBounds(14, 335, 136, 26);
		panel.add(btnUninstallApps);
		
		JButton btnAboutSettings = new JButton("ABOUT SETTINGS");
		btnAboutSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ABOUT_sET dialogg = new ABOUT_sET();
				dialogg.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialogg.setVisible(true);
			}
		});
		btnAboutSettings.setForeground(Color.WHITE);
		btnAboutSettings.setFont(new Font("Dialog", Font.BOLD, 10));
		btnAboutSettings.setBackground(new Color(0, 64, 128));
		btnAboutSettings.setBounds(14, 383, 136, 26);
		panel.add(btnAboutSettings);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\JAVA_OS\\src\\pics\\settings.png"));
		lblNewLabel.setBounds(41, 0, 121, 70);
		panel.add(lblNewLabel);
		
		JButton btnSystemInfo = new JButton("SYSTEM INFO");
		btnSystemInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Settings dialogst = null;
				try {
					dialogst = new Settings();
					dialogst.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialogst.setVisible(true);
					dialogst.setLocationRelativeTo(null);
					dialogst.setModal(true);
					dialoga.dispose();
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnSystemInfo.setForeground(Color.WHITE);
		btnSystemInfo.setFont(new Font("Dialog", Font.BOLD, 10));
		btnSystemInfo.setBackground(new Color(0, 64, 128));
		btnSystemInfo.setBounds(14, 82, 136, 26);
		panel.add(btnSystemInfo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(111, 0, 577, 61);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("UNINSTALL APP");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel_1.setBounds(197, 74, 276, 51);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("APP");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_1_1.setBounds(207, 136, 108, 51);
		contentPanel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("DATE ");
		lblNewLabel_1_1_1.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_1_1_1.setBounds(349, 136, 202, 51);
		contentPanel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("FILESIZE");
		lblNewLabel_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 19));
		lblNewLabel_1_1_1_1.setBounds(486, 136, 202, 51);
		contentPanel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("No APPS Founds");
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel_1_2.setBounds(275, 271, 276, 51);
		contentPanel.add(lblNewLabel_1_2);
		
		
	}
}


