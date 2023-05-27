
public class character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[]s1= {'a','c','e','g','i'};
		char[]s2= {'b','d','f','h','j','f','g','h'};
		
		char[]s3=new char[s1.length+s2.length];
		
		int index=0;
		for(int i=0;i<s1.length || i<s2.length;i++)
		{
			if(i<s1.length)
			{
				s3[index]=s1[i];
				index++;
			}
			if(i<s2.length)
			{
				s3[index]=s2[i];
						index++;
			}
		}
		for (int i = 0; i < s3.length; i++) {
			
			System.out.print(s3[i]+" ");
			
		}

	}

}
