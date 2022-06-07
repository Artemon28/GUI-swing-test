package Main;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class Main {

	public static void main(String[] args) {
		GUI app = new GUI();
		app.setVisible(true);
		
		JMenuBar jMenuBar = new JMenuBar();
		JMenu options = new JMenu("Options");
		jMenuBar.add(options);
		
		options.add(new JMenuItem("express problem")).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String problemText = JOptionPane.showInputDialog("insert you problem here");
				if (problemText != null && problemText.length() > 0) {
					JOptionPane.showMessageDialog(null, problemText, "Your problem", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		options.add(new JMenuItem("Exit")).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		app.setJMenuBar(jMenuBar);
		app.revalidate();
	}
}
