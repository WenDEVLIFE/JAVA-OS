package DESt;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

import SETTINGS.Settings;
import Shutting_down.Shutdown;
import note.NOTEPAD;
import restart.RESTART;

import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class DESKTOP extends JFrame {

	public static int WIDTH=1024;
	public static int HEIGHT=900;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static Clip clip;
    public static JLabel lblChangeWallpaper;
	
	//Default is last or third layer
    public static JButton btnNewButton_2;
    public static JLabel lblNewLabel_2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
					DESKTOP frameDES = new DESKTOP();
					frameDES.setVisible(true);
					frameDES. setLocationRelativeTo(null);
					frameDES.setResizable(false);
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
	public DESKTOP() throws Exception {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JAVA_ECLIPSE\\JAVA_OS\\src\\pics\\vm-icon-23.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 901);
		DESKTOP frameDES = this;
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setVisible(false);
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(new Color(128, 128, 128));
		panel_1.setBounds(0, 601, 149, 183);
		
		contentPane.add(panel_1);
		panel_1.setLayout(null);
	
		JButton btnNewButton_1_1 = new JButton("RESTART");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File("src/music/shutdown.wav"));
                    clip = AudioSystem.getClip();
                    clip.open(audioIn);
                    RESTART framesh = null;
					try {
						framesh = new RESTART();
						framesh.setVisible(true);
						framesh.setLocationRelativeTo(null);
						framesh.setResizable(false);
						frameDES.dispose();
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
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
                    ex.printStackTrace();
                }
                // play the audio file
                clip.start();
			}
		});
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setBackground(new Color(0, 128, 192));
		btnNewButton_1_1.setBounds(12, 129, 125, 34);
		panel_1.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("SHUTDOWN");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Shutdown frames = new Shutdown();
					frames.setVisible(true);
					frames.setLocationRelativeTo(null);
					frames.setResizable(false);
					frameDES.dispose();
                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File("src/music/shutdown.wav"));
                    clip = AudioSystem.getClip();
                    clip.open(audioIn);
                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
                    ex.printStackTrace();
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
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                // play the audio file
                clip.start();
			
			}
		});
		btnNewButton_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1.setBackground(new Color(0, 128, 192));
		btnNewButton_1_1_1.setBounds(12, 77, 125, 34);
		panel_1.add(btnNewButton_1_1_1);
		
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(0, 774, 1008, 88);
		
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("START");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\JAVA_OS\\src\\pics\\laughing.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			boolean panelVisible = false;
			public void actionPerformed(ActionEvent e) {
				
			    
					// if it is false it will visible
			        if (panelVisible) {
			            panel_1.setVisible(false);
			            panelVisible = false;
			            
			        } 
			        //if it is visible it will visible false
			        else {
			            panel_1.setVisible(true);
			            panelVisible = true;
			        }
			    }
			
			
		});
		btnNewButton_1.setBackground(new Color(0, 128, 192));
		btnNewButton_1.setBounds(0, 12, 140, 67);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\JAVA_OS\\src\\pics\\wifi.png"));
		lblNewLabel_1.setBounds(952, 24, 44, 41);
		panel.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setVisible(false);
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(new Color(128, 128, 128));
		panel_2.setBounds(812, 523, 97, 271);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		JButton btnNewButton_2_1 = new JButton("");
		btnNewButton_2_1.addActionListener(new ActionListener() {
		
				boolean panelVisible = false;
				public void actionPerformed(ActionEvent e) {
					
				    
						// if it is false it will visible
				        if (panelVisible) {
				        	panel_2.setVisible(false);
				            panelVisible = false;
				            
				        } 
				        //if it is visible it will visible false
				        else {
				        	panel_2.setVisible(true);
				            panelVisible = true;
				        }
				    }
				
				
			});
		
		
		btnNewButton_2_1.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\JAVA_OS\\src\\pics\\sound.png"));
		btnNewButton_2_1.setOpaque(false);
		btnNewButton_2_1.setContentAreaFilled(false);
		btnNewButton_2_1.setBorderPainted(false);
		btnNewButton_2_1.setBounds(798, 5, 116, 74);
		panel.add(btnNewButton_2_1);
		
		
		
		JLabel lblNewLabel = new JLabel("NOTEPAD");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Franklin Gothic Demi", Font.ITALIC, 12));
		lblNewLabel.setBounds(63, 130, 66, 16);
		contentPane.add(lblNewLabel);
		
	
	
		
		JLabel lblChangeWallpaper = new JLabel("TERMINAL");
		lblChangeWallpaper.setForeground(new Color(255, 255, 255));
		lblChangeWallpaper.setFont(new Font("Franklin Gothic Demi", Font.ITALIC, 12));
		lblChangeWallpaper.setBounds(189, 130, 116, 16);
		contentPane.add(lblChangeWallpaper);
		
		
		
		JSlider slider = new JSlider();
		slider.setBackground(new Color(128, 128, 128));
		slider.setOrientation(SwingConstants.VERTICAL);
		slider.setBounds(12, 31, 73, 217);
		panel_2.add(slider);
		Mixer.Info[] mixerInfos = AudioSystem.getMixerInfo();
		Mixer mixer = null;
		for (Mixer.Info info : mixerInfos) {
		    if (info.getName().equals("Master") || info.getName().equals("Speakers")) {
		        mixer = AudioSystem.getMixer(info);
		        break;
		    }
		}
		if (mixer != null) {
		    try {
		        mixer.open();
		        Line line = mixer.getLine(mixer.getTargetLineInfo()[0]);
		        line.open();
		        FloatControl control = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
		        control.getValue();
		        // Set the volume to 50%
		        control.setValue(control.getMinimum() + (control.getMaximum() - control.getMinimum()) * 0.5f);
		        line.close();
		    } catch (LineUnavailableException e) {
		        e.printStackTrace();
		    }
		}
		
		JLabel lblVolume = new JLabel("VOLUME");
		lblVolume.setForeground(new Color(255, 255, 255));
		lblVolume.setFont(new Font("Franklin Gothic Demi", Font.ITALIC, 12));
		lblVolume.setBounds(19, 12, 66, 16);
		panel_2.add(lblVolume);
		
		
		
		JLabel lblTaskManager = new JLabel("TASK MANAGER");
		lblTaskManager.setForeground(new Color(255, 255, 255));
		lblTaskManager.setFont(new Font("Franklin Gothic Demi", Font.ITALIC, 12));
		lblTaskManager.setBounds(324, 129, 116, 16);
		contentPane.add(lblTaskManager);
		JButton btnNewButton = new JButton("");
		btnNewButton.setOpaque(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		ImageIcon icon = new ImageIcon("C:\\JAVA_ECLIPSE\\JAVA_OS\\src\\pics\\content-creator.png");
		btnNewButton.setIcon(icon);
		
		JButton btnNewButton_2_2 = new JButton("");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				try {
					TASKMANAGER dialogt = new TASKMANAGER();
					dialogt.toFront();
				
					dialogt.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
					dialogt.setVisible(true);
					frameDES.getContentPane().add(dialogt);
					
					JLayeredPane layers = new JLayeredPane();
					// we get the frame width and its height
					layers.setBounds(0, 0, frameDES.getWidth(), frameDES.getHeight());
					layers.add(btnNewButton, JLayeredPane.PALETTE_LAYER);
					
					// Palette 2nd layer 
					layers.add(lblChangeWallpaper, JLayeredPane.PALETTE_LAYER);
					
					//Default is last or third layer
					layers.add(btnNewButton_2, JLayeredPane.PALETTE_LAYER);
					layers.add(btnNewButton_2_2, JLayeredPane.PALETTE_LAYER);
					layers.add(lblTaskManager, JLayeredPane.PALETTE_LAYER);
					layers.add(lblNewLabel, JLayeredPane.PALETTE_LAYER);
					layers.add(lblNewLabel_2, JLayeredPane.DEFAULT_LAYER);
					
					contentPane.add(layers);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_2_2.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\JAVA_OS\\src\\pics\\task.png"));
		btnNewButton_2_2.setOpaque(false);
		btnNewButton_2_2.setContentAreaFilled(false);
		btnNewButton_2_2.setBorderPainted(false);
		btnNewButton_2_2.setBounds(314, 55, 116, 74);
		contentPane.add(btnNewButton_2_2);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==btnNewButton) {
					JLayeredPane layers = new JLayeredPane();
					// we get the frame width and its height
					layers.setBounds(0, 0, frameDES.getWidth(), frameDES.getHeight());
					layers.add(btnNewButton, JLayeredPane.PALETTE_LAYER);
					
					// Palette 2nd layer 
					layers.add(lblChangeWallpaper, JLayeredPane.PALETTE_LAYER);
					//Default is last or third layer
					layers.add(btnNewButton_2, JLayeredPane.PALETTE_LAYER);
					layers.add(btnNewButton_2_2, JLayeredPane.PALETTE_LAYER);
					layers.add(lblTaskManager, JLayeredPane.PALETTE_LAYER);
					layers.add(lblNewLabel, JLayeredPane.PALETTE_LAYER);
					layers.add(lblNewLabel_2, JLayeredPane.DEFAULT_LAYER);
						try {
							NOTEPAD dialog1 = new NOTEPAD();
							// Modal first layer
							
							dialog1.setResizable(false);
							
							
							dialog1.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
							dialog1.setVisible(true);
							dialog1.toFront();
							
							
							layers.add(dialog1, JLayeredPane.MODAL_LAYER);
							
							
							frameDES.getContentPane().add(dialog1);
							
							
							contentPane.add(layers);
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					
				}

				
				
			}
		});
		JButton btnNewButton_1_1_1_1_1 = new JButton("SETTINGS");
		btnNewButton_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Settings dialogs1 = new Settings();
					dialogs1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialogs1.setVisible(true);
					dialogs1.setLocationRelativeTo(null);
					dialogs1.setModal(true);
				} catch (Exception e1)  {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				

			}
		});
		btnNewButton_1_1_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1_1_1.setBackground(new Color(0, 128, 192));
		btnNewButton_1_1_1_1_1.setBounds(12, 25, 125, 34);
		panel_1.add(btnNewButton_1_1_1_1_1);
		btnNewButton.setBounds(29, 55, 116, 74);
		contentPane.add(btnNewButton);
		btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLayeredPane layers = new JLayeredPane();
				// we get the frame width and its height
				layers.setBounds(0, 0, frameDES.getWidth(), frameDES.getHeight());
				layers.add(btnNewButton, JLayeredPane.PALETTE_LAYER);
				
				// Palette 2nd layer 
				layers.add(lblChangeWallpaper, JLayeredPane.PALETTE_LAYER);
				
				//Default is last or third layer
				layers.add(btnNewButton_2, JLayeredPane.PALETTE_LAYER);
				layers.add(btnNewButton_2_2, JLayeredPane.PALETTE_LAYER);
				layers.add(lblTaskManager, JLayeredPane.PALETTE_LAYER);
				layers.add(lblNewLabel, JLayeredPane.PALETTE_LAYER);
				layers.add(lblNewLabel_2, JLayeredPane.DEFAULT_LAYER);
				
				Terminal frames;
				try {
					frames = new Terminal();
					// Modal first layer
					layers.add(frames, JLayeredPane.MODAL_LAYER);
					frames.setResizable(false);
					
					
					frames.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
					frames.setVisible(true);
					frames.toFront();
					
					frameDES.getContentPane().add(frames);
					
					
					contentPane.add(layers);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\JAVA_OS\\src\\pics\\terminal.png"));
		btnNewButton_2.setOpaque(false);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBounds(160, 55, 116, 74);
		contentPane.add(btnNewButton_2);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\JAVA_OS\\src\\pics\\cat_winter_fluffy_99366_1920x1080.jpg"));
		lblNewLabel_2.setBounds(-320, -43, 1328, 827);
		contentPane.add(lblNewLabel_2);
		
	
	
	}
}
