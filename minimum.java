

public class minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {9,4,3,4,8,8};
		int min=a[0];//9
		
		for(int i=0;i<a.length;i++)
		{
		if(a[i]<min)//1<1
		{
			min=a[i];
		}
		
		}
		System.out.println("minimum elment is : "+min);
		

	}

}
