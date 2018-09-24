package exercice3;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NewDictionaryTest {

	@Test
	void testWord() {
		NewDictionary myDictionary = new NewDictionary();
		NewWord meh = new NewWord("meh","onomatopee");
		NewWord fonc = new NewWord("fonction","Ensemble d'opérations");
		myDictionary.add(meh);
		myDictionary.add(fonc);
		NewWord testFind = (NewWord) myDictionary.find("meh");
		assertEquals(testFind.getDescription(),"onomatopee");
	}
	
	@Test
	void testPerson() {
		NewDictionary myDictionary = new NewDictionary();
		Person kevin = new Person("kevin","super je suis fort en maths");
		Person micka = new Person("micka","git pull origin raimon");
		myDictionary.add(kevin);
		myDictionary.add(micka);
		Person testFind = (Person) myDictionary.find("kevin");
		assertEquals(testFind.getDescription(),"super je suis fort en maths");
	}

}
