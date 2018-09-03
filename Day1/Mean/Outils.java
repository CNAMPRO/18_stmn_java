public class Outils{

	public static void main(String[] args){
		int[] tab = {10,20,14,9,15};
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
