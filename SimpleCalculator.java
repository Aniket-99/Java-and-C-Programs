import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class SimpleCalculator implements ActionListener{
	private JFrame frame;
	JLabel title,number1,number2,resultLb;
	JTextField noField1,noField2;
	JButton add,subtract,multiply,divide;
	public SimpleCalculator() {
		frame = new JFrame("Simple Calculator");
		
		title = new JLabel("Simple Calculator");
		title.setFont(new Font("Serif", Font.BOLD, 24));
		number1 = new JLabel("Enter First no: ");
		number2 = new JLabel("Enter Second no: ");
		resultLb = new JLabel();
		
		noField1 = new JTextField();
		noField2 = new JTextField();
		
		add = new JButton("Add");
		subtract = new JButton("Subtract");
		multiply = new JButton("Multiply");
		divide = new JButton("Divide");
		
		add.addActionListener(this);
		subtract.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		
		
		title.setBounds(100,10,100+100,30);
		number1.setBounds(0, 50, 150, 50);
		number2.setBounds(0, 50+50, 150, 50);
		noField1.setBounds(120,60,200,30);
		noField2.setBounds(120,60+50,200,30);
		resultLb.setBounds(100,250,300,60);
		
		
		add.setBounds(100, 150, 100, 30);
		subtract.setBounds(100+120, 150, 100, 30);
		multiply.setBounds(100, 150+50, 100, 30);
		divide.setBounds(100+120, 150+50, 100, 30);
		
		
		frame.add(title);
		frame.add(number1);
		frame.add(number2);
		frame.add(noField1);
		frame.add(noField2);
		frame.add(add);
		frame.add(subtract);
		frame.add(multiply);
		frame.add(divide);
		frame.add(resultLb);
		
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		

	}
	public static void main(String args[]) {
		new SimpleCalculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == add) {
			int num1 = Integer.parseInt(noField1.getText());
			int num2 =  Integer.parseInt(noField2.getText());
			
			int result = num1 + num2;
			resultLb.setText("The Addition of " + num1 +" and "+ num2 + " is " + result);
			noField1.setText("");
			noField2.setText("");	
		}
		else if (e.getSource() == subtract) {
			int num1 = Integer.parseInt(noField1.getText());
			int num2 =  Integer.parseInt(noField2.getText());
			
			int result = num1 - num2;
			resultLb.setText("The Subtraction of " + num1 +" and "+ num2 + " is " + result);
			noField1.setText("");
			noField2.setText("");
		}
		else if (e.getSource() == multiply) {
			int num1 = Integer.parseInt(noField1.getText());
			int num2 =  Integer.parseInt(noField2.getText());
			
			int result = num1 * num2;
			resultLb.setText("The Multiplication of " + num1 +" and "+ num2 + " is " + result);
			noField1.setText("");
			noField2.setText("");
		}
		else if (e.getSource() == divide) {
			int num1 = Integer.parseInt(noField1.getText());
			int num2 =  Integer.parseInt(noField2.getText());
			
			int result = num1 / num2;
			resultLb.setText("The Division of " + num1 +" and "+ num2 + " is " + result);
			noField1.setText("");
			noField2.setText("");
			
		}
	}
}
