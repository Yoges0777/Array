


public class reptoleft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {4,1,5,7,9};
		//1,5,7,9,4
		int temp=a[0];
		
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
