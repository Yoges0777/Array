

public class twoDarray {

	public static void main(String[] args) {

		int[][]a= 
			{ 
				//   0 1 2
					{1,2,3},
					{4,5,6},
					{10,11,12},
			};
		
		for(int row=0;row<a.length;row++)
		{
			for(int col=0;col<a.length;col++)
			{
				System.out.print(a[row][col]+" ");
			}
			System.out.println();
		}

	}

}
