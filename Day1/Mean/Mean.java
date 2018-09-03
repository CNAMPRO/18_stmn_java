public class Mean {
	public static void main(String[] args) {
	    System.out.println("Calcul de la moyenne : 12, 15, 10, 0, 15, 20 =");
      int[] a = {12, 15, 10, 0, 15, 20};
      int result = moy(a);
      System.out.println(result);
    }
		/*
			Retourne la moyenne d'un tableau d'entiers
		*/
    public static int moy(int[] args){
        int total = 0;
    	  for(int i = 0; i<args.length;i++)
           total+=args[i];
      	return total/args.length;
    }

 }
