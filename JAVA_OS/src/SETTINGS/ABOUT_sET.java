package SETTINGS;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

public class ABOUT_sET extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ABOUT_sET dialogg = new ABOUT_sET();
			dialogg.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialogg.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ABOUT_sET() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JAVA_ECLIPSE\\JAVA_OS\\src\\pics\\settings.png"));
		setModal(true);
		setTitle("ABOUT SETTINGS");
		setBounds(100, 100, 450, 271);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(192, 192, 192));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ABOUT SETTINGS");
		lblNewLabel_1.setFont(new Font("Dialog", Font.ITALIC, 20));
		lblNewLabel_1.setBounds(44, 12, 252, 16);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("CAT OS ");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.ITALIC, 14));
		lblNewLabel_1_1.setBounds(12, 40, 252, 16);
		contentPanel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Ver 1.0");
		lblNewLabel_1_1_1.setFont(new Font("Dialog", Font.ITALIC, 14));
		lblNewLabel_1_1_1.setBounds(12, 78, 252, 16);
		contentPanel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("@UPCSP Corporation");
		lblNewLabel_1_1_1_1.setFont(new Font("Dialog", Font.ITALIC, 14));
		lblNewLabel_1_1_1_1.setBounds(12, 124, 252, 16);
		contentPanel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("More updates coming soon");
		lblNewLabel_1_1_1_2.setFont(new Font("Dialog", Font.ITALIC, 14));
		lblNewLabel_1_1_1_2.setBounds(12, 165, 252, 16);
		contentPanel.add(lblNewLabel_1_1_1_2);
	}
}
