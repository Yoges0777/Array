

public class minimundifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {1,2,3,4,5,6,7,8};
		
		int m=2;
		int n=4;
		
		int mindex=0;
		int nindex=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==m)
			{
				mindex=i;
				m=a[i];
				
				System.out.println(mindex);
				break;

			}
		}
	//	System.out.println(mindex);
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				nindex=i;
				n=a[i];
				System.out.println(nindex);
				break;

			}
		}
	//	System.out.println(nindex);
		
		System.out.println("diference between seeds is "+(nindex-mindex));
		
		

	}

}
