package swing;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class swing {
	public static void main(String[] args) {
	JFrame frame = new JFrame("HelloWorldSwing");
	frame.setDefaultCloseOperation(
	JFrame.EXIT_ON_CLOSE
	);
	JLabel label = new JLabel("Hello World");
	ButtonGroup group = new ButtonGroup();
	JRadioButton button1 = new JRadioButton("choix1", true);
	JRadioButton button2 = new JRadioButton("choix2", true);
	group.add(button1);
	group.add(button2); // add dans group pour selec 1 seul 
	Border border = BorderFactory.createTitledBorder("Sélection");
	JPanel buttonlayout =new JPanel(new GridLayout(0,1)); // layout group
	buttonlayout.setBorder(border);
	buttonlayout.add(button1);
	buttonlayout.add(button2);
	
	frame.getContentPane().add(label,BorderLayout.NORTH);
	frame.getContentPane().add(buttonlayout,BorderLayout.CENTER);
	frame.setSize(400, 200);
	frame.pack();
	frame.setVisible(true);
	}
}
