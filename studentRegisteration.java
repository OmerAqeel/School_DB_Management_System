import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class studentRegisteration {

	private JFrame frmRegistrationForm;
	private static JTextField fName;
	private static JTextField Lname;
	private static JTextField passportNo;
	private static JTextField course;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentRegisteration window = new studentRegisteration();
					window.frmRegistrationForm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public studentRegisteration() {
		initialize();
	}

	public static void open()
	{
		studentRegisteration window = new studentRegisteration();
		window.frmRegistrationForm.setVisible(true);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistrationForm = new JFrame();
		frmRegistrationForm.setTitle("Register");
		frmRegistrationForm.setBounds(100, 100, 570, 433);
		frmRegistrationForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistrationForm.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration Form");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel.setBounds(203, 6, 188, 16);
		frmRegistrationForm.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First name");
		lblNewLabel_1.setBounds(6, 34, 66, 16);
		frmRegistrationForm.getContentPane().add(lblNewLabel_1);
		
		fName = new JTextField();
		fName.setBounds(84, 29, 130, 26);
		frmRegistrationForm.getContentPane().add(fName);
		fName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Last name");
		lblNewLabel_2.setBounds(242, 34, 76, 16);
		frmRegistrationForm.getContentPane().add(lblNewLabel_2);
		
		Lname = new JTextField();
		Lname.setBounds(330, 29, 171, 26);
		frmRegistrationForm.getContentPane().add(Lname);
		Lname.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Passport No.");
		lblNewLabel_3.setBounds(6, 77, 80, 16);
		frmRegistrationForm.getContentPane().add(lblNewLabel_3);
		
		passportNo = new JTextField();
		passportNo.setBounds(84, 72, 130, 26);
		frmRegistrationForm.getContentPane().add(passportNo);
		passportNo.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Course");
		lblNewLabel_4.setBounds(242, 77, 61, 16);
		frmRegistrationForm.getContentPane().add(lblNewLabel_4);
		
		course = new JTextField();
		course.setBounds(330, 72, 171, 26);
		frmRegistrationForm.getContentPane().add(course);
		course.setColumns(10);
		
		btnNewButton = new JButton("back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmRegistrationForm.dispose();
				studentHandlePage.open();
			}
		});
		btnNewButton.setBounds(0, 1, 117, 21);
		frmRegistrationForm.getContentPane().add(btnNewButton);
	}
	
	public static String getFirstName() 
	{
		return fName.getText();
	}
	

}
