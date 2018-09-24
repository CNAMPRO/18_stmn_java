package Exo3;


import static org.junit.Assert.*;

import org.junit.Test;

public class DictionaryNewTest {

	@Test
	public final void testFind() {
		DictionaryNew BD = new DictionaryNew();
		
		BD.addWord(new WordNew("meh", "Onomatopee"));
		BD.addWord(new WordNew("fonction", "Ensemble d'opérations"));
		BD.addWord(new Person("Wesh", "RAP"));
		assertEquals("Onomatopee", BD.find("meh").getDescription());
	}
	
	@Test
	public final void testFind2() {
		DictionaryNew BD = new DictionaryNew();
		
		BD.addWord(new WordNew("meh", "Onomatopee"));
		BD.addWord(new WordNew("fonction", "Ensemble d'opérations"));
		BD.addWord(new Person("Wesh", "RAP"));
		assertEquals(null, BD.find("Chien"));
	}
	
	@Test
	public final void testFind3() {
		DictionaryNew BD = new DictionaryNew();
		
		BD.addWord(new WordNew("meh", "Onomatopee"));
		BD.addWord(new WordNew("fonction", "Ensemble d'opérations"));
		BD.addWord(new Person("Wesh", "RAP"));
		assertEquals("RAP", BD.find("Wesh").getDescription());
	}
}