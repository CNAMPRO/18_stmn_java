import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import java.awt.event.*;

public class Swing extends JFrame {

  public Swing() {

     super("Test de swing");

      JPanel panneau = new JPanel();
      panneau.setBorder(new EmptyBorder(10, 10, 10, 10));
      panneau.setLayout(new GridLayout(3,2));
      panneau.add(new JLabel("Nom :"));
      panneau.add(new JTextField());
      panneau.add(new JLabel("Prénom :"));
      panneau.add(new JTextField());
      panneau.add(new JButton("Ok"));
      panneau.add(new JButton("Annuler"));
      setContentPane(panneau);
      setSize(300,150);
      setVisible(true);
   }

  public static void main(String [] args){
      JFrame frame = new Swing();
  }
}