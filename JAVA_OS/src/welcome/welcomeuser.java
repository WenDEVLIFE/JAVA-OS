package welcome;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DESt.DESKTOP;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.util.List;

import javax.swing.JProgressBar;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.Toolkit;

public class welcomeuser extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JProgressBar progressBar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
					welcomeuser frameuser = new welcomeuser();
					frameuser. setLocationRelativeTo(null);
					frameuser.setVisible(true);
					frameuser.setResizable(false);
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
	public welcomeuser() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JAVA_ECLIPSE\\JAVA_OS\\src\\pics\\vm-icon-23.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 900);
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblcatuser = new JLabel("@CAT_USER");
		lblcatuser.setForeground(new Color(255, 255, 255));
		lblcatuser.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblcatuser.setBounds(315, 424, 344, 158);
		contentPane.add(lblcatuser);
		
		progressBar = new JProgressBar(0, 100);
		progressBar.setForeground(new Color(0, 128, 0));
		progressBar.setBackground(Color.WHITE);
		progressBar.setBounds(148, 615, 692, 90);
		contentPane.add(progressBar);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\JAVA_OS\\src\\pics\\user (1).png"));
		lblNewLabel_1.setBounds(348, 194, 277, 256);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("WELCOME");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblNewLabel.setBounds(348, 61, 344, 158);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\JAVA_OS\\src\\pics\\domesticated-gray-cat-playing-grassy-lawn-beautiful-day.jpg"));
		label.setBounds(0, 0, 1008, 861);
		contentPane.add(label);
		fill();
	}
	public void fill() {
		// we use swing worker to make the animation works
	    SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
	        protected Void doInBackground() throws Exception {
	            for (int i = 0; i <= 100; i++) {
	                publish(i);
	                Thread.sleep(30);
	            }
	            return null;
	        }

	        @Override
	        protected void process(List<Integer> chunks) {
	            int value = chunks.get(chunks.size() - 1);
	            progressBar.setValue(value);
	        }

	        protected void done() {
	            progressBar.setValue(0);
	           
				try {
					DESKTOP frameDES = new DESKTOP();
					frameDES.setVisible(true);
					frameDES.setResizable(false);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
	            dispose();
	        }
	    };

	    worker.execute();
	
	}

}
