package exercice2;

public class MaskedImage {
	
	private int [][]pixels;
	public boolean[][] inclusionMask ;
	
	public MaskedImage(int [][] input)
	{
		this.pixels = input;
		inclusionMask = new boolean[pixels.length][pixels.length];
		this.initMask();
	}
	
	private void initMask()
	{
		for(int i = 0;i<this.pixels.length;i++)
		{
			for(int j = 0;j<this.pixels.length;j++)
			{
				this.inclusionMask[i][j]=true;
			}
		}
	};
	public int[][] getPixels()
	{
		int result[][] = new int[this.pixels.length][this.pixels[0].length]; 
		for(int i = 0;i<this.pixels.length;i++)
		{
			for(int j = 0;j<this.pixels.length;j++)
			{
				result[i][j] = (this.inclusionMask[i][j])?this.pixels[i][j]:0;
			}
			
		}
		return result;
	};
	
	public void setInclusionMask(boolean[][] mask) {
		this.inclusionMask = mask;
	}


}
