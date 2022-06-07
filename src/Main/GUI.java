package Main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame {
	
	private JButton sendButton = new JButton("send text");
	private JTextField username = new JTextField(10);
	private JLabel label = new JLabel("Insert your name: ");
	private JTextArea problemDescription = new JTextArea(5, 20);
	
	public GUI() {
		super ("Bug Report");
		this.setBounds(100, 100, 400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = this.getContentPane();		
		container.setLayout(new FlowLayout ());
		container.add(label);
		container.add(username);
		container.add(new JLabel("if you have problems, write it here: "));
		problemDescription.setLineWrap(true);
		JScrollPane jScrollPane = new JScrollPane(problemDescription);
		container.add(jScrollPane);
		sendButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = "";
			message += "user: " + username.getText() + " has problem: " + '\n';
			message += problemDescription.getText();
			JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
			}
		});
		container.add(sendButton);
	}
	
	
}
