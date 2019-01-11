public class Moyenne
{
  public static void main(String[] args)
  {
    int[] Valeurs = {2,4,5,6,4,8,7,5,1,5,65,5,43,54,35,4,57};
    double Mean = calcMoyenne(Valeurs);
    System.out.println(Mean);
  }
  static public double calcMoyenne(int[] values)
  {
    double mean = 0;
    for(int nb : values)
    {
      mean += nb;
    }
    return mean / values.length;
  }
}
