package DESt;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Terminal extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 private JTextArea outputArea;
	    private JTextField inputField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
					Terminal frames = new Terminal();
					frames.setVisible(true);
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
	public Terminal() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		setFrameIcon(new ImageIcon("C:\\JAVA_ECLIPSE\\JAVA_OS\\src\\pics\\terminal.png"));
		setTitle("TERMINAL");
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		setClosable(true);
        setResizable(true);
        setMaximizable(true);
        setIconifiable(true);
		setBounds(100, 100, 599, 507);
		 

	        // Set up the output area
	        outputArea = new JTextArea(20, 50);
	        outputArea.setForeground(new Color(0, 128, 64));
	        outputArea.setBackground(new Color(0, 0, 0));
	        outputArea.setEditable(false);
	        JScrollPane scrollPane = new JScrollPane(outputArea);

	        // Set up the input field
	        inputField = new JTextField(50);
	        inputField.setText("Type a command");
	        inputField.setForeground(new Color(0, 128, 64));
	        inputField.setBackground(new Color(0, 0, 0));
	        inputField.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                String input = inputField.getText();
	                outputArea.append("> " + input + "\n");
	                processInput(input);
	                inputField.setText("Type a command");
	            }
	        });

	        // Add the components to the content pane
	        Container contentPane = getContentPane();
	        contentPane.add(scrollPane, BorderLayout.CENTER);
	        contentPane.add(inputField, BorderLayout.SOUTH);

	        // Set the size and make the frame visible
	        pack();
	       
	        setVisible(true);
	    }

	    private void processInput(String input) {
	        // This is where you would handle the user input and produce output
	        // For example, you could use a switch statement to handle different commands
	        // and call methods to produce output in the output area.
	        // In this example, we'll just echo the input back to the user.

	        outputArea.append("< " + input + "\n");
	    }
	 
}
