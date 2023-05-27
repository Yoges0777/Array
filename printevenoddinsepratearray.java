

import java.util.Iterator;

public class printevenoddinsepratearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {11,22,11,22,44,55,66,88};

		int cnt=0; //even element
		int cntt=0;
		for(int i=0;i<a.length;i++)
		{if(a[i]%2==0)
		{
			cnt++;
		}
		else
		{	
			cntt++;
		}
		}

		int x[]=new int[cnt];
		int y[]=new int[cntt];

		int Eindex=0;
		int Oindex=0;
		for(int i=0;i<a.length;i++)
		{
			int temp=a[i];
			if(temp%2==0)
			{
				x[Eindex++]=temp;
			}
			else
			{
				y[Oindex++]=temp;
			}
		}
		for (int i = 0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println();

		for(int i=0;i<y.length;i++)
		{
			System.out.print(y[i]+" ");
		}
	}
}

