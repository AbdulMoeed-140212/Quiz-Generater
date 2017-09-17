package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Label;

public class MainWindow {

	private static JFrame frame;
	private static JTextField textField;
	private static JPasswordField pwdPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 741, 501);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUserName.setBounds(33, 73, 154, 41);
		frame.getContentPane().add(lblUserName);
		
		textField = new JTextField();
		textField.setBounds(33, 107, 184, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(36, 156, 109, 41);
		frame.getContentPane().add(lblPassword);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setBounds(33, 197, 184, 39);
		frame.getContentPane().add(pwdPassword);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(281, 73, 1, 330);
		frame.getContentPane().add(separator);
		
		JButton btnNewButton = new JButton("Log in");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(33, 257, 109, 39);
		btnNewButton.addActionListener(new ActionListener() 
				{ 
					public void actionPerformed(ActionEvent e) 
					{ 
						if(login())
						{
							
							
						}

					} 
				}
			);
		frame.getContentPane().add(btnNewButton);
		
		Label label = new Label("Quiz Generater");
		label.setAlignment(Label.CENTER);
		label.setFont(new Font("Dialog", Font.PLAIN, 39));
		label.setBounds(312, 86, 364, 103);
		frame.getContentPane().add(label);
	}
	public static boolean login() {
		System.out.println(textField.getText());
		System.out.println(pwdPassword.getPassword());
		if(textField.getText().equals("AMB")  && String.valueOf(pwdPassword.getPassword()).equals("1234"))
		{
			System.out.println("Ypiiiiiiii!");
			return true;
		}
		else
		{
			System.out.println("Nipi");
			return false;
		}
		
		
	}
}
