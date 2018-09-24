package Exercice3;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {
	
	Map<String, Word> words;
	
	/**
	 * @param w
	 */
	public void add(Word w) {
		words.put(w.getId(), w);
		
	}
	
	public Dictionary() {
		this.words = new HashMap<String, Word>();
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Word find(String id) throws Throwable {
		try{
			if(words.containsKey(id))
				return words.get(id);
		}
		catch(NullPointerException e)
		{
		    throw new RuntimeException("Meh", e);
		}
		return null;
		
}


	public Map<String, Word> getWords() {
		return words;
	}

	public void setWords(Map<String, Word> words) {
		this.words = words;
	}
	

}
