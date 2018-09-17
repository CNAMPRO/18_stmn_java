package swingHello;


import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;


public class SwingSwing 
{
	public static void main(String[]args)
	{
		
		JFrame frame = new JFrame("HELLO COUCOU SWING SWING");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton OK = new JButton();
		JButton CANCEL = new JButton();
		
		JLabel frameNom = new JLabel("Nom");
		JTextField TextFieldName = new JTextField("");
		JLabel framePrenom = new JLabel("Nom");
		JTextField TextFieldSurname = new JTextField("");
		
		
		
		frame.getContentPane().add(frameNom);
		frame.getContentPane().add(TextFieldName);
		
		frame.getContentPane().add(framePrenom);
		frame.getContentPane().add(TextFieldSurname);
		
		frame.getContentPane().add(OK);
		frame.getContentPane().add(CANCEL);
		
		frame.pack();
		frame.setVisible(true);
		
	}

}
