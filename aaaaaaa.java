import java.util.Iterator;

public class aaaaaaa 
{

	public static void main(String[] args) 
	{
		int []a= {1,2,3,4,5,6};
		for (int i = 0; i < a.length; i++) 
		{
			int cnt=0;
			for (int j = 0; j < a.length; j++) 
			{
				if (a[i]==a[j]) 
				{
					cnt++;
				}
			}
			if (cnt==0) 
			{
				for (int j = 0; j < a.length; j++)
				{
					System.out.println();
				}
			}
		}
	}


}	

