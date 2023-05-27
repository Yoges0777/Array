

public class printunique 
{
	public static void main(String[] args) 
	{
		int[]a={1,5,5,3,2,1};
		int ucnt=0;
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=i-1;j>0;j--)
			{
				if(a[i]==a[j])
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				ucnt++;
			}
		}
		int []b=new int[ucnt];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				b[index++]=a[i];
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
			
		}
	}
}