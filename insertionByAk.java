import java.util.Arrays;

public class insertionByAk {

	public static void main(String[] args) {
		int[]a= {5,4,3,7,8,4,5,7};
		
		for(int i=0;i<a.length;i++)
		{
			int j=i-1;
			for( ;j>=0;j--)
			{
				if(a[j]<a[i])
				break;
			}
			int first=j+1;
			int last=i;
			int temp=a[last];
			
			for(int k=0;k<a.length;i++)
			{
				a[k]=a[k-1];
			}
			a[first]=temp;
		}
		System.out.print(Arrays.toString(a));

	}

}
