package Shutting_down;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import SHUTDOWNend.turn_off;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Font;
import java.io.IOException;
import java.util.List;

public class Shutdown extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JProgressBar progressBar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
					Shutdown frames = new Shutdown();
					frames.setVisible(true);
					frames.setLocationRelativeTo(null);
					frames.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IOException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public Shutdown() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException, UnsupportedLookAndFeelException, InterruptedException {
		setTitle("CAT_OS");
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 900);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		progressBar = new JProgressBar(0, 100);
		progressBar.setBackground(new Color(255, 255, 255));
		progressBar.setForeground(new Color(0, 128, 0));
		progressBar.setBounds(173, 621, 692, 90);
		contentPane.add(progressBar);
		
		
		
		
		JLabel lblNewLabel_2 = new JLabel("SHUTTING DOWN");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(431, 325, 199, 48);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\JAVA_OS\\src\\pics\\Loading_2.gif"));
		lblNewLabel_1_2.setBounds(420, 384, 232, 226);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\JAVA_OS\\src\\pics\\kitty.png"));
		lblNewLabel_1.setBounds(500, 214, 64, 110);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\JAVA_OS\\src\\pics\\paul-volkmer-qVotvbsuM_c-unsplash.jpg"));
		lblNewLabel.setBounds(0, 0, 1008, 861);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setBounds(285, 255, 46, 14);
		contentPane.add(label);
		
	// program will shutdown 
    // you need this code 
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
	            turn_off framen = null;
				try {
					framen = new turn_off();
					framen.setVisible(true);
					framen.setResizable(false);
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	            dispose();
	        }
	    };

	    worker.execute();
	}
	
	
}
