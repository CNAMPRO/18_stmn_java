import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	
	
	public MyFrame() {
		setTitle("MyFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
		init();
	}

	protected void init() {
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		centerPanel.setLayout(new GridBagLayout());
		GridBagConstraints c2 = new GridBagConstraints();
		c2.gridx = 0;
		c2.gridy = 0;
		c2.fill = GridBagConstraints.BOTH;
		c2.weightx = 1.0;
		c2.weighty = 1.0;
		add(centerPanel, c2);
		
		GridBagConstraints c = new GridBagConstraints();
		// 1st line
		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.WEST;
		centerPanel.add(new JLabel("Name"), c);
		c.gridx = 1;
		c.gridy = 0;
		c.fill = GridBagConstraints.HORIZONTAL;
		JTextField f = new JTextField();
		f.setPreferredSize(new Dimension(50, 16));
		centerPanel.add(f, c);
		
		// 2nd line
		c.gridx = 0;
		c.gridy = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.WEST;
		centerPanel.add(new JLabel("Surname"), c);
		JTextField f2 = new JTextField();
		f2.setPreferredSize(new Dimension(50, 16));
		c.gridx = 1;
		c.gridy = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		centerPanel.add(f2, c);
		
		JPanel buttonPanel = new JPanel();
		//buttonPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		c2.gridx = 0;
		c2.gridy = 1;
		c2.fill = GridBagConstraints.HORIZONTAL;
		c2.weightx = 1.0;
		c2.weighty = 0.0;
		c2.anchor = GridBagConstraints.SOUTH|GridBagConstraints.EAST;
		add(buttonPanel, c2);
		buttonPanel.add(new JButton("Ok"), c);
		buttonPanel.add(new JButton("Cancel"), c);
	}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
        
		//frame.setSize(500, 500);
        frame.pack();
        frame.setVisible(true);
	}
	
}
