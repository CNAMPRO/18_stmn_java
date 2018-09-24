package exo3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordTest {

	@Test
	void test1() {
		Dictonary D = new Dictonary();
		Word A = null;
		Word B = null;
		A.id="meh";
		A.definition="onomatope";
		B.id="fonction";
		B.definition="ensemble";
		D.add(A);
		D.add(B);
	}

}
