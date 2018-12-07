package exercice1;

public class Transform {
	public static final int[][] transform(int[][] a) {
		if (a.length==0) return new int[0][0];
		if (a[0].length==0) return new int[0][0];
		int[][] output = new int[a.length][a[0].length];
		for (int i=1;i<a.length-1; ++i) {
			for (int j=1; j<a[0].length-1; ++j) {
				output[i][j] = (
						a[i-1][j-1]+a[i-1][j]+a[i-1][j+1]+
						a[i][j-1]+a[i][j]+a[i][j+1]+
						a[i+1][j-1]+a[i+1][j]+a[i+1][j+1]
						)/9;
			}
		}
		for (int j=0;j<a[0].length;++j) {
			output[0][j] = a[0][j];
			output[a.length-1][j] = a[a.length-1][j];
		}
		for (int i=1;i<a.length-1;++i) {
			output[i][0] = a[i][0];
			output[i][a[0].length-1] = a[i][a[0].length-1];
		}
		return output;
	}

}
