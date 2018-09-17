import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class HelloSwing extends JFrame {

	
	public HelloSwing() {
		super("XX C MOI");
		final JPanel panel = new JPanel();
		final JPanel inputs = new JPanel();
		inputs.setLayout(new GridLayout(3,2));
		
		final JPanel buttons = new JPanel();
		buttons.setLayout(new GridLayout(0,2));

		panel.setLayout(new GridLayout(2,0));
        JLabel label1 = new JLabel("Name");
        inputs.add(label1);
        JTextField txt1 = new JTextField("");
        inputs.add(txt1);

        JLabel label2 = new JLabel("Surname");

        inputs.add(label2);
        
        JTextField txt2 = new JTextField("");
        inputs.add(txt2);

		final JPanel butt = new JPanel();
		inputs.setLayout(new GridLayout(3,0));
		

        
        buttons.add(new JButton("OK"));
        buttons.add(new JButton("Cancel"));
        
        panel.add(inputs);
        panel.add(buttons);

        setContentPane(panel);
        setVisible(true);
        setSize(200, 100);

	}
	
	
	public static void main(String[] args) {
		JFrame meh = new HelloSwing();
	}
}
