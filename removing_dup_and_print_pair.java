
public class removing_dup_and_print_pair {

	public static void main(String[] args) {
		int[]a= {1,1,2};
		
         int uniquecnt=0;
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
				uniquecnt++;
			}
			//System.out.println(a[i]);
		}
		//System.out.println(a[i]);
	System.out.println("uniquecnt is : "+uniquecnt);
		
		int[]b=new int[uniquecnt];
		
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
			for(int j=0;j<b.length;j++)
			{
				System.out.println(b[i]+" "+b[j]);
			}
		}
		
	}

}
