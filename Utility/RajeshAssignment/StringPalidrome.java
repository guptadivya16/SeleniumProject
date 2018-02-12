package RajeshAssignment;

public class StringPalidrome {

	public static void main(String[] args) {
		 String str = "madam";
		 String revStr ="";
		 int length = str.length();

		  for ( int i = length - 1; i >= 0; i-- )

		 {	 
			// System.out.println("Character "+str.charAt(i));
			 revStr =revStr+str.charAt(i);
		 }
		 System.out.println("Reverse String "+revStr);
		 //if(str==revStr)
		 if(str.equalsIgnoreCase(revStr))
		 {
			 System.out.println("String is Palidrome");
		 }
		 else
		 {
			 System.out.println("String is not Palidrome");
		 }
	}

}
