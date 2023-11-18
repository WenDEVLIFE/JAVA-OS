package POWERED_BY;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import loginwin.LoadingMenu;

import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.util.List;

public class POWERED_BY extends JFrame {

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
					POWERED_BY framed = new POWERED_BY();
					framed.setVisible(true);
					framed.setResizable(false);
					framed.setLocationRelativeTo(null);
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
	public POWERED_BY() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		setBounds(100, 100, 1024, 900);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	    progressBar = new JProgressBar(0, 100);
		progressBar.setForeground(new Color(0, 128, 0));
		progressBar.setBackground(Color.WHITE);
		progressBar.setBounds(135, 612, 692, 90);
		contentPane.add(progressBar);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\JAVA_OS\\src\\pics\\java.png"));
		lblNewLabel.setBounds(260, 94, 425, 494);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("POWERED BY");
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 40));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(196, 117, 237, 129);
		contentPane.add(lblNewLabel_1);
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
						LoadingMenu frame1 = new LoadingMenu();
						frame1.setVisible(true);
						frame1.setResizable(false);
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
