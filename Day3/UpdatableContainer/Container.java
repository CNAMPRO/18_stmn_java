import java.util.ArrayList;

public class Container<T extends UpdatableElement> {
	 //private Map<Integer,T> elements=new HashMap<Integer,T>();

	private ArrayList<T> elements;
	
	public void add(T obj) {
		for(T t : elements) {
			if (t.getId() == obj.getId()) {
				obj.update(null);
				return;	
			}
			elements.add(obj);
		}

	}	
	
}
