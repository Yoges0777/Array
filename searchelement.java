

public class searchelement {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int []a= {10,20,30,40,40};
		int ele=40;
		
		int cnt=0;
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			int temp=a[i];
			
			if(temp==ele)
			{
				index=i;
				cnt++;
				//break;
			System.out.println("found at : "+index);
			}
		}
		if(cnt==0)
		{
			System.out.println("no found");
		}
		
	}

}
