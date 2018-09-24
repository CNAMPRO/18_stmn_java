package Exo3;


import static org.junit.Assert.*;

import org.junit.Test;

public class DictionaryTest {

	@Test
	public final void testFind() {
		Dictionary BD = new Dictionary();
		
		BD.addWord(new Word("meh", "Onomatopee"));
		BD.addWord(new Word("fonction", "Ensemble d'opérations"));
		
		assertEquals("Onomatopee", BD.find("meh").definition);
	}
	
	@Test
	public final void testFind2() {
		Dictionary BD = new Dictionary();
		
		BD.addWord(new Word("meh", "Onomatopee"));
		BD.addWord(new Word("fonction", "Ensemble d'opérations"));
		
		assertEquals(null, BD.find("Chien"));
	}
}