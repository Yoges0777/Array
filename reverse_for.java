
public class reverse_for {

	public static void main(String[] args) {
		
		int[]a= {11,22,44,55};
		
		
		int i=0;
		int j=a.length-1;
		
		for(;i<j;)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		for(int i1=0;i1<a.length;i1++)
		{
			System.out.print(a[i1]+" ");
		}
		

	}
}