public Class multiply{


public static void main(String[] args){}

public static Double[][] multiplicar(Double A[][],Double B[][]){
    Double[][] C= new Double[2][2];
    int i,j,k;
     for (i = 0; i < 2; i++) {
         for (j = 0; j < 2; j++) {
             C[i][j] = 0.00000;
         }
     }
    for(i=0;i<2;i++){
        for(j=0;j<2;j++){
            for (k=0;k<2;k++){
                  C[i][j]+=(A[i][k]*B[k][j]);

            }

        }
    }
    return C;
}

}
