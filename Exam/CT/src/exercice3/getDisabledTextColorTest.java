package exercice3;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.jupiter.api.Test;

import exercice3.view.Constants;

class getDisabledTextColorTest {

	@Test
	void test() {
		Color result = Constants.COLOR_MAP.get(1);
		Color expected = Color.blue;
		assertEquals(result, expected);
		Color result2 = Constants.COLOR_MAP.get(2);
		Color expected2 = Color.green;
		assertEquals(result2, expected2);
		Color result3 = Constants.COLOR_MAP.get(3);
		Color expected3 = Color.red;
		assertEquals(result3, expected3);
		Color result4 = Constants.COLOR_MAP.get(4);
		Color expected4 = Color.magenta;
		assertEquals(result4, expected4);
	}

}
