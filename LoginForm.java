import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class LoginForm {
	private JLabel login,display1,display2;
	private JLabel userName,password;
	private JTextField userNameField;
	private JPasswordField passwordField;
	private JButton loginButton;
		public LoginForm() {
			JFrame frame = new JFrame("Login form");
			
			login = new JLabel("Student Login Form");
			login.setForeground(Color.RED);
			login.setFont(new Font("Serif",Font.BOLD,20));
			login.setBounds(150,30,400,30);
			frame.add(login);
			
			userName = new JLabel("Username: ");
			password = new JLabel("Password: ");
			
			
			userNameField = new JTextField(10);
			passwordField = new JPasswordField(10);
			
			
			loginButton = new JButton("Login");
			
			userName.setBounds(100,100,100,30);
			userNameField.setBounds(170,100,200,27);
			
			password.setBounds(100,100+30,100,30);
			passwordField.setBounds(170,100+30,200,27);
			
			loginButton.setBounds(170,100+80,150,50);
			frame.add(loginButton);
			
			display1 = new JLabel("");
			display1.setBounds(150,240,300,100);
			frame.add(display1);
			
			display2 = new JLabel("");
			display2.setBounds(150,240+20,300,100);
			frame.add(display2);
			
			loginButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					String username = userNameField.getText().toString();
					String password = new String(passwordField.getPassword());
					display1.setText("Your username is: " + username);
					display2.setText("Your Password is: " + password);
					
					
				}
			});
			
			
			
			frame.add(userName);
			frame.add(password);
			frame.add(userNameField);
			frame.add(passwordField);
			
			frame.setSize(500,400);
			frame.setLayout(null);
			frame.setVisible(true);
			frame.setResizable(false);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
		}
	

	public static void main(String[] args) {
		new LoginForm();
	}

}
