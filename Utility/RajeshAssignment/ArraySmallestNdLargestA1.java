package RajeshAssignment;

import java.util.Arrays;

public class ArraySmallestNdLargestA1 {

	public static void main(String[] args) {
		
		  int[] a = { 81, 22, 38, 91, 5, 77, 7, 16, 44, 10}; 
		  int i,j,temp;
		  int length =a.length -1;
		  System.out.println("Length of Array" +length);
		  for(i=0;i<length;i++)
		  {
			  for(j=0;j<(length-i);j++ )
			  {
				  if(a[j]>a[j+1])
				  {
					 temp=a[j];
					 a[j]=a[j+1];
					 a[j+1]=temp;		 
				  }
			  }
		  }
		  System.out.println(Arrays.toString(a));
		  
		  System.out.println("Smallest number in an Array " +a[0]);
		  System.out.println("Lagest number in an Array " +a[length]);
		
	}

}
