public class fonction {
    public static int main(int [] tab) {
        i = 0;
        taille = 0;
        foreach (int element : tab) {
            taille = taille + 1;
            if (i == 0) {
                add = element;
                i = 1;
            }

            System.out.println(element);
            add = add + element;
        }

        moy =  add / taille;
    }
}