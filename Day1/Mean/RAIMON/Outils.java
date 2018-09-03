public class Outils{
	public static void main(String[] args){
		int result = moyenne();
		System.out.println(result);
	}

	public static int moyenne(){
		int[] tab = {10,20,14,9,15};
		int result = 0;
		for (int note : tab )
			result += note;
		result = result/tab.length;
		return result;
	}
}
