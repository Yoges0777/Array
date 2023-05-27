
public class remove_specefic_element_print_array {

	public static void main(String[] args) {
		int[]a={1,2,3,4,5,6};
		int ele=2;
		
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele)
			{
				cnt++;
			}
		}
		
		int []b=new int[a.length-cnt];
		
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
			System.out.print(b[i]);
		}

	}

}
