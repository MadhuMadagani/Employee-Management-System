package codeSnippets;


public class EvenOdd {
    public static void main(String[] args) {
    	int n = 11;
    	
    	if (n%2==0)         //% modulas operator
    	System.out.println("even");
    	
    	else
    	   System.out.println("odd");
    	
    	
    	for(int i=1;i<=10;i++) {  //print odd & even 1 to 10
    		if (i%2 ==0)
    		   System.out.println(i + "even");
    		
    		else
    		  System.out.println(i + "odd");
    	}
    	  
    	int[]arr = {10,12,15,20,33,40};   //find how many Even & Odd
    	int even = 0,odd=0;
    	for(int n1:arr) {
    		if(n1%2==0)
    			even++;
    			else
    				odd++;
    	}
    	
    	System.out.println(even + "even");
    	System.out.println(odd + "odd");
    	
    }
}
