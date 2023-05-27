

public class adding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {4,1,5,7,9};
		int[]b= {50,60,70,80,90};
		int c[]=new int [a.length+b.length];

		int index=0;
		for(int i=0;i<a.length;i++)
		{
			c[index++]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[index++]=b[i];
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}

}
