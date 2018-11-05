package exercice2;

public class SortedContainer implements ISortable {

	private static final int CAPACITY = 5000;
	private int[] elements = new int[CAPACITY];
	private int size;
	
	public SortedContainer(int[] list) {
		assert(list.length<CAPACITY);
		for (int i=0; i<list.length; ++i) {
			elements[i] = list[i];
		}
		size = list.length;
		sort(elements, size);
	}
	
	@Override
	public void sort(int[] list, int listSize) {
		int n = listSize;
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (list[j - 1] > list[j]) {
					// swap elements
					temp = list[j - 1];
					list[j - 1] = list[j];
					list[j] = temp;
				}
			}
		}
	}
	
	public void add(int value) {
		assert((size+1)<CAPACITY);
		elements[size] = value;
		size += 1;
		sort(elements, size);
	}
	
	public int[] elements() {
		int[] result = new int[size];
		for (int i=0; i<size; ++i) {
			result[i] = elements[i];
		}
		return result;
	}

}
