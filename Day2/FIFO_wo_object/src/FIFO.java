
public class FIFO {
	public static void main(String[] args){
		int[] tab = new int[1];
		tab = enfile(tab,5);
		System.out.print(tab[0]);
	
		
	}
	
	public static int[] enfile(int[] liste, int valeur) {	
		int[] newList = new int[liste.length+1];
		newList[0] = valeur;
		for(int i =0; i<liste.length; i++ ) {
			newList[i+1] = liste[i];
		}
		return newList;
		
	}
	
	public static int defile(int[] liste) {
		int[] newList = new int[liste.length-1];
		int valeur;
		valeur = liste[0];
		for(int i =1; i<liste.length-1; i++ ) {
			newList[i-1] = liste[i];
		}
		return valeur;
	}
	

}
