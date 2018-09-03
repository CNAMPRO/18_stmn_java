public class Mean{

	public static void main(String[] args){
		int[] tab = new int[args.length];
		for (int i = 0; i < args.length; i++)
    	tab[i] = Integer.parseInt(args[i]);
		System.out.print(ConsoleColors.YELLOW+"Notes : "+ConsoleColors.RESET);
		for (int note : tab )
			System.out.print(note+" ");
		System.out.println();
		System.out.println(ConsoleColors.YELLOW+"Moyenne : "+ConsoleColors.RESET+  moyenne(tab));
	}

	public static int moyenne(int[] tab){
		int result = 0;
		for (int note : tab )
			result += note;
		result = result/tab.length;
		return result;
	}
}
