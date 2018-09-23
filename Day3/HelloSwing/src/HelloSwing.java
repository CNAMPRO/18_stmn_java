import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class HelloSwing {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello");
		frame.setDefaultCloseOperation(
			JFrame.EXIT_ON_CLOSE
		);
		
		GridLayout grid = new GridLayout(3,3);
		JLabel name = new JLabel("Name : ");
		JLabel surname = new JLabel("Surname : ");
		
		JTextArea textName = new JTextArea(5,10);
		JTextArea textSurname = new JTextArea(5,10);
		
		JButton btnOk = new JButton("ok");
		JButton btnCancel = new JButton("Cancel");
		
		frame.getContentPane().setLayout(grid);
		frame.getContentPane().add(name);
		frame.getContentPane().add(textName);
		frame.getContentPane().add(surname);
		frame.getContentPane().add(textSurname);
		frame.getContentPane().add(btnOk);
		frame.getContentPane().add(btnCancel);
		
		frame.pack();
		frame.setVisible(true);
		
	}
}
