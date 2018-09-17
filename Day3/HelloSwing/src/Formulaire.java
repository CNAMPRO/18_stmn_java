import java.awt.FlowLayout;

import javax.swing.*;

public class Formulaire {

	  private static void createAndShowGUI() {
	       
	        JFrame frame = new JFrame("HelloWorldSwing");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      
	        frame.getContentPane().setLayout(new FlowLayout());
	        
	        JLabel nomLabel = new JLabel("Nom");
	        frame.getContentPane().add(nomLabel);

	        
	        JTextField nomField = new JTextField(20);
	        frame.getContentPane().add(nomField);
	        
	        
	        JLabel prenomLabel = new JLabel("Prénom");
	        frame.getContentPane().add(prenomLabel);

	        
	        JTextField prenomField = new JTextField(20);
	        frame.getContentPane().add(prenomField);

	        
	        //Display the window.
	        frame.pack();
	        frame.setVisible(true);
	    }

	    public static void main(String[] args) {
	        //Schedule a job for the event-dispatching thread:
	        //creating and showing this application's GUI.
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });
	    }
}
