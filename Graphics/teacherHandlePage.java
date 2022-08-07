import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class teacherHandlePage {

	private JFrame frmHandle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teacherHandlePage window = new teacherHandlePage();
					window.frmHandle.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public teacherHandlePage() {
		initialize();
	}
	
	public static void open()
	{
		teacherHandlePage window = new teacherHandlePage();
		window.frmHandle.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHandle = new JFrame();
		frmHandle.setTitle("Handle");
		frmHandle.setBounds(100, 100, 450, 300);
		frmHandle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHandle.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setBounds(6, 47, 117, 29);
		frmHandle.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.setBounds(6, 117, 117, 29);
		frmHandle.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(6, 186, 117, 29);
		frmHandle.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("To register a new teacher.");
		lblNewLabel.setBounds(190, 52, 186, 16);
		frmHandle.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("To update a current record.");
		lblNewLabel_1.setBounds(190, 122, 186, 16);
		frmHandle.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("To delete a record.");
		lblNewLabel_2.setBounds(190, 191, 167, 16);
		frmHandle.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Handle Teacher Database");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel_3.setBounds(130, 6, 285, 16);
		frmHandle.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_3 = new JButton("back");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHandle.dispose();
				homePage.open();
			}
		});
		btnNewButton_3.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		btnNewButton_3.setBounds(6, 6, 117, 16);
		frmHandle.getContentPane().add(btnNewButton_3);
		
	}

}
