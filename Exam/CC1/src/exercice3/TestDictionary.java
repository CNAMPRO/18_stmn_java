package exercice3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDictionary {

	@Test
	void test() {
		Dictionary encyclopedie = new Dictionary();
		
		encyclopedie.addWord(new Word("meh", "Onomatopee")); 
		encyclopedie.addWord(new Word("fonction", "Ensemble d'opérations"));
		assertEquals("Onomatopee", encyclopedie.find("meh").definition); 
	}
	
	@Test
	void test2() {
		Dictionary encyclopedie = new Dictionary();
		
		encyclopedie.addWord(new Word("meh", "Onomatopee")); 
		encyclopedie.addWord(new Word("fonction", "Ensemble d'opérations"));
		assertEquals(null, encyclopedie.find("chien")); 
	}
}
