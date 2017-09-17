package Log_In;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuizGenerationByTeacher {
static String File_Nmae;
	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void Question_Type_Screen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizGenerationByTeacher window = new QuizGenerationByTeacher(File_Nmae);
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
	public QuizGenerationByTeacher(String name) {
		this.File_Nmae=name;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 575, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JCheckBox chckbxMultipleChoiceQuestion = new JCheckBox("Multiple Choice Question");
		buttonGroup.add(chckbxMultipleChoiceQuestion);
		chckbxMultipleChoiceQuestion.setBounds(51, 51, 153, 23);
		frame.getContentPane().add(chckbxMultipleChoiceQuestion);
		
		JCheckBox chckbxTruefalse = new JCheckBox("True/False");
		buttonGroup.add(chckbxTruefalse);
		chckbxTruefalse.setBounds(51, 90, 114, 23);
		frame.getContentPane().add(chckbxTruefalse);
		
		JCheckBox chckbxNumeric = new JCheckBox("Numeric");
		buttonGroup.add(chckbxNumeric);
		chckbxNumeric.setBounds(51, 127, 122, 23);
		frame.getContentPane().add(chckbxNumeric);
		
		JLabel lblSelectOneOf = new JLabel("Select one of the following options:");
		lblSelectOneOf.setBounds(51, 11, 227, 23);
		frame.getContentPane().add(lblSelectOneOf);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxMultipleChoiceQuestion.isSelected())
				{
					//New screen for option based mcqs
					 frame.dispose();
					Option_Based_Mcqs obj=new Option_Based_Mcqs(File_Nmae);
					obj.Write_option_based_mcq_screen();
				}
				else if(chckbxTruefalse.isSelected())
				{
					//New screen for True false based mcqs
					 frame.dispose();
					True_False_Based_Mcqs obj=new True_False_Based_Mcqs(File_Nmae);
					obj.Write_T_F_based_mcq_screen();
				}
				else if(chckbxNumeric.isSelected())
				{
					//New screen for numeric based mcqs
					 frame.dispose();
					Numeric_based_mcq obj=new Numeric_based_mcq(File_Nmae);
					obj.Write_Numeric_based_mcq_screen();
				}
			}
		});
		btnNext.setBounds(189, 163, 108, 23);
		frame.getContentPane().add(btnNext);
		
		JButton btnEndQuiz = new JButton("End Quiz");
		btnEndQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Created_Quizez obj=new Created_Quizez();
					obj.Display_Created_Quizez_to_Teacher();			}
		});
		btnEndQuiz.setBounds(307, 163, 108, 23);
		frame.getContentPane().add(btnEndQuiz);
	}
}
