import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class homePage {

	public JFrame frmHome;
	public JLabel lblNewLabel;
	public JLabel lblNewLabel_1;
	public JLabel lblNewLabel_2;
	public JLabel lblNewLabel_3;
	public JLabel lblNewLabel_4;
	public JButton studentBtn;
	public JButton teacherBtn;
	public JLabel lblNewLabel_5;
	public JLabel lblNewLabel_5_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homePage window = new homePage();
					window.frmHome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void open()
	{
		homePage window = new homePage();
		window.frmHome.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public homePage() {
		frmHome = new JFrame();
		frmHome.setTitle("Home");
		frmHome.setBounds(100, 100, 450, 300);
		frmHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHome.getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Home Page");
		lblNewLabel.setBounds(177, 6, 119, 16);
		frmHome.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("This Application is used to store the data of students and the teachers.");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(16, 39, 428, 24);
		frmHome.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel(" The application is able to register, update and delete the data ");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(16, 61, 320, 16);
		frmHome.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("for any pupose.");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblNewLabel_3.setBounds(325, 61, 82, 16);
		frmHome.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Please select:");
		lblNewLabel_4.setBounds(16, 100, 119, 16);
		frmHome.getContentPane().add(lblNewLabel_4);
		
		studentBtn = new JButton("Students");
		studentBtn.setBounds(16, 149, 117, 29);
		frmHome.getContentPane().add(studentBtn);
		
		teacherBtn = new JButton("Teachers");
		teacherBtn.setBounds(16, 212, 117, 29);
		frmHome.getContentPane().add(teacherBtn);
		
		lblNewLabel_5 = new JLabel("Click for entering, updating or deleting student data");
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblNewLabel_5.setBounds(134, 155, 273, 16);
		frmHome.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_5_1 = new JLabel("Click for entering, updating or deleting teacher data");
		lblNewLabel_5_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblNewLabel_5_1.setBounds(134, 217, 273, 16);
		frmHome.getContentPane().add(lblNewLabel_5_1);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
//		frmHome = new JFrame();
//		frmHome.setTitle("Home");
//		frmHome.setBounds(100, 100, 450, 300);
//		frmHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frmHome.getContentPane().setLayout(null);
//		
//		JLabel lblNewLabel = new JLabel("Home Page");
//		lblNewLabel.setBounds(177, 6, 119, 16);
//		frmHome.getContentPane().add(lblNewLabel);
//		
//		JLabel lblNewLabel_1 = new JLabel("This Application is used to store the data of students and the teachers.");
//		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
//		lblNewLabel_1.setBounds(16, 39, 428, 24);
//		frmHome.getContentPane().add(lblNewLabel_1);
//		
//		JLabel lblNewLabel_2 = new JLabel(" The application is able to register, update and delete the data ");
//		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
//		lblNewLabel_2.setBounds(16, 61, 320, 16);
//		frmHome.getContentPane().add(lblNewLabel_2);
//		
//		JLabel lblNewLabel_3 = new JLabel("for any pupose.");
//		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
//		lblNewLabel_3.setBounds(325, 61, 82, 16);
//		frmHome.getContentPane().add(lblNewLabel_3);
//		
//		JLabel lblNewLabel_4 = new JLabel("Please select:");
//		lblNewLabel_4.setBounds(16, 100, 119, 16);
//		frmHome.getContentPane().add(lblNewLabel_4);
//		
//		JButton studentBtn = new JButton("Students");
//		studentBtn.setBounds(16, 149, 117, 29);
//		frmHome.getContentPane().add(studentBtn);
//		
//		JButton teacherBtn = new JButton("Teachers");
//		teacherBtn.setBounds(16, 212, 117, 29);
//		frmHome.getContentPane().add(teacherBtn);
//		
//		JLabel lblNewLabel_5 = new JLabel("Click for entering, updating or deleting student data");
//		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
//		lblNewLabel_5.setBounds(134, 155, 273, 16);
//		frmHome.getContentPane().add(lblNewLabel_5);
//		
//		JLabel lblNewLabel_5_1 = new JLabel("Click for entering, updating or deleting teacher data");
//		lblNewLabel_5_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
//		lblNewLabel_5_1.setBounds(134, 217, 273, 16);
//		frmHome.getContentPane().add(lblNewLabel_5_1);
	}

}
