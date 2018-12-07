package exercice3;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DictionaryTest {

	@Test
	void testMeh() {
		Dictionary myDictionary = new Dictionary();
		Word meh = new Word("meh","onomatopee");
		Word fonc = new Word("fonction","Ensemble d'opérations");
		myDictionary.add(meh);
		myDictionary.add(fonc);
		Word testFind = myDictionary.find("meh");
		assertEquals(testFind.definition,"onomatopee");
	}
	
	@Test
	void testChien() {
		Dictionary myDictionary = new Dictionary();
		Word meh = new Word("meh","onomatopee");
		Word fonc = new Word("fonction","Ensemble d'opérations");
		myDictionary.add(meh);
		myDictionary.add(fonc);
		Word testFind = myDictionary.find("chien");
		assertEquals(testFind,null);
	}

}
