package Main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame {
	
	private JButton sendButton = new JButton("send text");
	private JTextField input = new JTextField("", 5);
	private JLabel label = new JLabel("Input: ");
	
	public GUI() {
		super ("first try");
		this.setBounds(100, 100, 250, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = this.getContentPane();
		container.setLayout(new GridLayout(3, 2, 2, 2));
		container.add(label);
		container.add(input);
		sendButton.addActionListener(new ButtonEventListener());		
		container.add(sendButton);
		
		
	}
	
	class ButtonEventListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			String message = "";
			message += input.getText();
			JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
		}
	}
}
