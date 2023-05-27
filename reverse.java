

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,40,50};
		int i=0;
		int j=a.length-1;
		while(i<j)
		{
			int temp=a[i];//10
		    a[i]=a[j];    //50
		    a[j]=temp;    //10
		
	     	i++;
		    j--;
		}
		for(int j2=0;j2<a.length;j2++)
		{
			System.out.print(a[j2]+" ");
		}
		
		
	}

}
