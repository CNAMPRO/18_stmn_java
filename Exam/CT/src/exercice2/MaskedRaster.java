package exercice2;

public class MaskedRaster implements IRasterBuffer{
	private int[][] data;
	private boolean[][] exclusionMask;
	public MaskedRaster(int[][] input)
	{
		this.data = input;
		this.initMask();
	}
	
	private void initMask()
	{
		exclusionMask = new boolean[this.data.length][this.data[0].length];
		for(int i =0; i<this.data.length;i++)
		{
			for(int j = 0; j<this.data[0].length;j++)
			{
				this.exclusionMask[i][j] = true;
			}
		}
	}
	
	public void setExclusionMask(boolean[][] maskinput)
	{
		this.exclusionMask = maskinput;
	}
	
	public int[][] getBits()
	{
		int[][] result = new int[this.data.length][this.data[0].length];
		for(int i =0; i<this.data.length;i++)
		{
			for(int j = 0; j<this.data[0].length;j++)
			{
				if(this.exclusionMask[i][j] == false)
					result[i][j] = this.data[i][j];
				else	
					result[i][j] = 0;
			}
		}
		
		return result;
	}

	@Override
	public int[][] getValues() {
		
		return getBits();
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return this.data.length;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return this.data[0].length;
	}
	
	public void transform()
	{
		
		int[][] result = data;
		for (int i = 0; i< data.length;i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.println("i : " + i + ":  j : " + j);
				if (i >= 1 && i <= data.length - 2 && j >= 1 && j <= data[0].length - 2) {
					result[i][j] = (data[i - 1][j - 1] + data[i + 1][j - 1] + data[i][j] + data[i + 1][j + 1]
							+ data[i - 1][j + 1]) / 5;
				} else {
					result[i][j] = data[i][j];
				}
					
			}
		
		}
		data = result;
	}

}

