package loginwin;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;

import Shutting_down.Shutdown;
import welcome.welcomeuser;

import javax.swing.border.BevelBorder;

public class LoadingMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField textField_1;
	 public static Clip clip;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
					LoadingMenu frame1 = new LoadingMenu();
					frame1.setVisible(true);
					frame1.setResizable(false);
					frame1. setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public LoadingMenu() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		setTitle("CAT_OS");
		LoadingMenu frame1 = this;
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 902);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\JAVA_OS\\src\\pics\\Add_a_heading__5_-removebg-preview.png"));
		lblNewLabel.setBounds(252, 73, 447, 312);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setBounds(384, 460, 437, 55);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 40));
		lblNewLabel_1.setBounds(265, 441, 109, 96);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JPasswordField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_1.setColumns(10);
		textField_1.setBounds(381, 568, 437, 55);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 40));
		lblNewLabel_1_1.setBounds(175, 546, 199, 96);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
		    private Clip clip;
		    public void actionPerformed(ActionEvent e) {
		        String name= textField.getText();
		        String pass = new String(textField_1.getPassword());
		        if (e.getSource()==btnNewButton) {
		            if (textField.getText().isEmpty() && new String(textField_1.getPassword()).isEmpty()) {
		                JOptionPane.showMessageDialog(null, "TextField is empty!", "Error", JOptionPane.ERROR_MESSAGE);
		                try {
		                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File("src/music/angry.wav"));
		                    clip = AudioSystem.getClip();
		                    clip.open(audioIn);
		                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
		                    ex.printStackTrace();
		                }
		                // play the audio file
		                clip.start();
		            
		            } 
		            if (name.equals("WenOS") && pass.equals("WenOS")) {
		                JOptionPane.showMessageDialog(null, "You Succesfully Login to your OS!", "Success", JOptionPane.INFORMATION_MESSAGE);
		                welcomeuser frameuser = null;
						try {
							frameuser = new welcomeuser();
							frameuser.setVisible(true);
							frameuser.setResizable(false);
							frame1.dispose();
						} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
								| UnsupportedLookAndFeelException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
		                // load the audio file
		                try {
		                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File("src/music/meow.wav"));
		                    clip = AudioSystem.getClip();
		                    clip.open(audioIn);
		                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
		                    ex.printStackTrace();
		                }
		                // play the audio file
		                clip.start();
		            } 
		            else {
		            	JOptionPane.showMessageDialog(null, "Incorrect Name and Password!", "Error", JOptionPane.ERROR_MESSAGE);
			        	try {
		                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File("src/music/angry.wav"));
		                    clip = AudioSystem.getClip();
		                    clip.open(audioIn);
		                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
		                    ex.printStackTrace();
		                }
		                // play the audio file
		                clip.start();
		            
			        
		            }
		        }
		    }
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 64, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton.setBounds(370, 686, 393, 96);
		contentPane.add(btnNewButton);
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setVisible(false);
		panel.setBackground(new Color(154, 205, 50));
		panel.setBounds(844, 394, 142, 306);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("DARK MODE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(new Color(18,18,18));
			}
		});
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		btnNewButton_2.setBounds(12, 46, 118, 26);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("VIOLET MODE");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(new Color(128, 0, 255));
			}
		});
		btnNewButton_2_1.setBackground(new Color(128, 0, 128));
		btnNewButton_2_1.setForeground(new Color(255, 255, 255));
		btnNewButton_2_1.setBounds(12, 96, 118, 26);
		panel.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("DARK BLUE ");
		btnNewButton_2_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2_2.setBackground(new Color(0, 0, 128));
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(new Color(0, 0, 128));
			}
		});
		btnNewButton_2_2.setBounds(12, 147, 118, 26);
		panel.add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("ORANGE THEME");
		btnNewButton_2_3.setFont(new Font("Dialog", Font.BOLD, 10));
		btnNewButton_2_3.setForeground(new Color(255, 255, 255));
		btnNewButton_2_3.setBackground(new Color(255, 128, 0));
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(new Color(255, 128, 0));
			}
		});
		btnNewButton_2_3.setBounds(12, 199, 118, 26);
		panel.add(btnNewButton_2_3);
		
		JButton btnNewButton_2_4 = new JButton("DEFAULT THEME");
		btnNewButton_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(new Color(128, 128, 255));
			}
		});
		btnNewButton_2_4.setBackground(new Color(128, 128, 255));
		btnNewButton_2_4.setForeground(new Color(255, 255, 255));
		btnNewButton_2_4.setFont(new Font("Dialog", Font.BOLD, 10));
		btnNewButton_2_4.setBounds(12, 250, 118, 26);
		panel.add(btnNewButton_2_4);
		
		JLabel lblNewLabel_2 = new JLabel("CHANGE THEME");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(24, 18, 106, 16);
		panel.add(lblNewLabel_2);
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("src/pics/power-off.png");
				int result = JOptionPane.showConfirmDialog(null, "Are you sure to Shutdown?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
				if (result == JOptionPane.YES_OPTION) {
					Shutdown frames = null;
					 
					try {
						try {
		                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File("src/music/shutdown.wav"));
		                    clip = AudioSystem.getClip();
		                    clip.open(audioIn);
		                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
		                    ex.printStackTrace();
		                }
		                // play the audio file
		                clip.start();
						frames = new Shutdown();
						frames.setVisible(true);
					    frame1.dispose();
					} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IOException
							| UnsupportedLookAndFeelException | InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				} else {
				    // User clicked "No" or closed the dialog
				}
			}
		});
		btnNewButton_1.setBackground(new Color(0, 128, 192));
		btnNewButton_1.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\JAVA_OS\\src\\pics\\power-off.png"));
		btnNewButton_1.setBounds(53, 708, 89, 84);
		contentPane.add(btnNewButton_1);
	
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\JAVA_OS\\src\\pics\\laughing.png"));
		
		btnNewButton_1_1.addActionListener(new ActionListener() {
			// set visible the panel
			boolean panelVisible = false;
		    public void actionPerformed(ActionEvent e) {
				// if it is false it will visible
		        if (panelVisible) {
		            panel.setVisible(false);
		            panelVisible = false;
		            
		        } 
		        //if it is visible it will visible false
		        else {
		            panel.setVisible(true);
		            panelVisible = true;
		        }
		    }
		});
		btnNewButton_1_1.setBackground(new Color(0, 128, 192));
		btnNewButton_1_1.setBounds(875, 698, 89, 84);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("CAT OS");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Britannic Bold", Font.ITALIC, 60));
		lblNewLabel_1_2.setBounds(384, 347, 225, 96);
		contentPane.add(lblNewLabel_1_2);
		
		
	}
}
