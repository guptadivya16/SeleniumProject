package RajeshAssignment;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		 int[] a = { 81, 22, 38, 91, 5, 38, 7, 16, 38, 10}; 
		  int i,j,num=60;
		  int end =a.length;
		  
		  System.out.println("Length of Array" +end);
		  
		  for(i=0;i<end;i++)
		  {
			  for(j=i+1;j<end;j++ )
			  {
				if (a[i] == a[j]) 
				{                  
                	int shiftLeft = j;
                	for (int k = j+1; k < end; k++, shiftLeft++)
                	{
                	a[shiftLeft] = a[k];
                	}
                end--;
               
               // j--;
				}
			  }
			  System.out.println("Length of Array 2 " +end);
		  }
		  
		  int[] whitelist = new int[end];
		    for(i = 0; i < end; i++)
		    {
		        whitelist[i] = a[i];
		        System.out.print(" " +whitelist[i]);
		    }
	}

}

