package note;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ABOUT_NOTEPAD extends JDialog {

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
			ABOUT_NOTEPAD dialogb = new ABOUT_NOTEPAD();
            dialogb.setModal(true);
			
            dialogb.setLocationRelativeTo(null);
			dialogb.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialogb.setVisible(true);
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
	public ABOUT_NOTEPAD() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		setTitle("ABOUT NOTEPAD");
		ABOUT_NOTEPAD dialogb = this;
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JAVA_ECLIPSE\\JAVA_OS\\src\\pics\\content-creator.png"));
		setBounds(100, 100, 521, 461);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(192, 192, 192));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\JAVA_OS\\src\\pics\\Add_a_heading__5_-removebg-preview.png"));
		lblNewLabel.setBounds(12, 0, 563, 331);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CAT OS");
		lblNewLabel_1.setFont(new Font("Eras Medium ITC", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setBounds(206, 205, 150, 49);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\JAVA_OS\\src\\pics\\content-creator.png"));
		lblNewLabel_2.setBounds(22, 250, 93, 81);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NOTEPAD");
		lblNewLabel_3.setBounds(99, 279, 242, 16);
		contentPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Version 1.0.0.0.1");
		lblNewLabel_3_1.setBounds(109, 300, 232, 16);
		contentPanel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("@UNION OF PROGRAMMERS AND CODING REPUBLIC");
		lblNewLabel_3_1_1.setBounds(109, 328, 360, 16);
		contentPanel.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("@COPYRIGHT 2023");
		lblNewLabel_3_1_1_1.setBounds(109, 358, 360, 16);
		contentPanel.add(lblNewLabel_3_1_1_1);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(192, 192, 192));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dialogb.dispose();
					}
				});
				okButton.setForeground(new Color(255, 255, 255));
				okButton.setBackground(new Color(0, 128, 192));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
}
