package exercice3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDictionary {

	@Test
	void test() {
		Dictionary dictionary = new Dictionary();
		Word w1 = new Word("meh", "onomatopee");
		Word w2 = new Word("fonction", "Ensemble d'operations");
		dictionary.add(w1);
		dictionary.add(w2);
		assertEquals("onomatopee", dictionary.find("meh").definition);
		assertEquals(null, dictionary.find("chien"));
	}

}
