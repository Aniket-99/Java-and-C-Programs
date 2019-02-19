import javax.swing.*;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
public class Library {
	private JFrame frame;
	private JMenuBar bar;
	private JMenu master,transaction,report;
	private JMenuItem studentLogin,adminlogin,teacherLogin,bookIssue,bookReturn,penalty,help;
	private JLabel l1,name,age,course,address;
	private JTextField nameText,ageText,courseText;
	private JTextArea addressArea;
	private JButton addBtn;
	
	
	public Library() {
		frame = new JFrame("Library management System");
		studentLogin = new JMenuItem("Student Login");
		adminlogin = new JMenuItem("Admin Login");
		teacherLogin = new JMenuItem("Teacher Login");
		
		bookIssue = new JMenuItem("Book Issue");
		bookReturn = new JMenuItem("Book Return");
		penalty = new JMenuItem("Penalty");
		
		help = new JMenuItem("Help!");
		
		bar = new JMenuBar();
		master = new JMenu("Master");
		transaction = new JMenu("Transaction");
		report = new JMenu("Report");
		
		//adding JMenuItem in master JMenu
		master.add(studentLogin); 
		master.addSeparator();
		master.add(adminlogin);
		master.addSeparator();
		master.add(teacherLogin);
		
		//adding JmenuItem in transaction JMenu
		transaction.add(bookIssue);
		transaction.addSeparator();
		transaction.add(bookReturn);
		transaction.addSeparator();
		transaction.add(penalty);
		
		//adding JmenuItem in report JMenu
		report.add(help);
		
		
		bar.add(master);
		bar.add(transaction);
		bar.add(report);
		frame.add(bar);
		frame.setJMenuBar(bar);
		
		//title label
		l1 = new JLabel("Student Registration:");
		l1.setForeground(Color.RED);
		l1.setFont(new Font("Serif",Font.BOLD,20));
		l1.setBounds(100,30,400,30);
		frame.add(l1);
		
		name = new JLabel("Name: ");
		age = new JLabel("Age: ");
		course = new JLabel("Course: ");
		address = new JLabel("Address: ");
		
		nameText = new JTextField(10);
		ageText = new JTextField(10);
		courseText = new JTextField(10);
		addressArea = new JTextArea(20,20);
		
		addBtn = new JButton("Add student");
		
		//adding borders to textfield and textareas 
		Border border = BorderFactory.createLineBorder(Color.BLACK);
	    addressArea.setBorder(BorderFactory.createCompoundBorder(border,
	            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
	    
	    nameText.setBorder(BorderFactory.createCompoundBorder(border,
	            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
	    
	    ageText.setBorder(BorderFactory.createCompoundBorder(border,
	            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
	    
	    courseText.setBorder(BorderFactory.createCompoundBorder(border,
	            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
	    
	    addBtn.setBorder(BorderFactory.createCompoundBorder(border,
	            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		
		
		name.setBounds(130,100,100,30);
		nameText.setBounds(200,100,200,27);
		
		age.setBounds(130,100+30,100,30);
		ageText.setBounds(200,100+30,200,27);
		
		course.setBounds(130,100+60,100,30);
		courseText.setBounds(200,100+60,200,27);
		
		address.setBounds(130,100+90,100,30);
		addressArea.setBounds(200,100+90,200,27);
		
		addBtn.setBounds(200,100+150,150,50);
		frame.add(addBtn);
		
		
		
		frame.add(name);
		frame.add(age);
		frame.add(course);
		frame.add(nameText);
		frame.add(ageText);
		frame.add(courseText);
		frame.add(address);
		frame.add(addressArea);
		
		
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
