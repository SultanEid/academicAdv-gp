package acadimic;

import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JMenuBar;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JTextPane;
import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Scrollbar;
import java.awt.Choice;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JPanel;

public class aclogg {

	private JFrame frame;
	private JTextField TxtUserName;
	private JPasswordField Txtpassword;
	private JComboBox combobox;

	Connection con = null;
	PreparedStatement pst=null;
	ResultSet rs = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aclogg window = new aclogg();
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
	public aclogg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		combobox = new JComboBox();
		combobox.setFont(new Font("Tahoma", Font.BOLD, ١٢));
		combobox.setBounds(0, 0, 77, 22);
		
		combobox.setModel(new DefaultComboBoxModel(new String[] {"Advisor", "Student"}));
		//frame.getContentPane().setEnabled(false);
		//frame.getContentPane().setForeground(Color.LIGHT_GRAY);
		//frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 396, 289);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, ١٤));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(30, 156, 85, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(0, 0, 7, 20);
		frame.getContentPane().add(textPane);
		
		JLabel lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, ١٤));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(30, 96, 85, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Login Page");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, ١٤));
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBounds(173, 11, 105, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		TxtUserName = new JTextField();
		TxtUserName.setBounds(134, 93, 96, 20);
		frame.getContentPane().add(TxtUserName);
		TxtUserName.setColumns(10);
		
		Txtpassword = new JPasswordField();
		Txtpassword.setBounds(134, 153, 96, 20);
		frame.getContentPane().add(Txtpassword);
		
		Button button_1 = new Button("Login");
		button_1.setFont(new Font("Dialog", Font.BOLD, ١٣));
		button_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					String query = "select * from person where username=? and password=?";
					if(combobox.getSelectedIndex() ==0)
				{
					query = "select * from advisor where username=? and password=?";
				}
				else {
					query = "select * from student where username=? and password=?";
				}				

					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/acaadvisor","root","root");

				
				//pst=con.prepareStatement(query);
				pst=con.prepareStatement(query);

				pst.setString(1, TxtUserName.getText());
				pst.setString(2, Txtpassword.getText());
				//pst.setString(3, String.valueOf(combobox.getSelectedItem()));
				
				
				
				rs=pst.executeQuery();
				if(rs.next()){
					//https://previews.123rf.com/images/arcady31/arcady311804/arcady31180400089/100338640-successful-download-vector-icon.jpg
					//final ImageIcon icon = new ImageIcon(new URL("https://previews.123rf.com/images/arcady31/arcady311804/arcady31180400089/100338640-successful-download-vector-icon.jpg"));

					//JOptionPane.showMessageDialog(button_1, this, "login", 2);	
				//JOptionPane.showMessageDialog(TxtUserName ,this, " login", 0);
				System.out.println(rs.getString("email"));
				//System.out.println(combobox.getSelectedItem());
				if(combobox.getSelectedIndex()==0 && !rs.equals(null)){
					JOptionPane.showMessageDialog(button_1, this, "login as Advisor", 0);
					AdvisorInterface ai = new AdvisorInterface();
				ai.setVisible(true);
				this.setVisible(false);
				}
				else if (combobox.getSelectedIndex()==1 && !rs.equals(null)){
					JOptionPane.showMessageDialog(button_1, this, "login as Student", 0);
					StudentInterface su = new StudentInterface();
				su.setVisible(true);
				this.setVisible(false);
				}}
				else{
				JOptionPane.showMessageDialog(button_1, this, "username and password do not matched", 0);
				 
				}
				}
				catch(Exception ex){
				System.out.println(ex.getMessage() + ex.getStackTrace()[0].getLineNumber());
				JOptionPane.showMessageDialog(button_1, this, ex.getMessage(), 0);
				 
				}
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		button_1.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		button_1.setForeground(Color.BLACK);
		button_1.setBounds(134, 215, 67, 21);
		button_1.setBackground(new Color(0, 255, 0));
		frame.getContentPane().add(button_1);
		
		Button button_2 = new Button("Exit");
		button_2.setFont(new Font("Dialog", Font.BOLD, ١٣));
		button_2.setBackground(Color.RED);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_2.setBounds(243, 215, 67, 21);
		frame.getContentPane().add(button_2);
		
		JLabel lblNewLabel_3 = new JLabel("Select user type");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, ١٣));
		lblNewLabel_3.setBounds(263, 93, 119, 20);
		frame.getContentPane().add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(287, 152, 77, 22);
		frame.getContentPane().add(panel);
		panel.add(combobox);
		panel.setLayout(null);
		
		
	}
}
