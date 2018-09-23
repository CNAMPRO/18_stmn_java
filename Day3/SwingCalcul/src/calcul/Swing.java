package calcul;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.Hashtable;

public class Swing extends JFrame {

public Swing() {

     super("Calculatrice");

      JPanel panneau = new JPanel();
      panneau.setBorder(new EmptyBorder(10, 10, 10, 10));
      panneau.setLayout(new GridLayout(1,1));
      Font font1 = new Font("SansSerif", Font.BOLD, 30);
      JTextField inputCalcul = new JTextField();
      inputCalcul.setHorizontalAlignment(SwingConstants.RIGHT);
      inputCalcul.setBorder(BorderFactory.createCompoundBorder(inputCalcul.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
      inputCalcul.setFont(font1);
      panneau.add(inputCalcul);
      
      JPanel panneau2 = new JPanel();
      panneau2.setBorder(new EmptyBorder(10, 10, 10, 10));
      panneau2.setLayout(new GridLayout(3,4));
      
      // Bouton à afficher
      JButton btn1 = new JButton("1");
      JButton btn2 = new JButton("2");
      JButton btn3 = new JButton("3");
      JButton btn4 = new JButton("4");
      JButton btn5 = new JButton("5");
      JButton btn6 = new JButton("6");
      JButton btn7 = new JButton("7");
      JButton btn8 = new JButton("8");
      JButton btn9 = new JButton("9");
      JButton btnCe = new JButton("CE");
      JButton btnPlus = new JButton("+");
      JButton btnEgal = new JButton("=");
      
      // Evènement sur les boutons
      btn1.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent e) {
        	  inputCalcul.setText(inputCalcul.getText()+e.getActionCommand());
          }
      });
      btn2.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent e) {
        	  inputCalcul.setText(inputCalcul.getText()+e.getActionCommand());
          }
      });
      btn3.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent e) {
        	  inputCalcul.setText(inputCalcul.getText()+e.getActionCommand());
          }
      });
      btn4.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent e) {
        	  inputCalcul.setText(inputCalcul.getText()+e.getActionCommand());
          }
      });
      btn5.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent e) {
        	  inputCalcul.setText(inputCalcul.getText()+e.getActionCommand());
          }
      });
      btn6.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent e) {
        	  inputCalcul.setText(inputCalcul.getText()+e.getActionCommand());
          }
      });
      btn7.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent e) {
        	  inputCalcul.setText(inputCalcul.getText()+e.getActionCommand());
          }
      });
      btn8.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent e) {
        	  inputCalcul.setText(inputCalcul.getText()+e.getActionCommand());
          }
      });
      btn9.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent e) {
        	  inputCalcul.setText(inputCalcul.getText()+e.getActionCommand());
          }
      });
      btnCe.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent e) {
        	  inputCalcul.setText("");
          }
      });
      btnPlus.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent e) {
        	  inputCalcul.setText(inputCalcul.getText()+e.getActionCommand());
          }
      });
      btnEgal.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent e) {
        	  int result = 0;
        	  String[] list = inputCalcul.getText().split("\\+");
        	  for (String nombre : list) {
        		  result += Integer.parseInt(nombre);	
        	  }
        	  inputCalcul.setText("="+result);
          }
      });
      
      // Ajout des boutons
      panneau2.add(btn1);
      panneau2.add(btn2);
      panneau2.add(btn3);
      panneau2.add(btnCe);
      panneau2.add(btn4);
      panneau2.add(btn5);
      panneau2.add(btn6);
      panneau2.add(btnPlus);
      panneau2.add(btn7);
      panneau2.add(btn8);
      panneau2.add(btn9);
      panneau2.add(btnEgal);
      
      JPanel mainPanel = new JPanel();
      mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
      mainPanel.add(panneau);
      mainPanel.add(panneau2);
      setContentPane(mainPanel);
      setSize(300,300);
      setVisible(true);
      
   }
	
  public static void main(String [] args){
      JFrame frame = new Swing();
  }
}