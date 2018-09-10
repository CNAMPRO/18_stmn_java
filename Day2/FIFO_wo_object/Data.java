import java.util.ArrayList;

public class Data{
	int[] a;
	
	public static void main(String[] args){
		Data.a = [1, 2, 3, 4, 5, 6];
		
		for(int i = 0; i<a.length; i++) System.out.println(a[i]);
		Data.pop(a);
		for(int i = 0; i<a.length; i++) System.out.println(a[i]);
		
		
	}

	/**
	 * 
	 * @param a
	 */
	public static void pop(int[] a) {
		int first = a[0];
		a.remove(0);
		return first;
	}
	
	
	
	public static void push(int val) {
		a.add(val);	
	}
	
	
}