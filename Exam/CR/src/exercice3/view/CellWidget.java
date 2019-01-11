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

import exercice3.model.Cell;
import exercice3.model.CellState;

public class CellWidget extends JButton implements Observer {

	private static final Dimension PREFERED_SIZE = new Dimension(24,  24);
	private static Image MINE;
	private static Image FLAG;
	
	private final Cell model;
	private boolean flagSet = false;
	
	public CellWidget(Cell model) {
		this.model = model;
		this.model.addObserver(this);
		
		setMinimumSize(PREFERED_SIZE);
		setPreferredSize(PREFERED_SIZE);
		
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (!CellWidget.this.isEnabled()) return;
				if (model.getState() == CellState.TRIGGERED) return;
				if (e.getButton() == MouseEvent.BUTTON1) {
					if (!flagSet) {
						model.setState(CellState.TRIGGERED);
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

	private void stateChanged(CellState state) {
		if (state == CellState.TRIGGERED) {
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
			setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
			setEnabled(true);
			if (model.isBomb) {
				setIcon(null);
			}
			else {
				if (model.nbOfNeiboringBomb>0) 
					setText(null);
			}
		}

	}
	
	@Override
	public void update(Observable arg0, Object state) {
		stateChanged((CellState) state);
	}
	
	static {
		try {
			BufferedImage buffImg = ImageIO.read(CellWidget.class.getClassLoader().getResource("exercice3/mine.png"));
			MINE = buffImg.getScaledInstance(PREFERED_SIZE.width, PREFERED_SIZE.height, Image.SCALE_SMOOTH);
			buffImg = ImageIO.read(CellWidget.class.getClassLoader().getResource("exercice3/flag.jpg"));
			FLAG = buffImg.getScaledInstance(PREFERED_SIZE.width, PREFERED_SIZE.height, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
