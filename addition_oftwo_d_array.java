

public class addition_oftwo_d_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]a= {{1,2,3},{1,2,3},{4,5,6,8}};
		int[][]b= {{2,2,4},{3,2,5},{5,6,7,6}};

		int c[][]=new int[a.length][a[0].length];

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
		System.out.println();
		}

	}

}
