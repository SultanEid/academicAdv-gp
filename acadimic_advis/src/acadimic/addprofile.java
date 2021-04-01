package acadimic;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class addprofile {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addprofile window = new addprofile();
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
	public addprofile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add profile");
		lblNewLabel.setBounds(163, 11, 94, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Full Name");
		lblNewLabel_1.setBounds(10, 43, 71, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(104, 40, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setBounds(10, 85, 84, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(104, 82, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("College");
		lblNewLabel_3.setBounds(10, 127, 84, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(104, 127, 96, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setBounds(10, 174, 84, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(104, 171, 96, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Phone Num");
		lblNewLabel_5.setBounds(10, 220, 84, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(104, 217, 96, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Gender");
		lblNewLabel_6.setBounds(262, 85, 49, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JComboBox<String> comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		comboBox.setSelectedItem(null);
		comboBox.setBounds(321, 81, 71, 22);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(303, 170, 112, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Check Profile");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBounds(303, 216, 112, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
