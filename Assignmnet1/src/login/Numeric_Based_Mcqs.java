package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Numeric_Based_Mcqs {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void Write_Numeric_based_mcq_screen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Numeric_Based_Mcqs window = new Numeric_Based_Mcqs();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Numeric_Based_Mcqs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 570, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(45, 27, 456, 153);
		frame.getContentPane().add(textPane);
		
		JLabel lblEnterTheMcq = new JLabel("Enter the MCQ.");
		lblEnterTheMcq.setBounds(45, 11, 100, 14);
		frame.getContentPane().add(lblEnterTheMcq);
		
		textField = new JTextField();
		textField.setBounds(45, 200, 275, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(45, 231, 275, 37);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
}
