
public class SpiralArray {

	public static void main(String[] args) {

		int n=4;
		int[][]a=new int[n][n];
		int imin=0;
		int jmin=0;
		int imax=a.length-1;
		int jmax=a.length-1;
		
		int cnt=1;
	
		{
			for(int j=jmin;j<=jmax;j++)
			{
				a[imin][j]=cnt++;
			}
			imin++;
			
			
			

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();

		}

	}

}
}
