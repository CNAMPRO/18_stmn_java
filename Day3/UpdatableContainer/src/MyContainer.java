import java.util.ArrayList;

public class MyContainer<T extends AUpdatableObject> {

	protected ArrayList<T> myArray = new ArrayList<>();
	
	public MyContainer() {
		// TODO Auto-generated constructor stub
	}
	
	public void myAdd(T o) {
		for (T a: myArray) {
			if (a.getUid() == o.getUid()) {
				a.update(o);
				return;
			}
		}
		myArray.add(o);
	}
	
	public void print() {
		System.out.println("Printing array");
		for (AUpdatableObject t:myArray) {
			System.out.println(t.toString());
		}
	}
	
	public static void main(String[] args) {
		MyContainer<MyObject> cont = new MyContainer<>();
		
		cont.myAdd(new MyObject(1, 1));
		cont.print();
		cont.myAdd(new MyObject(2, 1));
		cont.myAdd(new MyObject(1, 3));
		cont.print();
	}

}
