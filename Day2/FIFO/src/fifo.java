
public class fifo {
	static public void main(String argv[]) {
		int[] file = {};
		file = enfile(6,file);
		file = defile(file);
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
		if(list ==null ) {
			return list;
		} else {
			int[] newlist= {};			
			
			return newlist;
		}
	}
	
	// void afficheF(int[] list) {
		//
	//} 
}
