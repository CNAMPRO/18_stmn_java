package exercice1;

public class transform 
{
	public static final int[][] transform(int[][] a)
	{
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i< b.length; i++)
		{
			for (int j=0; j<b[i].length; j++)
			{
				if(0 < j && j<=a.length-2 && 0 < i && i<=a[0].length-2)
					b[i][j] = (a[i-1][j]+a[i][j-1]+a[i][j]+a[i][j+1]+a[i+1][j])/5;
				else b[i][j] = a[i][j];
			}
		}
		return b;
		
		
	}


public static void main(String [ ] args)
{
	int [][] matrix = new int[5][5];
	for(int i = 0; i < matrix.length; i++)
	{
        for(int j = 0; j < matrix[i].length; j++)
        {
          matrix[i][j] = 0;
        }
     }
	matrix[2][2]=360;
	
	matrix=transform(matrix);
	
	for (int i = 0; i< matrix.length; i++)
	{
		for (int j=0; j<matrix[i].length; j++)
		{
			 System.out.print(matrix[i][j]+ ",");
		}
		System.out.println("");
	}
}


}