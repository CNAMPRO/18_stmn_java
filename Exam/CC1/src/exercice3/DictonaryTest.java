package exercice3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DictonaryTest {

	@Test
	void test() {
		Word meh = new Word("meh", "onomatopee");
		Word fonction = new Word("fonction", "Ensemble d'operation");
		
		Dictonary unDico = new Dictonary();
		unDico.add(meh);
		unDico.add(fonction);
		
		assertEquals(unDico.find("meh").getDefinition(), "onomatopee");
		assertEquals(unDico.find("fonction").getDefinition(), "Ensemble d'operation");
		assertEquals(unDico.find("chien"), null);

		
	}

}
