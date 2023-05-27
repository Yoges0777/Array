

public class print_unique_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={11,22,33,44,44,66};
		int[]b= new int[a.length];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=0;j<b.length;j++)
				if(a[i]==b[j])
				{
					cnt++;
				}
			if(cnt==0)
			{
				b[index++]=a[i];
			}
				
		}
		for(int i=0;i<index;i++)
		{
			System.out.println(b[i]);
		}
	}
}