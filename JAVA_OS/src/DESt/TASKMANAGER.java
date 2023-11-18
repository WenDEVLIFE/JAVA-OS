package DESt;

import java.awt.BorderLayout;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;


public class TASKMANAGER extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	public static JLabel lblRamUsed;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TASKMANAGER dialogt = new TASKMANAGER();
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			dialogt.toFront();
			dialogt.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
			dialogt.setVisible(true);
			dialogt.setVisible(true);
			
			startTimer();
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
	public TASKMANAGER() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		setTitle("TASK MANAGER");
		setClosable(true);
        setResizable(true);
        setMaximizable(true);
        setIconifiable(true);
		setFrameIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\JAVA_OS\\src\\pics\\task.png"));
		TASKMANAGER dialogt = this;
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		
		setBounds(100, 100, 732, 564);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(0, 64, 128));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TASK MANAGER");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 30));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(12, 0, 298, 76);
		contentPanel.add(lblNewLabel);
		
	

	

		JLabel lblCpu = new JLabel("CPU: AMD A10-9700");
		lblCpu.setForeground(Color.WHITE);
		lblCpu.setFont(new Font("Dialog", Font.BOLD, 20));
		lblCpu.setBounds(27, 102, 358, 76);
		contentPanel.add(lblCpu);
		
		JLabel lblGpu = new JLabel("GPU: RX 570 series");
		lblGpu.setForeground(Color.WHITE);
		lblGpu.setFont(new Font("Dialog", Font.BOLD, 20));
		lblGpu.setBounds(27, 190, 358, 76);
		contentPanel.add(lblGpu);
		
		JLabel lblRam = new JLabel("RAM: 8GB DD4 2400MHZ");
		lblRam.setForeground(Color.WHITE);
		lblRam.setFont(new Font("Dialog", Font.BOLD, 20));
		lblRam.setBounds(27, 278, 358, 76);
		
		contentPanel.add(lblRam);
		
		lblRamUsed = new JLabel("RAM USED:");
		
		lblRamUsed.setForeground(Color.WHITE);
		lblRamUsed.setFont(new Font("Dialog", Font.BOLD, 20));
		lblRamUsed.setBounds(27, 366, 358, 76);
		contentPanel.add(lblRamUsed);
		
		// Define the query to get the GPU clock speed
	
		
		JLabel cputemp = new JLabel("CPU TEMP:n/a");
		cputemp.setForeground(Color.WHITE);
		cputemp.setFont(new Font("Dialog", Font.BOLD, 20));
		cputemp.setBounds(279, 102, 358, 76);
		contentPanel.add(cputemp);
		
		JButton btnNewButton = new JButton("CLOSE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialogt.dispose();
			}
		});
		btnNewButton.setBounds(451, 462, 186, 51);
		contentPanel.add(btnNewButton);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialogt.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialogt.setVisible(true);
				
				startTimer();
				
			}
		});
		btnUpdate.setBounds(228, 462, 186, 51);
		contentPanel.add(btnUpdate);
	}
	public  static  void startTimer() {
        Timer timer = new Timer(1000, (ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Update the value of the label
                MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
                MemoryUsage usage = memoryBean.getHeapMemoryUsage();
                long usedMemory = usage.getUsed() / (1024 * 1024); // in MB
                lblRamUsed.setText("RAM USED: " + usedMemory + "MB");
            }
        });
        timer.start();
    }

}
