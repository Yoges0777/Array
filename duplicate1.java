

public class duplicate1
{
	public static void main(String[] args)
	{
		int[] a = { 1,5,5,3,2,1};
		int count = 0;// for unique element
		for (int i = 0; i<a.length; i++) 
		{
			int cnt = 0; // for duplicate element
			for (int j=0;j<i;j++) 
			{
				if (a[i]==a[j])
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				count++;
			}
		}
		int []b=new int[count];
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
		for (int i = 0; i < b.length; i++) 
		{
			System.out.print(b[i]+" ");
			
		}

	}

}


