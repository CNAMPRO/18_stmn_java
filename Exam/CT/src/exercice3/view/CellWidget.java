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
import exercice3.model.Cell;
import exercice3.model.CellState;

public class CellWidget extends JButton implements Observer {

	private static final Dimension PREFERED_SIZE = new Dimension(24, 24);
	private static ImageIcon MINE;

	private final Cell model;

	public CellWidget(Cell model) {
		this.model = model;
		this.model.addObserver(this);

		setMinimumSize(PREFERED_SIZE);
		setPreferredSize(PREFERED_SIZE);

		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (model.getState() == CellState.TRIGGERED)
					return;
				if (e.getButton() == MouseEvent.BUTTON1) {
					model.trigger();
				} else if (e.getButton() == MouseEvent.BUTTON3) {
					// TODO: Implement ASAP
				}
			}
		});
	}

	private void stateChanged(boolean isBomb) {
		setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		setEnabled(false);

		if (isBomb) {
			setIcon(MINE);
			setDisabledIcon(MINE);

		} else {
			if (model.nbOfNeiboringBomb > 0) {
				setText(String.valueOf(model.nbOfNeiboringBomb));
				setUI(new MetalButtonUI() {
					@Override
					protected Color getDisabledTextColor() {
						return Color.orange;
					}
				});
			}
		}
	}

	@Override
	public void update(Observable arg0, Object isBomb) {
		stateChanged((boolean) isBomb);
	}

	static {
		try {
			BufferedImage buffImg = ImageIO.read(Util.class.getClassLoader().getResource("exercice3/mine.png"));
			MINE = new ImageIcon(
					buffImg.getScaledInstance(PREFERED_SIZE.width, PREFERED_SIZE.height, Image.SCALE_SMOOTH));
			buffImg = ImageIO.read(Util.class.getClassLoader().getResource("exercice3/flag.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
