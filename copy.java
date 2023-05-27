

public class copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,1,1,0,1,2,1,};
		
		int[]b=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(b[i]);
		}
	}

}
