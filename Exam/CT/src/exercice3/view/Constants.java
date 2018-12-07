package exercice3.view;

import java.awt.Color;
import java.util.HashMap;

public class Constants {

	public static final HashMap<Integer, Color> COLOR_MAP;
	
	static {
		COLOR_MAP = new HashMap<>();
		COLOR_MAP.put(1, Color.blue);
		COLOR_MAP.put(2, Color.green);
		COLOR_MAP.put(3, Color.red);
		COLOR_MAP.put(4, Color.magenta);
	}

}
