package codeSnippets;


public class Palindrome {
     /* public static void main(String[] args) {
    	 // Check whether a string is palindrome or not
    	 String str = "madhu";
    	 String reversed = "";
    	 for(int i = str.length() -1;i >= 0;i--) {
    		 reversed += str.charAt(i);
    	 }
    	 if(str.equals(reversed))
    	  System.out.println("palindrome");
    	 else
    	  System.out.println("Not palindrome");
    	 
    	 */
	    public static void main(String[] args) {
	        String str = "madam";
	        String rev = "";

	        for (int i = str.length() - 1; i >= 0; i--) {
	            rev += str.charAt(i);
	        }

	        if (str.equals(rev))
	            System.out.println("Palindrome");
	        else
	            System.out.println("Not Palindrome");
	        
	        
	        String st = "mahesh";
	        String rv = "";
	        
	        for(int j = st.length() -1; j >= 0; j--) {
	        	rv += st.charAt(j);
	        }
	        
	        if(st.equals(rv))
	        	System.out.println("Palindrome is right");
	        else
	        	System.out.println("Palindrome is Wrong");
	        
	    }
	

      }

