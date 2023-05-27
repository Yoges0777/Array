

public class OddEven4 {

	public static void main(String[] args)
	{
		int[] a = { 11, 22, 33, 44, 55, 66 };

		int[] b = new int[a.length];

		int index = 0;
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i] % 2 == 0) {
				b[index++] = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i] % 2 != 0) {
				b[index++] = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(b[i] + " ");
		}

	}

}
