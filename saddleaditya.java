

public class saddleaditya {

	public static void main(String[] args) {
		int[]a= {11,22,44,55,66,77};
		int ele=22;


		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele)
			{
				cnt++;
			}

		}
		
		int[]b=new int[a.length-cnt];
		
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=ele)
			{
				b[index++]=a[i];
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}

	}

}
