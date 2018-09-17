
public class FIFO {
	public static void main(String[] args){
		int[] tab = new int[50];	
		
		int nbElement =0;
		enfile(tab,1111,nbElement);	
		nbElement++;
		enfile(tab,8,nbElement);
		nbElement++;
		enfile(tab,3,nbElement);	
		nbElement++;
		enfile(tab,2,nbElement);	
		nbElement++;
	
	

		
		for(int i =0; i<nbElement; i++ ) {
			System.out.println(defile(tab,nbElement));			
		}
		
	
	
		
	}
	
	public static void enfile(int[] tab, int valeur, int taille ) {	
	
		tab[taille] =valeur; 			
	}
	
	public static int defile(int[] liste,int taille) {
		int valeur = liste[0];
		for(int i =1; i<taille; i++ ) {
			liste[i-1] = liste[i];
		}
		return valeur;
	}
	

}
