
public class uniquelement2 {

	public static void main(String[] args) {

		int []a= {10,10,50,60,70,80,70};
		int uniqucnt=0;
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=i-1;j>0;j--)
			{
				if(a[i]==a[j])
				{
					cnt++;
					break;
				}
			}
			if(cnt==0)
			{
				uniqucnt++;
			}
		}
		int [] b=new int[uniqucnt];

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
		for(int i=0;i<b.length;i++)
		{
         System.out.print(b[i]+" ");
		}
	}

}