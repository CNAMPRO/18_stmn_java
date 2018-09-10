public class Multiply{


public static void main(String[] args){


	
}

public static double[][] multiplicar(double A[][],double B[][]){
	
    double[][] C= new double[A.length][B[0].length];
    int i,j,k;
    /*
     for (i = 0; i < A.length; i++) {
         for (j = 0; j < B[0].length; j++) {
             C[i][j] = 0.00000;
         }
     } */
    for(i=0;i<A.length;i++)
        for(j=0;j< B[0].length;j++)
            for (k=0;k<B.length;k++)
                  C[i][j]+=(A[i][k]*B[k][j]);
    return C;
}
}
