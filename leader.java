

public class leader {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int []a= {98,45,25,86,44,};
		
		for(int i=0;i<a.length;i++)
			
		{
			int cnt=0;
		    for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					cnt++;
					//break;
				}
			}
		    if(cnt==0)
		    {
		    	System.out.println(a[i]);
		    }
		}
		

	}

}
