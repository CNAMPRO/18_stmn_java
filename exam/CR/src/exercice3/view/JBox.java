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

import exercice3.model.Box;
import exercice3.model.BoxState;

public class JBox extends JButton implements Observer {

	private static final Dimension PREFERED_SIZE = new Dimension(24,  24);
	private static Image MINE;
	private static Image FLAG;
	
	private final Box model;
	private boolean flagSet = false;
	
	public JBox(Box model) {
		this.model = model;
		this.model.addObserver(this);
		
		setMinimumSize(PREFERED_SIZE);
		setPreferredSize(PREFERED_SIZE);
		
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (!JBox.this.isEnabled()) return;
				if (model.getState() == BoxState.TRIGGERED) return;
				if (e.getButton() == MouseEvent.BUTTON1) {
					if (!flagSet) {
						model.setState(BoxState.TRIGGERED);
					}
		        } else if (e.getButton() == MouseEvent.BUTTON3) {
		        	if (flagSet) {
		        		setIcon(null);
		        		flagSet = false;
		        	}
		        	else {
		        		setIcon(new ImageIcon(FLAG));
		        		flagSet = true;
		        	}
		          
		        }
		      }
		});
	}

	private void stateChanged(BoxState state) {
		if (state == BoxState.TRIGGERED) {
			setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
			setEnabled(false);
			
			if (model.isBomb) {
					setIcon(new ImageIcon(MINE));
					setDisabledIcon(new ImageIcon(MINE));
				
			}
			else {
				if (model.nbOfNeiboringBomb>0) {
					setText(String.valueOf(model.nbOfNeiboringBomb));
					final Color c = Constants.COLOR_MAP.get(model.nbOfNeiboringBomb);
					setUI(new MetalButtonUI() {
						@Override
				         protected Color getDisabledTextColor() {
				            return c;
				         }
					});
				}
			}
		}
		else {
			setEnabled(true);
			setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
			flagSet = false;
			setIcon(null);
			setText("");
		
		}

	}
	
	@Override
	public void update(Observable arg0, Object state) {
		stateChanged((BoxState) state);
	}
	
	static {
		try {
			BufferedImage buffImg = ImageIO.read(JBox.class.getClassLoader().getResource("exercice3/mine.png"));
			MINE = buffImg.getScaledInstance(PREFERED_SIZE.width, PREFERED_SIZE.height, Image.SCALE_SMOOTH);
			buffImg = ImageIO.read(JBox.class.getClassLoader().getResource("exercice3/flag.jpg"));
			FLAG = buffImg.getScaledInstance(PREFERED_SIZE.width, PREFERED_SIZE.height, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
