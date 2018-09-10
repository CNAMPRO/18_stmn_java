public class mean{
    public static float CalculateMean(float list[])
    {
        float moyenne = 0;
        for (int i=0; i<list.length;i++)
        {
        moyenne = moyenne + list[i];
        }
        moyenne = moyenne/(list.length);
        return moyenne;
    }

    public static void main(String[] args)
    {
        float[] a = {10,15,18};
        System.out.println(CalculateMean(a));

    }
}

