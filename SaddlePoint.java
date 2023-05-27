
public class SaddlePoint {

	public static void main(String[] args) 
	{
		int[][]a=       {
				{6,3,1},
				{9,7,8},
				{2,4,5}
				        };
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				int s=0;
				for(int k=0;k<a.length;k++)
				{
					if(a[i][j]>a[i][k])
					{
						s++;
					}
				}
				int l=0;
				for(int k=0;k<a.length;k++)
				{
					if(a[i][j]<a[k][j])
					{
						l++;
					}
				}
				if(s==0 && l==0)
				{
					System.out.println(a[i][j]);
					cnt++;
				}
			}
		}
		if(cnt==0)
		{
			System.out.println("no saddle poin");
		}
	}

}
