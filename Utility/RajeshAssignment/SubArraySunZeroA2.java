package RajeshAssignment;

import java.util.Arrays;

public class SubArraySunZeroA2 {

	public static void main(String[] args)
	{

		int arr[] ={3,4,-7,3,1,3,1,-4,-2,-2};
		//int arr[] ={3,5,4,-7,1,53,1,4,2,2};
		
		int end =arr.length;
		for(int i=0;i<end;i++)
		{
			int sum=0;
			for (int j = i; j < end; j++) 
			{
				sum=sum+arr[j];
				if(sum==0)
				{
					System.out.println("Subarray [" +i+ ".. "+j );
					for (int j2 = i; j2 <= j; j2++)
					{
						 //System.out.println("array" +Arrays.toString(arr));
						 System.out.print(arr[j2]+" ");
					}
					System.out.println(" ");
				}
			}
		}
	}

}
