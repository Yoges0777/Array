

public class delete_element {

	public static void main(String[] args) {

		int [] a= {10,20,30,40,50};
		int del=20;

		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==del)
			{

				for(int j=i;j<a.length-1;j++)
				{
					a[j]=a[j+1];
				}
				cnt++;

				break;
			}
		}
		if(cnt==0)
		{ 
			System.out.println("not found");
		}
		else
		{
			System.out.println("element deleted succesfully");
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]+" ");
			}
		}
	}

	

}


