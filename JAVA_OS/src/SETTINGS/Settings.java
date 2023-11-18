package SETTINGS;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Settings extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			Settings dialogst = new Settings();
			dialogst.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialogst.setVisible(true);
			dialogst.setLocationRelativeTo(null);
			dialogst.setModal(true);
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
	public Settings() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		setTitle("SETTINGS");
		Settings dialogst  = this;
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JAVA_ECLIPSE\\JAVA_OS\\src\\pics\\settings.png"));
		setBounds(100, 100, 704, 513);
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(192, 192, 192));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(0, 0, 162, 476);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("DISPLAY SETTINGS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				display dialogdt = null;
				try {
					dialogdt = new display();
					dialogdt.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialogdt.setVisible(true);
					dialogdt.setVisible(true);
					dialogdt.setLocationRelativeTo(null);
					dialogdt.setModal(true);
					dialogst.dispose();
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		
				
				
				
				
			}
		});
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
					dialogst.dispose();
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
					dialogst.dispose();
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
					dialogn.setModal(true);
					dialogst.dispose();
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
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
					dialogst.dispose();
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
				try {
					Settings dialogst = new Settings();
					dialogst.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialogst.setVisible(true);
					dialogst.setLocationRelativeTo(null);
					dialogst.setModal(true);
					dialogst.dispose();
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
		btnSystemInfo.setForeground(Color.WHITE);
		btnSystemInfo.setFont(new Font("Dialog", Font.BOLD, 10));
		btnSystemInfo.setBackground(new Color(0, 64, 128));
		btnSystemInfo.setBounds(14, 82, 136, 26);
		panel.add(btnSystemInfo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(111, 0, 577, 61);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("SYSTEM INFORMATION");
		lblNewLabel_1.setFont(new Font("Dialog", Font.ITALIC, 20));
		lblNewLabel_1.setBounds(323, 73, 252, 16);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("CPU: AMD A10-9700 3.GHZ 4 Cores ");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.ITALIC, 14));
		lblNewLabel_1_1.setBounds(180, 114, 252, 16);
		contentPanel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("GPU: RX 570 ");
		lblNewLabel_1_1_1.setFont(new Font("Dialog", Font.ITALIC, 14));
		lblNewLabel_1_1_1.setBounds(180, 144, 252, 16);
		contentPanel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("RAM: 8GB DRR4 2400MHZ");
		lblNewLabel_1_1_1_1.setFont(new Font("Dialog", Font.ITALIC, 14));
		lblNewLabel_1_1_1_1.setBounds(180, 172, 252, 16);
		contentPanel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("STORAGE");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Dialog", Font.ITALIC, 14));
		lblNewLabel_1_1_1_1_1.setBounds(180, 200, 252, 16);
		contentPanel.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("SSD 512GB");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Dialog", Font.ITALIC, 14));
		lblNewLabel_1_1_1_1_2.setBounds(180, 237, 252, 16);
		contentPanel.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_2_1 = new JLabel("HDD 500 GB");
		lblNewLabel_1_1_1_1_2_1.setFont(new Font("Dialog", Font.ITALIC, 14));
		lblNewLabel_1_1_1_1_2_1.setBounds(180, 275, 252, 16);
		contentPanel.add(lblNewLabel_1_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_1_3 = new JLabel("SPEAKER: Realtek Audio ");
		lblNewLabel_1_1_1_1_3.setFont(new Font("Dialog", Font.ITALIC, 14));
		lblNewLabel_1_1_1_1_3.setBounds(180, 313, 252, 16);
		contentPanel.add(lblNewLabel_1_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_1_3_1 = new JLabel("OS Name: CAT OS");
		lblNewLabel_1_1_1_1_3_1.setFont(new Font("Dialog", Font.ITALIC, 14));
		lblNewLabel_1_1_1_1_3_1.setBounds(180, 350, 252, 16);
		contentPanel.add(lblNewLabel_1_1_1_1_3_1);
		
		JLabel lblNewLabel_1_1_1_1_3_1_1 = new JLabel("Version 1.0.0.0.1");
		lblNewLabel_1_1_1_1_3_1_1.setFont(new Font("Dialog", Font.ITALIC, 14));
		lblNewLabel_1_1_1_1_3_1_1.setBounds(180, 383, 252, 16);
		contentPanel.add(lblNewLabel_1_1_1_1_3_1_1);
		
		JLabel lblNewLabel_1_1_1_1_3_1_1_1 = new JLabel("Timezone: Manila");
		lblNewLabel_1_1_1_1_3_1_1_1.setFont(new Font("Dialog", Font.ITALIC, 14));
		lblNewLabel_1_1_1_1_3_1_1_1.setBounds(180, 425, 252, 16);
		contentPanel.add(lblNewLabel_1_1_1_1_3_1_1_1);
	}
}
