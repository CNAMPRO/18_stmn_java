package exercice2;

public class ISortable {
	
	void sort(int[] tab,int sizeTemp)
	{
		int temp;
	    boolean tab_en_ordre = false;
	    int taille = sizeTemp;
	    while(!tab_en_ordre)
	    {
	        tab_en_ordre = true;
	        for(int i=0 ; i < taille-1 ; i++)
	        {
	            if(tab[i] > tab[i+1])
	            {
	            	temp = tab[i];
	            	tab[i]=tab[i+1];
	            	tab[i+1] = temp;
	                tab_en_ordre = false; 
	            }
	        }
	        taille--;
	    }
	}

}
