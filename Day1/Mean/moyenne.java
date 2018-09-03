public class moyenne
{
  public static void moyennefonction(int[] args)
  {
    int i=0;
    float moyenne=0;
    for (i=0;i<args.length;++i)
    {
      moyenne += args[i];
    }
    moyenne = moyenne/i;
    System.out.println(moyenne);

  }
  public static void main(String[] args)
  {
    int tab[] = {1,5,4,3,2};
    moyennefonction(tab);
  }

}
