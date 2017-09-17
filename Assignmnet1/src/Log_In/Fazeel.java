package Log_In;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;

public class Fazeel {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private ReadUsers obj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fazeel window = new Fazeel();
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
	public Fazeel() {
		try {
			 obj=new ReadUsers();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		
		textField = new JTextField();
		textField.setBounds(157, 67, 194, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblWelcomeToQuiz = new JLabel("Quiz Generator");
		lblWelcomeToQuiz.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 20));
		lblWelcomeToQuiz.setBounds(157, 11, 316, 45);
		frame.getContentPane().add(lblWelcomeToQuiz);
		
		JLabel lblEnterUsername = new JLabel("Enter Username");
		lblEnterUsername.setBounds(33, 78, 107, 14);
		frame.getContentPane().add(lblEnterUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(62, 144, 78, 14);
		frame.getContentPane().add(lblPassword);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
		
					for(int i=0;i<obj.users.size();i++)
					{
						if(obj.users.get(i).getName().equals(textField.getText()))
						{
							if(obj.users.get(i).checkPwd(String.copyValueOf(passwordField.getPassword())))
							{
								System.out.println("Warr gye");
								  frame.dispose();
								 //  if(rdbtnTeacher.isSelected())
								 //  {
								   Created_Quizez title_description = new Created_Quizez(obj.users.get(i).getRole());
								   title_description.Display_Created_Quizez_to_Teacher();
								  // }
								break;
							}
						}
					}
				
				
				
			 
			}
		});
		btnLogIn.setBounds(206, 186, 89, 23);
		frame.getContentPane().add(btnLogIn);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(157, 126, 194, 32);
		frame.getContentPane().add(passwordField);
	}
}
