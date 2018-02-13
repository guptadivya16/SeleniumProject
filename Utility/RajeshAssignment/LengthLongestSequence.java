package RajeshAssignment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
public class LengthLongestSequence {
    public static void main(String[] args) {
        int arr[]={10,21,45,22,7,2,67,19,13,45,12,11,18,16,17,100,201,20,101};
        System.out.println("Length of sequence:"+findLengthLongestSequence(arr));
    }
 
    private static int findLengthLongestSequence(int[] arr) {
       Set<Integer> set=new HashSet<Integer>();
//add it to the set to avoid the duplicates
       for(int i:arr){
           set.add(i); 
       }
       int max=0;
       int start=0; // to store the first element of the longest sequence
       for(int i:arr){
           int left=i-1;
           int right=i+1;
           int count=1;
           while(set.contains(left)){
               set.remove(left--);
               count++;
           }
           while(set.contains(right)){
               set.remove(right++);
               count++;
           }
           
           if(max<count){
               max=count;
               start=left+1;
           }
       }
       System.out.println("Sequence:");
       for(int i=start;i<start+max;i++){
           System.out.print(i+" ");
       }
       System.out.println();
       return max;
    }
}