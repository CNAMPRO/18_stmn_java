package Exercice3;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class WordTest {

	@Test
	void test() throws Throwable {
		Word w = new Word("meh", "onomatopee");
		Word ww = new Word("fonction", "ensemble d'opérations");
		
		Dictionary d = new Dictionary();
		d.add(w);
		d.add(ww);
	
		
		assertEquals("meh", d.find("meh").getId());
		assertEquals("onomatopee", d.find("meh").getDefinition());
		
	
		Person pp = new Person("fonction", "ensemble d'opérations");
		NewDictionary d2 = new NewDictionary();
		d2.add(pp);
		//d2.add(pp);
		//assertEquals("meh", d.find("meh").getId());

		
		
	}
	
	
	

}
