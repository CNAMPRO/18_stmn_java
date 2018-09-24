package exercice3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDictionaryNew {

	@Test
	void test() {
		NewDictionary encyclopedie = new NewDictionary();
		
		encyclopedie.addObject(new NewWord("meh", "Onomatopee")); 
		encyclopedie.addObject(new NewWord("fonction", "Ensemble d'opérations"));
		encyclopedie.addObject(new Person("Jean René", "Il vit une vie paisible dans la campagne"));
		assertEquals("Il vit une vie paisible dans la campagne", encyclopedie.find("Jean René").getDescription()); 
	}
	
	@Test
	void test2() {
		NewDictionary encyclopedie = new NewDictionary();
		
		encyclopedie.addObject(new NewWord("meh", "Onomatopee")); 
		encyclopedie.addObject(new NewWord("fonction", "Ensemble d'opérations"));
		encyclopedie.addObject(new Person("Jean René", "Il vit une vie paisible dans la campagne"));
		assertEquals(null, encyclopedie.find("chien")); 
	}
	
	@Test
	void test3() {
		NewDictionary encyclopedie = new NewDictionary();
		
		encyclopedie.addObject(new NewWord("meh", "Onomatopee")); 
		encyclopedie.addObject(new NewWord("fonction", "Ensemble d'opérations"));
		encyclopedie.addObject(new Person("Jean René", "Il vit une vie paisible dans la campagne"));
		assertEquals("Ensemble d'opérations", encyclopedie.find("fonction").getDescription()); 
	}

}
