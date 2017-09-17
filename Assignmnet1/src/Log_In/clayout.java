package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
public class clayout {

	JFrame frame = new JFrame("CardLayout demo");
	JPanel panelCont = new JPanel();
	JPanel panelfirst = new JPanel();
	JPanel panelsecond = new JPanel();
	JButton buttonsecond = new JButton("Logout");
	CardLayout c1 = new CardLayout();
	
	
	// Login Syuff
	private static JTextField textField;
	private static JPasswordField pwdPassword;
	
	
	public clayout() {
		panelCont.setLayout(c1);
		
		panelsecond.add(buttonsecond);
		panelCont.add(panelfirst, "1");
		panelCont.add(panelsecond, "2");
		
		c1.show(panelCont, "1");
		
		
		buttonsecond.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				c1.show(panelCont, "1");
			}
		});
		
		LoadPanelOne(panelfirst);
		
		
		frame.setBounds(100, 100, 741, 501);	
		frame.add(panelCont);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new clayout();
			}
		});

	}
	
	private void LoadPanelOne(JPanel panel) {
		Label label = new Label("Quiz Generater");
		label.setAlignment(Label.CENTER);
		label.setFont(new Font("Dialog", Font.PLAIN, 39));
		label.setBounds(312, 86, 364, 103);
		panel.add(label);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUserName.setBounds(33, 73, 154, 41);
		panel.add(lblUserName);
		
		textField = new JTextField();
		textField.setBounds(33, 107, 184, 39);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(36, 156, 109, 41);
		panel.add(lblPassword);
		
		pwdPassword = new JPasswordField();
		
		pwdPassword.setBounds(40, 200, 200, 50);
		panel.add(pwdPassword);
		
		JButton btnNewButton = new JButton("Log in");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(33, 257, 109, 39);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				c1.show(panelCont, "2");
			}
		});
		panel.add(btnNewButton);
		
		try {
			ReadUsers r = new ReadUsers();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
