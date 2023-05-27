

public class rotatetr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {11,22,33,44,55};
		int temp=a[a.length-1]; //this is the last element
		for(int i=a.length-1;i>0;i--)//we are strting loop from
		{
			a[i]=a[i-1];//i=5-1
		}
		a[0]=temp;//55
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
