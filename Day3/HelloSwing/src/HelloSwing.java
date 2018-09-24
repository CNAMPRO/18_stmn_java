import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloSwing {
	public static void main(String[] args) {
		JFrame frame = new JFrame("HelloWorldSwing");
		frame.setDefaultCloseOperation(
				JFrame.EXIT_ON_CLOSE
		);
		JLabel label = new JLabel("NON");
		frame.getContentPane().add(label);
		frame.pack();
		frame.setVisible(true);
	}
}
