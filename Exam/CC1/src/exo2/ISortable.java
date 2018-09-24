package exo2;

public class ISortable {
	
	public void sort(int[] list, int listSize) 
	{
		int temp;
	    boolean tab_en_ordre = false;
	    int taille = listSize;
	    while(!tab_en_ordre)
	    {
	        tab_en_ordre = true;
	        for(int i=0 ; i < taille-1 ; i++)
	        {
	            if(list[i] > list[i+1])
	            {
	               temp = list[i];
	               list[i] = list[i+1];
	               list[i+1] = temp;
	               
	               tab_en_ordre = false;
	            }
	        }
	        taille--;
		}

	}
	
}

