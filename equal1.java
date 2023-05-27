

public class equal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {10,20,30,40,50};
		int[]b= {10,20,30,40,50};
		
		if(a.length==b.length) //check array size is same
		{
			int cnt=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])//to check arrays element equal or not
				{
					cnt++;
					break;
				}
			}
			if(cnt==0)
				System.out.println("array equal");
			else
				System.out.println("array not equal");
		}
		else
			System.out.println("not equal");
			
			

	}

}
