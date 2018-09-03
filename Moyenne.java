public class Moyenne {

    public static void main(String[] args) {
	     System.out.println("Calcul de la moyenne : 12, 15, 10, 0, 15, 20 =\n");
      int[] a = {12, 15, 10, 0, 15, 20};
      int result = moy(a);
      System.out.println(result);
    }

    public static int moy(int[] args){
        int total = 0;
    	   for(int i = 0; i<args.length;i++)
           total+=args[i];

      return total/args.length;
    }

 }
