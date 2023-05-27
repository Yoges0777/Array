

public class secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 45, 22, 15, 87, 67, 64 };
				int max = 0;
		for (int i = 0; i < a.length; i++) 
		{
                if (a[i] > max)
				max = a[i];
		}
			System.out.println(max);
		

		int secmax = 0;
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i] < max && a[i] > secmax) {
				secmax = a[i];
			}
		}

		System.out.println(secmax);
	
	}
}
