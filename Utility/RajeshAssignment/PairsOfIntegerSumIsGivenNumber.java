package RajeshAssignment;

public class PairsOfIntegerSumIsGivenNumber {

	public static void main(String[] args) {
		 int[] a = { 81, 22, 38, 91, 5, 77, 7, 16, 44, 10}; 
		  int i,j,num=60;
		  int length =a.length -1;
		  
		  System.out.println("Length of Array" +length);
		  
		  for(i=0;i<=length;i++)
		  {
			  for(j=i+1;j<=length;j++ )
			  {
				  if((a[i]+a[j])==60)
					  System.out.println("integer pair ["+a[i] +"," +a[j]+"]");
			  }
		  }

	}

}
