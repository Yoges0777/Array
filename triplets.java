import java.util.Iterator;

public class triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub,
		int[][]a=   {
			     	{1,2,3,4},
			     	{4,5,6,5},
			     	{7,8,9,8},
			     	{4,5,7,8}
		                };
		
		int sum=0;
		int cnt=0;
		for(int i=1;i<a.length-1;i++)
		{
			for(int j=1;j<a.length-1;j++)
			{
				sum=sum+a[i][j];
				cnt++;
			}
		
		}
		System.out.print(sum);
		double avg=sum/cnt;
		
		
		
	}
}