import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloSwingWindow {
	public static void main(String[] args) {
		JFrame frame = new JFrame("HelloWorldSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("Coucou les amis, je fais un cra feu et je m'appelle lucas");
		frame.getContentPane().add(label);
		frame.pack();
		frame.setVisible(true);
	}
}
