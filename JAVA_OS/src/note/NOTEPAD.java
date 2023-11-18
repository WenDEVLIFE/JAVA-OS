package note;

import javax.swing.JInternalFrame;


import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;
import javax.swing.text.StyledDocument;

import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class NOTEPAD extends JInternalFrame {

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
			

			NOTEPAD dialog1 = new NOTEPAD();
			dialog1.setResizable(false);
			dialog1.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
			dialog1.setVisible(true);
			dialog1.setLocation(null);
			dialog1.toFront();
		   
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 * @return 
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public NOTEPAD() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		setClosable(true);
        setResizable(true);
        setMaximizable(true);
        setIconifiable(true);
		setFrameIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\JAVA_OS\\src\\pics\\content-creator.png"));
		setTitle("NOTEPAD");
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		
		setBounds(100, 100, 568, 580);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 552, 22);
		contentPanel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("FILE");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("SAVE");
		mnNewMenu.add(mnNewMenu_1);

		
		 JTextPane textPane = new JTextPane();
	     JScrollPane scrollPane = new JScrollPane(textPane);
	     scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	     scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	     scrollPane.setBounds(0, 22, 552, 507);
	        
	        contentPanel.add(scrollPane);

		
		

		// Add the scroll pane to the content panel
		
		
		
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("SAVE AS");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
			      int result = fileChooser.showSaveDialog(NOTEPAD.this);
			      if (result == JFileChooser.APPROVE_OPTION) {
			         File selectedFile = fileChooser.getSelectedFile();
			         try {
			        	 UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			            StyledDocument doc = textPane.getStyledDocument();
			            FileWriter writer = new FileWriter(selectedFile);
			            writer.write(doc.getText(0, doc.getLength()));
			            writer.close();
			         } catch (Exception e1) {
			            e1.printStackTrace();
			         }
			      
			}
			
			}
		});
		
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_2 = new JMenu("NEW FILE");
		mnNewMenu.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("file");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText("");
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_3 = new JMenu("FORMAT");
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu_4 = new JMenu("FONT");
		mnNewMenu_3.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Calibri");
		mntmNewMenuItem_3.setFont(new Font("Calibri", Font.BOLD, 12));
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setFont(new Font("Calibri", Font.BOLD, 12));
			}
		});
		mnNewMenu_4.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("ARIAL");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setFont(new Font("Arial", Font.BOLD, 12));
			}
		});
		mnNewMenu_4.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_5 = new JMenu("HELP");
		menuBar.add(mnNewMenu_5);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("ABOUT NOTEPAD");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ABOUT_NOTEPAD dialogb = null;
				try {
					dialogb = new ABOUT_NOTEPAD();
					dialogb.setModal(true);
					
		            dialogb.setLocationRelativeTo(null);
					dialogb.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialogb.setVisible(true);
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	            
			}
		});
		mnNewMenu_5.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("VIEW HELP");
		mnNewMenu_5.add(mntmNewMenuItem_4);
		
		
		
		
	}
}
