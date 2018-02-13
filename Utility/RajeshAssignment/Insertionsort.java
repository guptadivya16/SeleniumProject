package RajeshAssignment;

public class Insertionsort {

	public static void main(String[] args) {
		int[] arr = { 81, 22, 38, 91, 5}; 
		  int i,j,temp = 0;
		  int length =arr.length -1;
		  System.out.println("Length of Array" +length);
		  
		 int key;
		   for (i = 1; i <=length; i++)
		   {
		       key = arr[i];
		       j = i-1;
		 
		       /* Move elements of arr[0..i-1], that are
		          greater than key, to one position ahead
		          of their current position */
		       while (j >= 0 && arr[j] > key)
		       {
		           arr[j+1] = arr[j];
		           j = j-1;
		       }
		       //arr[j+1] = key;
		   }
		   
		   for (i = 0; i <=length; i++)
		   {
			   System.out.println(arr[i]);
		   }
	}
	
}
