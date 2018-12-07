package exercice3.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.plaf.metal.MetalButtonUI;

import exercice2.Util;
import exercice3.model.Box;
import exercice3.model.BoxState;

public class JBox extends JButton implements Observer {

	private static final Dimension PREFERED_SIZE = new Dimension(24, 24);
	private static ImageIcon MINE;
	private static ImageIcon FLAG;

	private final Box model;

	public JBox(Box model) {
		this.model = model;
		this.model.addObserver(this);

		setMinimumSize(PREFERED_SIZE);
		setPreferredSize(PREFERED_SIZE);

		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (model.getState() == BoxState.TRIGGERED)
					return;
				if (model.getState() == BoxState.FLAGED)
					return;
				if (e.getButton() == MouseEvent.BUTTON1 && model.isFlag == false) {
					model.trigger();
				} else if (e.getButton() == MouseEvent.BUTTON3) {
					model.flag();
				}
			}
		});
	}

	private void stateChanged(BoxState boxState) {
		setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		setEnabled(false);

		if (boxState == BoxState.TRIGGERED) {
		if (model.isBomb == true) {
			setIcon(MINE);
			setDisabledIcon(MINE);

		} else if (model.nbOfNeiboringBomb > 0) {
			setText(String.valueOf(model.nbOfNeiboringBomb));
			setUI(new MetalButtonUI() {
				@Override
				protected Color getDisabledTextColor() {
					if (model.nbOfNeiboringBomb == 1) {
						return Color.blue;
					} else if(model.nbOfNeiboringBomb == 2){
						return Color.green;
					} else if(model.nbOfNeiboringBomb == 3){
						return Color.red;
					} else if(model.nbOfNeiboringBomb == 4){
						return Color.magenta;
					}
					return Color.black;
					
				}
			});
		}
		} else if (boxState == BoxState.FLAGED) {
			setIcon(FLAG);
			setDisabledIcon(FLAG);
		} 
		
	}

	@Override
	public void update(Observable arg0, Object BoxState) {
		stateChanged(model.getState());
	}

	static {
		try {
			BufferedImage buffImg = ImageIO.read(Util.class.getClassLoader().getResource("exercice3/mine.png"));
			MINE = new ImageIcon(
					buffImg.getScaledInstance(PREFERED_SIZE.width, PREFERED_SIZE.height, Image.SCALE_SMOOTH));
			BufferedImage FlagImg = ImageIO.read(Util.class.getClassLoader().getResource("exercice3/flag.jpg"));
			FLAG = new ImageIcon(
					FlagImg.getScaledInstance(PREFERED_SIZE.width, PREFERED_SIZE.height, Image.SCALE_SMOOTH));
					
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
