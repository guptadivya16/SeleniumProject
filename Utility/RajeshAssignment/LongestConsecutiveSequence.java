package RajeshAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class LongestConsecutiveSequence {

	public static void main(String[] args) 
	{
	   
	     Scanner scan = new Scanner(System.in); 
	     System.out.println("Enter number of element in an array");
	     
	     int x=scan.nextInt();
	     int[] array= new int[x];
	     
	     for(int i=0;i<array.length;i++)
	     {
	         array[i]=scan.nextInt();
	     }
	      // System.out.println(array(array));
	     System.out.println(Arrays.toString(array));
	     System.out.println(array(array));
	}
	
	//System.out.println(Arrays.toString(array));
	public static int array(int[] array)
	{
	    int count=0,temp=0;
	    for(int i=0;i<array.length;i++)
	    {
	        count=0;
	        for(int j=i,k=i+1;j<array.length-1;j++,k++)
	            if(array[j]-array[k]==-1)
	                count++;
	            else
	            {
	            if(temp<count)
	                temp=count;
	            break;
	            }
	    }
	    return temp+1;	  
	 } 
}

//input: [100, 1, 2, 3, 4, 200]
//output: 4

