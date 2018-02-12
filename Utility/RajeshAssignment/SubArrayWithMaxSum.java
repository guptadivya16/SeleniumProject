package RajeshAssignment;

public class SubArrayWithMaxSum {
	public static void main(String[] args)
	{
		
		int arr[] ={-2,1,-3,4,-1,2,1,-5,-4};
		//int arr[] ={3,5,4,-7,1,53,1,4,2,2};
		int max=arr[0];
		int end =arr.length;
		
		for(int i=0;i<end;i++)
		{
			int sum=0;
			for (int j = i; j < end; j++) 
			{
				sum=sum+arr[j];
				if(sum>max)
				{
					max=sum;
				
				}
			}
		}
		System.out.println("max " +max);
		
	}
}
