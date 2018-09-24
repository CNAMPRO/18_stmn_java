package Exercice3;

import java.util.Map;

public class NewDictionary {

	Map<String, IFindable> words;
	/**
	 * @param w
	 */
	public void add(IFindable w) {
		words.put(w.getId(), w);
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public IFindable find(String id) throws Throwable {
			if(words.containsKey(id))
				return words.get(id);
		return null;
		
}
	
	
	
}
