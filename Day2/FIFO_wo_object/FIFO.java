public class FIFO {
	int [] liste;
	int capacity;
	int size;
	
	public static int pop (Fifo f) {
		int head = f.liste[0];
		for (int i = 1; i < f.size; i++) {
			f.liste[i - 1] = f.liste[i]
		}
		f.size = f.size - 1;
		return head;
	}
	
	public static void push (int valeur) {
		liste.append(valeur)
	}
}
