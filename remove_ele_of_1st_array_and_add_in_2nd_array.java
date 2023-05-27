

public class remove_ele_of_1st_array_and_add_in_2nd_array {
	public static void main(String[] args) 
	{
     int a[]= {1,1,1,1,1,2,2,3,4,4,4};
     int b[]= {1,2,4};
     
     
     for(int i=0;i<b.length;i++)
     {
    	 int cnt=0;
    	 for(int j=0;j<a.length;j++)
    	 {
    		 if(b[i]==a[j] && cnt<2)
    		 {
    			 cnt++;
    		 }
    	 }
    	 int[]c=new int[a.length-cnt];
    	 int index=0;
    	 int count=0;
    	 for(int j=0;j<a.length;j++)
    	 {
    		 if(b[i]==a[j] && count<2)
    		 {
    			 count++;
    		 }
    		 else
    		 {
    			 c[index++]=a[j];
    		 }
    	 }
    	 a=c;
     
     }
     for(int i=0;i<a.length;i++)
     {
    	 System.out.println(a[i]+" ");
     }

	}
}
