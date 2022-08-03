import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class loginGUI implements ActionListener {

	public JFrame frmSchoolManagmentSystem;
	public JTextField username;
	public JTextField password;
	public JButton btnLogin;

	public String user = "admin";
	public String pass = "admin";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginGUI window = new loginGUI();
					window.frmSchoolManagmentSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public loginGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmSchoolManagmentSystem = new JFrame();
		frmSchoolManagmentSystem.setTitle("School Managment System");
		frmSchoolManagmentSystem.setBounds(100, 100, 450, 300);
		frmSchoolManagmentSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSchoolManagmentSystem.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Login");
		lblNewLabel.setBounds(185, 6, 80, 16);
		frmSchoolManagmentSystem.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("username");
		lblNewLabel_1.setBounds(73, 90, 61, 16);
		frmSchoolManagmentSystem.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("password");
		lblNewLabel_2.setBounds(73, 139, 61, 16);
		frmSchoolManagmentSystem.getContentPane().add(lblNewLabel_2);
		
		username = new JTextField();
		username.setBounds(146, 85, 185, 26);
		frmSchoolManagmentSystem.getContentPane().add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setBounds(146, 134, 185, 26);
		frmSchoolManagmentSystem.getContentPane().add(password);
		password.setColumns(10);
		
		btnLogin = new JButton("login");
		btnLogin.setBounds(173, 172, 117, 29);
		frmSchoolManagmentSystem.getContentPane().add(btnLogin);
		btnLogin.addActionListener(this);
		
	
	
}

	//Button clicked
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == btnLogin)
		{
			
			//Only the admin should be able to log into the application
			if(username.getText().equals(user) && password.getText().equals(pass)) {
				homePage home = new homePage();
				home.open();
				frmSchoolManagmentSystem.dispose();		//Closes the current window
			}
			else
			{
				JOptionPane.showMessageDialog(frmSchoolManagmentSystem, "Wrong password or username, Please enter again.");
				username.setText("");
				password.setText("");
			}
			
			
			
		}
		
	}
}
