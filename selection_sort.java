

public class selection_sort {

	public static void main(String[] args) {
		
		int[]a= {20,13,33,55,66,44};
		    //    0  1  2  3  4  5
		
		for(int i=0;i<a.length;i++)
		{
			int index=i;  //i=0 in this loop
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])  //11>22
				{
					index=j;   //index 1
				}
			}
			int temp=a[i];   //22
			a[i]=a[index];   //
			a[index]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
