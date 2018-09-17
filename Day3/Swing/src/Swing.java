import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.*;

public class Swing extends JFrame {

  public Swing() {

     super("Test de swing");

      JPanel panneau = new JPanel();
      panneau.setBorder(new EmptyBorder(10, 10, 10, 10));
      panneau.setLayout(new GridLayout(2,2));
      panneau.add(new JLabel("Nom :"));
      panneau.add(new JTextField());
      panneau.add(new JLabel("Prénom :"));
      panneau.add(new JTextField());
      
      JPanel panneau2 = new JPanel();
      panneau2.setBorder(new EmptyBorder(10, 10, 10, 10));
      panneau2.add(new JButton("Ok"));
      panneau2.add(new JButton("Annuler"));
      
      JPanel mainPanel = new JPanel();
      mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
      mainPanel.add(panneau);
      mainPanel.add(panneau2);
      setContentPane(mainPanel);
      setSize(300,150);
      setVisible(true);
      
   }

  public static void main(String [] args){
      JFrame frame = new Swing();
  }
}