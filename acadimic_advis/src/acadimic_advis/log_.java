package acadimic_advis;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class log_ {

	private JFrame frame;
	private JTextField txtAde;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					log_ window = new log_();
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
	public log_() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtAde = new JTextField();
		txtAde.setText("ade");
		frame.getContentPane().add(txtAde, BorderLayout.WEST);
		txtAde.setColumns(10);
		
		JButton btnNewButton = new JButton("change");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAde.setText("sultan");
				txtAde.setBackground(java.awt.SystemColor.black );
			}
		});
		frame.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
	}

}
