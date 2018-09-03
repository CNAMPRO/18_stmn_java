public class Moyenne{

    public static float calculMoyenne(float listeEntier[]){
        float moyenne =0;
        for (float uneValeur : listeEntier) 
        { 
            moyenne += uneValeur;
        }
        return moyenne / listeEntier.length;

    }

    public static void main(String[] args){      
        float[] a =   {10,15,18};
        System.out.println(calculMoyenne(a));
    }



}