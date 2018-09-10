
public class fifo {
	static public void main(String argv[]) {
		int[] file = {};
		file = enfile(6,file);
		file = enfile(7,file);
		file = defile(file);
		file = enfile(8,file);
		file = defile(file);
		file = enfile(9,file);
		//afficheF(file);
	}
	
	
	static public int[] enfile(int val,int[] list) {
		int tailleF=list.length;
		int newtaille=tailleF+1;
		int[] filetemp= new int[newtaille];
		filetemp[0]=val;
		for(int i=0;i<tailleF;i++) {
			filetemp[i+1]=list[i];
		}
		return filetemp;
	}
	
	
	static public int[] defile(int[] list) {
		int[] newlist = {};
		if(list == null ) {
			System.out.println("pas de valeur à defiler");
		} else {	
			int val;
			int tailleF=list.length;
			val = list[list.length-1];
			System.out.println("valeur défile");
			 System.out.println(val);
			if(list.length-1==0) {
				return newlist;
			} else {
				int newtaille=tailleF-1;
				newlist = new int[newtaille];
				for(int i=0;i<tailleF-1;i++) {
					newlist[i]=list[i];
				}
			}
		}
		return newlist;
	}
	
	// void afficheF(int[] list) {
		//
	//} 
}
