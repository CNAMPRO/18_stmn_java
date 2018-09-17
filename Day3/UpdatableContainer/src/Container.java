import java.util.ArrayList;

public class Container<T extends Iupdate> {
	private ArrayList<T> list;
	
	public void add(T val) {
		list.add(val);
	}
	
	public void update(T element) {
		int idx = 0;
		for (T el : list) {
			if(el.getId() == element.getId()){
				 element.update();
			}else {
				list.add(element);
			}
			idx++;
		}
	}
	
}
