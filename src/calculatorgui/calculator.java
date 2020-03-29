package calculatorgui;

import java.awt.EventQueue;
import java.lang.Math; 

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class calculator {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 254, 323);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 29, 89, 27);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(138, 29, 86, 27);
		frame.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int number1,number2,answer;
				try {
					number1=Integer.parseInt(textField_1.getText());
					number2=Integer.parseInt(textField_2.getText());

					answer=number1+number2;
					textField_3.setText(Integer.toString(answer));
				}catch(Exception a) {
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				
				}
			}
		});
		btnNewButton.setBounds(10, 112, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("-");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int number1,number2,answer;
				try {
					number1=Integer.parseInt(textField_1.getText());
					number2=Integer.parseInt(textField_2.getText());

					answer=number1-number2;
					textField_3.setText(Integer.toString(answer));
				}catch(Exception a) {
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				
				}
			}
		});
		btnNewButton_2.setBounds(10, 146, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(68, 242, 96, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("/");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int number1,number2,answer;
				try {
					number1=Integer.parseInt(textField_1.getText());
					number2=Integer.parseInt(textField_2.getText());

					answer=number1/number2;
					textField_3.setText(Integer.toString(answer));
				}catch(Exception a) {
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				
				}
			}
		});
		btnNewButton_1.setBounds(138, 76, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("*");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int number1,number2,answer;
				try {
					number1=Integer.parseInt(textField_1.getText());
					number2=Integer.parseInt(textField_2.getText());

					answer=number1*number2;
					textField_3.setText(Integer.toString(answer));
				}catch(Exception a) {
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				
				}
			}
		});
		btnNewButton_3.setBounds(138, 112, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("^n");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int number1,number2,answer;
				try {
					number1=Integer.parseInt(textField_1.getText());
					number2=Integer.parseInt(textField_2.getText());
					answer=(int)Math.pow(number1, number2);
					textField_3.setText(Integer.toString(answer));
				}catch(Exception a) {
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				
				}
			}
		});
		btnNewButton_4.setBounds(10, 180, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		btnNewButton_6 = new JButton("%");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int number1,number2,answer;
				try {
					number1=Integer.parseInt(textField_1.getText());
					number2=Integer.parseInt(textField_2.getText());

					answer=number1%number2;
					textField_3.setText(Integer.toString(answer));
				}catch(Exception a) {
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				
				}
			}
		});
		btnNewButton_6.setBounds(138, 146, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("C");
		btnNewButton_7 .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");

				}
			
		});
		btnNewButton_7.setBounds(10, 76, 89, 23);
		frame.getContentPane().add(btnNewButton_7);


	}
}